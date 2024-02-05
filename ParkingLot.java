public class ParkingLot {
    public ParkingSpot[] spots;

    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++){
            if (i > 1){
                this.spots[i] = new ParkingSpot(false);
            }
            else{
                this.spots[i] = new ParkingSpot(true);
            }

        }

    }

    public String toString(){

        int handiSpots = 0;

        int unHandiSpots = 0;

        for (int i = 0; i < 2; i++){
            if (this.spots[i].parkedCar == null){
                handiSpots++;
            } 
        }

        for (int i = 2; i < 10; i++){
            if (this.spots[i].parkedCar == null){
                unHandiSpots++;
            }

        }

        return handiSpots + " " + unHandiSpots;

    }
    
    public int park(Car car){

        if (car.handicap == false){
            for (int i = 2; i < 10; i++){
                if (this.spots[i].parkedCar == null){
                    this.spots[i].parkedCar = car;

                    return i;
                }
            }

        }

        else{
            for (int i = 0; i < 10; i++){
                if (this.spots[i].parkedCar == null){
                    this.spots[i].parkedCar = car;

                    return i;
                }
            }

        }

        return 10;
    }

    public Car unpark(int index){

        Car unParkedCar = this.spots[index].parkedCar;

        this.spots[index].parkedCar = null;

        return unParkedCar;
    }
}
