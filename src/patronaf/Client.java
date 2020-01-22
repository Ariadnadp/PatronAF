package patronaf;

public class Client {
    private final Button button;
    private final ComboBox combobox;

    public Client(GUIFactory factory) {
        this.button = factory.createButton();
        this.combobox = factory.createComboBox();
    }
    
    public void paint(){
        button.paint();
        combobox.paint();
    }
}
