//In Java the views are built of AWT or SWING components. 
//However, views must implement the java.util.Observer interface. 

// It gets interesting, though, if we have two different views, one for Farenheit and the other for Celsius, simultaneously attached to the model.
// Since these two GUIs are so similar, they are built as subclasses of a general TemperatureGUI class.
// This has all of the functionality, but has no listeners for its buttons and field.
// It also doesn't implement the required update method of the Observer class.
// It is therefore abstract. These will all be supplied by subclasses

// Note that it does have methods for adding listeners to the three components.
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// A view provides graphical user interface (GUI) components for a model. 
// It gets the values that it displays by querying the model of which it is a view.
// When a user manipulates a view of a model, the view informs a controller of the desired change.
// In Java the views are built of AWT or SWING components.
// However, views must implement the java.util.Observer interface. 

// About Controllers:
// Views in MVC are associated with controllers that update the model as necessary when a user interacts with an associated view. 
// The controller can call mutator methods of the model to get it to update its state.
// Of course, then the model will notify ALL registered views that a change has been made and so they will update what they display to the user as appropriate. 
// In this example the controllers are implemented as listeners in the Java event structure. 

// Each view must implement the java.util.Observer interface and hence implement the update method
// The Object in the second parameter will be used to receive additional information if passed. 

// Note that it does have methods for adding listeners to the three components.

abstract class TemperatureGUI implements java.util.Observer
{	
	TemperatureGUI(String label, TemperatureModel model, int h, int v)
	{	this.label = label;
		this.model = model;
		temperatureFrame = new Frame(label);
		temperatureFrame.add("North", new Label(label));
		temperatureFrame.add("Center", display);
		Panel buttons = new Panel();
		buttons.add(upButton);
		buttons.add(downButton);		
		temperatureFrame.add("South", buttons);		
		temperatureFrame.addWindowListener(new CloseListener());
		
		// The View needs to register with the Model it wishes to observe by sending the model the addObserver message
		/// Connect the View to the Model
		// Also, a view can register with several models and get updates from each of them.
		model.addObserver(this); 
		temperatureFrame.setSize(604,461);
		temperatureFrame.setLocation(h, v);
		temperatureFrame.setVisible(true);
	}
	
	public void setDisplay(String s){ display.setText(s);}
	
	public double getDisplay()
	{	double result = 0.0;
		try
		{	result = Double.valueOf(display.getText()).doubleValue();
		}
		catch (NumberFormatException e){}
		return result;
	}
	
	public void addDisplayListener(ActionListener a){ display.addActionListener(a);}
	public void addUpListener(ActionListener a){ upButton.addActionListener(a);}
	public void addDownListener(ActionListener a){ downButton.addActionListener(a);}
	
	protected TemperatureModel model(){return model;}
	
	private String label;
	private TemperatureModel model;
	private Frame temperatureFrame;
	private TextField display = new TextField();
	private Button upButton = new Button("Raise");
	private Button downButton = new Button("Lower");
	
	public static class CloseListener extends WindowAdapter
	{	public void windowClosing(WindowEvent e)
		{	e.getWindow().setVisible(false);
			System.exit(0);
		}
	}
}