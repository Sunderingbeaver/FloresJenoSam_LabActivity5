package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.channels.IllegalSelectorException;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                boolean bool = true;
                do {
                    try {
                        if (cPizza.isSelected()) {
                            sum += 100;
                        }
                        if (cBurger.isSelected()) {
                            sum += 80;
                        }
                        if (cFries.isSelected()) {
                            sum += 65;
                        }
                        if (cSoftDrinks.isSelected()) {
                            sum += 55;
                        }
                        if (cTea.isSelected()) {
                            sum += 50;
                        }
                        if (cSundae.isSelected()) {
                            sum += 40;
                        }
                        if (rbNone.isSelected()) {
                            sum = sum;
                        }
                        if (rb5.isSelected()) {
                            double minus = sum * .05;
                            sum = sum - minus;
                        }
                        if (rb10.isSelected()) {
                            double minus = sum * .1;
                            sum = sum - minus;
                        }
                        if (rb15.isSelected()) {
                            double minus = sum * .15;
                            sum = sum - minus;
                        }
                        if (!cPizza.isSelected() && !cTea.isSelected() && !cSundae.isSelected() && !cFries.isSelected() && !cBurger.isSelected() && !cSoftDrinks.isSelected()) {
                            throw new IllegalSelectorException();
                        }
                    } catch (IllegalSelectorException ex) {
                        JOptionPane.showMessageDialog(null, "No order selected!");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, String.format("%.2f", sum));
                }while(bool = false);
            }
        });
    }

    public static void main(String[] args){
        JFrame a = new FoodOrderGUI("Food Ordering System");
        a.setVisible(true);
    }
}

