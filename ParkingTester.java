public class ParkingTester{
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();

        System.out.println(parkingLot.toString());

        Car firstCar = new Car("Infiniti", "A", true);

        parkingLot.park(firstCar);

        System.out.println(parkingLot.toString());

        Car secondCar = new Car("Cadiliac", "B", false);

        parkingLot.park(secondCar);

        System.out.println(parkingLot.toString());

        parkingLot.unpark(0);

        System.out.println(parkingLot.toString());

    }
}