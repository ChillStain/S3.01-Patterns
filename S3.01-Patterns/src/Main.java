public class Main {
    public static void main(String[]args) {

        Undo f = Undo.getInstance();

        f.saveCommand("ctrl + s");
        f.saveCommand("ctrl + c");
        f.saveCommand("ctrl + v");

        f.deleteCommand();

        Undo s = Undo.getInstance();

        s.listCommands();
    }
}
