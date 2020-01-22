package patronaf;

public class Main {

    public static void main(String[] args) {
        // Creamos un cliente
        Client cliente;
        // Creamos una fábrica
        GUIFactory factory;
        // Nombre del sistema operativo
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("windows")){
            factory = new WindowsFactory();
            cliente = new Client(factory);
        } else {
            factory = new MacFactory();
            cliente = new Client(factory);
        }
    }
    
    
}
