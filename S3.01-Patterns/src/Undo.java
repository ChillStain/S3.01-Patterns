import java.util.ArrayList;

public class Undo {


    //declaración
    private static Undo instance;
    private static ArrayList<String> commands = new ArrayList<String>();

    //evita la instancia "new" a cada rato
    private Undo (){

    }

    //con este método se obtiene la instancia x el "static" para poder acceder class.getInstance
    public static Undo getInstance() {
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    //método para guardar el comando
    public void saveCommand(String command) {

        commands.add(command);
    }

    //método para mostrar los comandos guardados
    public void listCommands() {

        System.out.println(commands);
    }

    //método para borrar el último comando a modo de función undo (ctrl z)
    public void deleteCommand() {
        if (commands.isEmpty()==false) {
            commands.remove(commands.size()-1);
        }
    }

}
