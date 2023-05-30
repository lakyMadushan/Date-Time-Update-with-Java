import javax.swing.*;
public class Password {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        JLabel l1 = new JLabel("User Name: ");
        l1.setBounds(25,50,100,30);
        f.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(100,50,150,30);
        f.add(t1);

        JLabel l2 = new JLabel("Password: ");
        l2.setBounds(25,100,100,30);
        f.add(l2);

        JPasswordField p2 = new JPasswordField();
        p2.setBounds(100,100,150,30);
        f.add(p2);

        JButton b = new JButton("Log");
        b.setBounds(100,150,100,30);
        f.add(b);



    }

}
