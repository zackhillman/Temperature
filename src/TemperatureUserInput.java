import TerminalIO.KeyboardReader;

public class TemperatureUserInput {

	public static void main(String[] args) {
		
		//Variables
		KeyboardReader reader = new KeyboardReader();
		TemperatureServer temp1 = new TemperatureServer();
		TemperatureServer temp2 = new TemperatureServer();
		double temp;
		char unit;

		double temperatureFinal1;
		double temperatureFinal2;

		//Requests Temperature and Type
		temp = reader.readDouble("Enter the temperature: ");
		unit = reader.readChar("Enter 'C' for celsius or 'F' for fahrenheit: ");

		//Sets Temperature and Type
		temp1.setTemperatureValue(temp);
		temp1.setType(unit);
		
		//Requests Temperature and Type
		temp = reader.readDouble("Enter the temperature: ");
		unit = reader.readChar("Enter 'C' for celsius or 'F' for fahrenheit: ");

		//Sets Temperature and Type
		temp2.setTemperatureValue(temp);
		temp2.setType(unit);

		//Prints out information for both temperatures
		System.out.println(temp1);
		System.out.println(temp2);

		//Prints out which converted temperature is greater or less than or equal
		if (temp1.getType() == 'F') {
			temperatureFinal1 = temp1.getCelsius();
		} else {
			temperatureFinal1 = temp1.getFahrenheit();
		}

		if (temp2.getType() == 'F') {
			temperatureFinal2 = temp2.getCelsius();
		} else {
			temperatureFinal2 = temp2.getFahrenheit();
		}

		if (temperatureFinal1 > temperatureFinal2)
			System.out.println("Temperature #1 is greater than Temperature #2");
		else if (temperatureFinal1 < temperatureFinal2)
			System.out.println("Temperature #1 is less than Temperature #2");
		else
			System.out.println("Both temperatures are the same");

	}
}
