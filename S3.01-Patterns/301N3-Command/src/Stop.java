public class Stop implements VehicleActions{

    @Override
    public void actionExecution(Vehicle vehicle) {
        System.out.println("The " + vehicle.getVehicleType() + " it's stoped.");
    }
}