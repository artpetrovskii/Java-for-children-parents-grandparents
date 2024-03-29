import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener{
   Calculator parent;
   char selectedAction = ' ';
   double currentResult = 0;
   CalculatorEngine(Calculator parent){
	   this.parent = parent;
   }
public void actionPerformed(ActionEvent e) {
	JButton clickedButton = (JButton) e.getSource();
	String dispFieldText = parent.displayField.getText();
	double displayValue = 0;
	if(!"".equals(dispFieldText)) {
		try {
			displayValue = Double.parseDouble(dispFieldText);
		} catch (NumberFormatException e1) {
			// TODO Auto-generated catch block
			javax.swing.JOptionPane.showConfirmDialog(null, 
					"Please enter a number", "Incorrect input", 
					      javax.swing.JOptionPane.PLAIN_MESSAGE);
		}
	}
	Object src = e.getSource();
	if(src == parent.buttonPlus) {
		selectedAction = '+';
		currentResult = displayValue;
		parent.displayField.setText("");
	}else if(src == parent.buttonMinus) {
		selectedAction = '-';
		currentResult = displayValue;
		parent.displayField.setText("");
	}else if(src == parent.buttonDivide) {
		selectedAction = '/';
		currentResult = displayValue;
		parent.displayField.setText("");
   }else if(src == parent.buttonMultiply) {
		selectedAction = '*';
		currentResult = displayValue;
		parent.displayField.setText("");
   }else if(src == parent.buttonEqual) {
       
	   if(selectedAction == '+') {
	   currentResult += displayValue;
	   parent.displayField.setText("" + currentResult);
   }else if(selectedAction == '-') {
       currentResult -= displayValue;
       parent.displayField.setText("" + currentResult);
   }else if(selectedAction == '/') {
	   currentResult /= displayValue;
	   parent.displayField.setText("" + currentResult);
   }else if(selectedAction == '*') {
	   currentResult *= displayValue;
	   parent.displayField.setText("" + currentResult);
   }   
} else{
	String clickedButtonLabel = clickedButton.getText();
	parent.displayField.setText(dispFieldText +
			                       clickedButtonLabel);
   }
  }
}	   
	   
	   
	   
	   
	   