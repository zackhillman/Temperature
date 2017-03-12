/*
	Temperature Program
	Zack Hillman
	3/10/15
	This program converts the temperature between Celsius and Fahrenheit.
	The values are passed to the server through constructors in the
	client program. The program will output the converted temperature,
	rounded to the nearest tenth of a degree, as well as if the converted
	temperature is equal, greater or lesser than the original temperature.
 */

public class TemperatureClient {

	
	public static void main(String[] args) {
		
		//Instantiates Objects
		TemperatureServer temp1 = new TemperatureServer();
		TemperatureServer temp2 = new TemperatureServer('F');
		TemperatureServer temp3 = new TemperatureServer(0);
		TemperatureServer temp4 = new TemperatureServer(-40, 'F');

		//Prints information for each temperature
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		System.out.println(temp4);
	}
	
 	
}
