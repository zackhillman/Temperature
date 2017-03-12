public class TemperatureServer {

	// Instance Class Variables
	double temperatureValue;
	char type;

	// Constructor Methods
	public TemperatureServer() {
		temperatureValue = 0;
		type = 'C';
	}

	public TemperatureServer(double temp) {
		temperatureValue = temp;
		type = 'C';
	}

	public TemperatureServer(char unit) {
		temperatureValue = 0;
		type = unit;
	}

	public TemperatureServer(double temp, char unit) {
		temperatureValue = temp;
		type = unit;
	}

	// Sets Temperature value
	public void setTemperatureValue(double temp) {
		temperatureValue = temp;
	}

	// Sets celsius or fahrenheit
	public void setType(char unit) {
		type = unit;
	}
	
	public char getType(){
		return type;
	}

	// Sets Both type and temperature
	public void setTempType(double temp, char unit) {
		temperatureValue = temp;
		type = unit;
	}

	// Gets temperature converted to celsius
	public double getCelsius() {
		return roundTemp(5 * (temperatureValue - 32) / 9); // Formula for
															// Celsius
	}

	// Gets Fahrenheit converted to celsius
	public double getFahrenheit() {
		return roundTemp(9 * (temperatureValue / 5) + 32); // Formula for
															// Fahrenheit
	}

	// Rounds to tenth place
	private double roundTemp(double num) {
		return Math.round(num * 10) / 10;
	}

	// Checks if both temperatures are equal
	public Boolean isEqual() {

		if (type == 'C')
			return temperatureValue == getFahrenheit();
		else
			return temperatureValue == getCelsius();
	}

	// Checks if one temperature is greater than the other
	public Boolean isGreater() {
		if (type == 'C')
			return temperatureValue > getFahrenheit();
		else
			return temperatureValue > getCelsius();
	}

	// Checks if one temperature is less than the other
	public Boolean isLesser() {
		if (type == 'C')
			return temperatureValue < getFahrenheit();
		else
			return temperatureValue < getCelsius();
	}

	// toString returns all information as a string
	public String toString() {
		String str;

		if (type == 'C') {
			str = "Original Temperature: " + temperatureValue + "°C\n";
			str += "Converted Temperature: " + getFahrenheit() + "°F\n";
		} else {
			str = "Original Temperature: " + temperatureValue + "°F\n";
			str += "Converted Temperature: " + getCelsius() + "°C\n";
		}

		if (isEqual())
			str += "The original temperature is equal to the converted temperature\n";
		else if (isGreater())
			str += "The original temperature is greater than the converted temperature\n";
		else
			str += "The original temperature is less than the converted temperature\n";

		return str;
	}

}
