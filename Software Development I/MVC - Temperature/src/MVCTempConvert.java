
public class MVCTempConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TemperatureModel temperature = new TemperatureModel();
		new FarenheitGUI(temperature, 100, 100);
		new CelsiusGUI(temperature,100, 250);
		new GraphGUI(temperature, 400, 200);
		new SliderGUI(temperature, 300, 100);
	

	}

}
