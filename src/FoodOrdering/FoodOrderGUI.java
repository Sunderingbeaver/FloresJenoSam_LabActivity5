package FoodOrdering;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rnNone;
    private JButton orderButton;
    private JCheckBox cBurder;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JPanel cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args){
        JFrame a = new SimpleCalcGUI("Food Ordering System");
        a.setVisible(true);
    }
}
