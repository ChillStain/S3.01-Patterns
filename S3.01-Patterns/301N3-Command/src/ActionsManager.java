//se encarga de ejecutar cada una de las acciones/tareas
public class ActionsManager {

    public void actionEjecution(VehicleActions action, Vehicle v) {

        action.actionExecution(v);
    }
}