import java.util.ArrayList;
import java.util.List;
//agrupacion de tareas

public class SuperAction implements VehicleActions{

    private List<VehicleActions> list = new ArrayList<VehicleActions>();

    public void addAction(VehicleActions action) {
        list.add(action);
    }

    @Override
    public void actionExecution(Vehicle vehicle) {
        list.forEach((t) -> t.actionExecution(vehicle));
    }
}