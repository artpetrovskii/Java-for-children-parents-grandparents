import javax.swing.*;
import java.awt.GridLayout;	

public class SimpleCalculatorGrid {
public static void main(String[] args) {

//Creating panel
JPanel windowContent = new JPanel();

//Manager 
GridLayout gl = new GridLayout(4,2);
windowContent.setLayout(gl);

//Creating components in memory
JLabel label1 = new JLabel("Number 1:");
JTextField field1 = new JTextField(10);
JLabel label2 = new JLabel("Number 2:");
JTextField field2 = new JTextField(10);
JLabel label3 = new JLabel("Sum:");
JTextField result = new JTextField(10);
JButton go = new JButton("Add");

//Adding components on panel
windowContent.add(label1);
windowContent.add(field1);
windowContent.add(label2);
windowContent.add(field2);
windowContent.add(label3);
windowContent.add(result);
windowContent.add(go);

//Creating frame and panel for it
JFrame frame = new JFrame("My First Calculator");
frame.setContentPane(windowContent);

//Adding size and showing window
frame.setSize(800,200);
frame.setVisible(true);
   }
}
