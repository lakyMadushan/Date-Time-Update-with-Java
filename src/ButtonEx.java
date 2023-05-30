import javax.swing.*;
public class ButtonEx {
    public static void main(String[] args) {

        JFrame f = new JFrame("Button Example"); //create object frame

        JButton b = new JButton("Click Here"); //create instance button
        b.setBounds(50,50,95,30); //x axis, y axis, width, height
        f.add(b); //adding button in JFrame
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        JLabel l1;
        l1 = new JLabel("First Label");
        l1.setBounds(50,25,100,30);
        f.add(l1);

        JTextField t1;
        t1 = new JTextField("Welcome to Java points");
        t1.setBounds(50,100,200,30);
        f.add(t1);

        JTextArea textArea = new JTextArea("Welcome");
        textArea.setBounds(50,150,200,200);
        f.add(textArea);

        JPasswordField pa;
        pa = new JPasswordField("password");
        pa.setBounds(50,200,100,50);
        f.add(pa);
    }
}
