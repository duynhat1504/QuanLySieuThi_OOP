
// import BUS.AccountServices.LoginAction;
// import GUI.SaleGroup.LoginGui.LoginFrame.LoginGui;
import com.formdev.flatlaf.FlatLightLaf;
import GUI.LoginGUI.LoginFrame.LoginGui;

public class App {
    public static void main(String[] args) {
        FlatLightLaf.setup();
        new LoginGui();
    }
}
