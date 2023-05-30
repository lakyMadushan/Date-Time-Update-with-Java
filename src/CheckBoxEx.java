import javax.swing.*;
public class CheckBoxEx {
   CheckBoxEx() {
        JFrame f = new JFrame("CheckBox Example");
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

        JCheckBox c1 = new JCheckBox("C++");
        c1.setBounds(100,100,50,50);
        f.add(c1);

        JCheckBox c2 = new JCheckBox("Java",true);
        c2.setBounds(100,150,100,50);
        f.add(c2);



    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
