public class SpeedUp implements VehicleActions{

    @Override
    public void actionExecution(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " is accelerating.");
    }
}