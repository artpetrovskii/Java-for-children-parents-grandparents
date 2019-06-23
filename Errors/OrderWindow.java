import java.awt.event.*;

public class OrderWindow implements ActionListener{
private static final OrderWindow bikeOrder = null;
private static final String txtFieldOrderConfirmation = null;
String txtFieldModel;
String txtFieldQuantity;
String selectedModel = txtFieldModel.getText();
String selectedQuantity = txtFieldQuantity.getText();
int quantity = Integer.parseInt(selectedQuantity);
public void actionPerformed(ActionEvent e) {
try {
		   bikeOrder.checkOrder("FireBird", quantity);
		   txtFieldOrderConfirmation.setText("Adding order is finished.");
	} catch (TooManyBikesException e1) {
			   txtFieldOrderConfirmation.setText(((Throwable) e1).getMessage());
		   }
		   }
		   public void checkOrder(String bikeModel, int quantity) throws TooManyBikesException{
			   throw new TooManyBikesException();
	}
}
   

