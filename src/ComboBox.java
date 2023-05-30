import javax.swing.*;
public class ComboBox {
    ComboBox(){

        JFrame f = new JFrame("CheckBox Example");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        String Subject[] = {"Econ", "Maths", "Account","ICT"};
        JComboBox cb = new JComboBox(Subject);
        cb.setBounds(100,200,100,25);
        f.add(cb);
    }
    public static void main(String[] args) {
        new ComboBox();
    }
}
