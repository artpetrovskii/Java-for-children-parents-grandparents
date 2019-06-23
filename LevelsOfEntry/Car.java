public class Car {
private String brakesCondition;
public void brake(int pedalPressure) {
	boolean useRegularBrakes;
	useRegularBrakes = checkForAntiLockBrakes(pedalPressure);
	if (useRegularBrakes == true) {
		useRegularBrakes();
	} else {
		useAntiLockBrakes();
	}
   }
private boolean checkForAntiLockBrakes(int pressure) {
	if (pressure > 100) {
		return true;
	} else {
		return false;
	}
   }
private void useRegularBrakes() {
	}
private void useAntiLockBrakes() {
	}
}
