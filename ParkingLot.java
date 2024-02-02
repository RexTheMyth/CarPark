public class ParkingLot {
    public ParkingSpot[] spots;

    public ParkingLot(){
        this.spots = new ParkingSpot[10];
        for (int i = 0; i < 10; i++){
            if (i > 2){
                this.spots[i] = new ParkingSpot(false);
            }
            else{
                this.spots[i] = new ParkingSpot(true);
            }

        }

    }

    public String toString(){

        return"";

    }
    
}
