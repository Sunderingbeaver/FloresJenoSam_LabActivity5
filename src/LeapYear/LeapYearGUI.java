package LeapYear;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JField text to double
                int tempyear = 0;
                boolean bool = true;
                do {
                    try {
                        tempyear = (int) (Double.parseDouble(tfYear.getText()));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a number!");
                        bool = false;
                    }
                    if(bool == false){
                        break;
                    }
                    } while(bool == false);
                    if(tempyear%100 != 0 && bool != false) {
                        int year = tempyear % 4;
                        if (year == 0) {
                            JOptionPane.showMessageDialog(null, "Leap Year");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not a leap Year");
                        }
                    } else if (tempyear%100==0 && bool != false){
                        int year = tempyear % 400;
                        if (year == 0) {
                            JOptionPane.showMessageDialog(null, "Leap Year");
                        } else {
                            JOptionPane.showMessageDialog(null, "Not a leap Year");
                        }
                    }
            }
        });
    }
    public static void main(String[] args){
        JFrame a = new LeapYearGUI("Leap Year Checker");
        a.setVisible(true);
    }
}


