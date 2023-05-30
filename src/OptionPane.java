import javax.swing.*;
public class OptionPane { //we can get message box
    JFrame f;
        OptionPane(){
            f = new JFrame();
            JOptionPane.showMessageDialog(f, "Hello, Welcome to Javapoint.");
            JOptionPane.showMessageDialog(f,"Successfully Updated","Alert",JOptionPane.WARNING_MESSAGE);
            String name = JOptionPane.showInputDialog(f,"Enter Name");
        }

    public static void main(String[] args) {
        new OptionPane();
    }

}
