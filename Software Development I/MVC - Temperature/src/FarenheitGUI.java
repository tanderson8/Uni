import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

// Views in MVC are associated with controllers that update the model as necessary when a user interacts with an associated view.
// The controller can call mutator methods of the model to get it to update its state
//  Of course, then the model will notify ALL registered views that a change has been made and so they will update what they display to the user as appropriate. 

//Model could have more than one view
//The View should implement the update method by querying the model (actually the Observable t) 
// for the changes it needs and then make appropriate changes to the view itself. 

// The Farenheit GUI follows its parent class TemperatureGUI
// It defines listeners and adds them to its components using the addlistener methods defined in the superclass.
class FarenheitGUI extends TemperatureGUI
{	public FarenheitGUI(TemperatureModel model, int h, int v)
	{	super("Farenheit Temperature", model, h, v);
		setDisplay(""+model.getF());
		addUpListener(new UpListener());
		addDownListener(new DownListener());
		addDisplayListener(new DisplayListener());
	}
	
	public void update(Observable t, Object o) // Called from the Model
	{	setDisplay("" + model().getF());
	}

	
	class UpListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	model().setF(model().getF() + 1.0);
		}
	}
	
	class DownListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	model().setF(model().getF() - 1.0);
		}
	}
	
	class DisplayListener implements ActionListener
	{	public void actionPerformed(ActionEvent e)
		{	double value = getDisplay();
			model().setF(value);
		}
	}

	
		
}
