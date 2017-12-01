import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JTextField;


public class butonlayout63 extends JFrame {
    public butonlayout63() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextField [] textarray = new JTextField[4];
        for(int i=0; i<textarray.length; i++) {
            textarray[i] = new JTextField(10);
            panel.add(textarray[i]);
        }

        setSize(200,75);
        setTitle("Text Fields");
        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        new butonlayout63();
    }
}
