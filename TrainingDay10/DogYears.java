import java.awt.*;
import javax.swing.*;
public class DogYears extends JFrame {
    private JTextField _humanYearsTF = new JTextField(3);
    private JTextField _dogYearsTF = new JTextField(3);
    public DogYears(){
        JButton convertBtn = new JButton("Convert");

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        content.add(new JLabel("Dog Years"));
        content.add(_dogYearsTF);
        content.add(convertBtn);
        content.add(new JLabel("Human Years"));
        content.add(_humanYearsTF);

        setContentPane(content);
        pack();

        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String args[]){
        DogYears window = new DogYears();
        window.setVisible(true);
    }
}
