package patronaf;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        System.out.println("creando un botón para Windows");
        return new WindowsButton();
    }

    @Override
    public ComboBox createComboBox() {
        System.out.println("cerando un combobox para Windows");
        return new WindowsComboBox();
    }
    
}
