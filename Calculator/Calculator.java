import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
JButton button0 = new JButton("0");
JButton button1 = new JButton("1");
JButton button2 = new JButton("2");
JButton button3 = new JButton("3");
JButton button4 = new JButton("4");
JButton button5 = new JButton("5");
JButton button6 = new JButton("6");
JButton button7 = new JButton("7");
JButton button8 = new JButton("8"); 
JButton button9 = new JButton("9");
JButton buttonPoint = new JButton(".");
JButton buttonEqual = new JButton("=");
JButton buttonPlus = new JButton("+");
JButton buttonMinus = new JButton("-");
JButton buttonDivide = new JButton("/");
JButton buttonMultiply = new JButton("*");
JPanel windowContent = new JPanel();
JTextField displayField = new JTextField(30);
Calculator(){
BorderLayout bl = new BorderLayout();
windowContent.setLayout(bl);
windowContent.add("North",displayField);
JPanel pl = new JPanel();
GridLayout gl = new GridLayout(4,3);
pl.setLayout(gl);
pl.add(button1);
pl.add(button2);
pl.add(button3);
pl.add(button4);
pl.add(button5);
pl.add(button6);
pl.add(button7);
pl.add(button8);
pl.add(button9);
pl.add(button0);
pl.add(buttonPoint);
pl.add(buttonEqual);
windowContent.add("Center",pl);
JPanel p2 = new JPanel();
GridLayout gl2 = new GridLayout(4,1);
p2.setLayout(gl2);
p2.add(buttonPlus);
p2.add(buttonMinus);
p2.add(buttonMultiply);
p2.add(buttonDivide);
windowContent.add("East",p2);
JFrame frame = new JFrame("Calculator");
frame.setContentPane(windowContent);
frame.pack(); 
frame.setVisible(true);
CalculatorEngine calcEngine = new CalculatorEngine(null);
button0.addActionListener((java.awt.event.ActionListener) calcEngine);
button1.addActionListener((java.awt.event.ActionListener) calcEngine);
button2.addActionListener((java.awt.event.ActionListener) calcEngine);
button3.addActionListener((java.awt.event.ActionListener) calcEngine);
button4.addActionListener((java.awt.event.ActionListener) calcEngine);
button5.addActionListener((java.awt.event.ActionListener) calcEngine);
button6.addActionListener((java.awt.event.ActionListener) calcEngine);
button7.addActionListener((java.awt.event.ActionListener) calcEngine);
button8.addActionListener((java.awt.event.ActionListener) calcEngine);
button9.addActionListener((java.awt.event.ActionListener) calcEngine);
buttonPoint.addActionListener((java.awt.event.ActionListener) calcEngine);
buttonPlus.addActionListener((java.awt.event.ActionListener) calcEngine);
buttonMinus.addActionListener((java.awt.event.ActionListener) calcEngine);
buttonDivide.addActionListener((java.awt.event.ActionListener) calcEngine);
buttonMultiply.addActionListener((java.awt.event.ActionListener) calcEngine);
buttonEqual.addActionListener((java.awt.event.ActionListener) calcEngine);
   }
public static void main(String[] args) {
	new Calculator();
   }
}














