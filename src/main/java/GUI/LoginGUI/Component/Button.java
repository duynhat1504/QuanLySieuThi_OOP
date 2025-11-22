package GUI.LoginGUI.Component;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button() {
        setFont(new Font("Calibri", Font.PLAIN, 14));
        setBackground(Color.decode("#A9F0A8"));
        setForeground(Color.black);
        this.setUI(new ButtonUI());
    }
}
