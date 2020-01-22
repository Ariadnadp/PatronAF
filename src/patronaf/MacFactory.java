package patronaf;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        System.out.println("creando un botón para Mac");
        return new MacButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("creando un combobox para Mac");
        return new MacComboBox();
    }
    
}
