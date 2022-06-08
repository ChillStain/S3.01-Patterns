public class Start implements VehicleActions{

    @Override
    public void actionExecution(Vehicle vehicle) {
        System.out.println("The "+vehicle.getVehicleType() + " it's on.");
    }
}