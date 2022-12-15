package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fnum = (int) (Double.parseDouble(tfNumber1.getText()));
                double snum = (int) (Double.parseDouble(tfNumber2.getText()));
                double res;
                String op = cbOperations.toString();
                switch (op){
                    case "+":
                        res = fnum + snum;
                        lblResult.setText(String.valueOf(res));
                        break;
                    case "-":
                        res = fnum - snum;
                        lblResult.setText(String.valueOf(res));
                        break;
                    case "*":
                        res = fnum * snum;
                        lblResult.setText(String.valueOf(res));
                        break;
                    case "/":
                        res = fnum / snum;
                        lblResult.setText(String.valueOf(res));
                        break;
                }
            }
        });
    }

    public static void main(String[] args){
        JFrame a = new SimpleCalcGUI("Simple Calculator");
        a.setVisible(true);
    }
}
