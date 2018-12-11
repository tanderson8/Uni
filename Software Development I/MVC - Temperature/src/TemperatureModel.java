
//In Java a Model consists of one or more classes that extend the class java.util.Observable. 
//This superclass will provide the register/notify infrastructure needed to support a set of views.
//A model in MVC can have several views
//However, a model must be able to "register" views and 
//it must be able to "notify" all of its registered views when any of its functions cause its state to be changed

// Extends means that you are creating a subclass of the base class you are extending.
// You can only extend one class in your child class

// The reason that a Model has to extend java.util.Observable is that the Observable class provides all of the register/notify infrastructure needed by a model, 
// so you don't have to build any of this and can concentrate on the functionality of your application.
// It isn't necessary to build your Model so that it is a single Observable. 
// Instead, several parts of the model can be separately Observable, each part with its own Observers.

public class TemperatureModel extends java.util.Observable {
	
 //You give your class accessors to get information about its current state 
	
	public double getF() 
	{ 
		return temperatureF;
	
	}
	
	public double getC() 
	{
		return (temperatureF- 32.0) * 5.0 /9.0;
	}

// The Model must be able to "notify" all of its registered views when any of its functions cause its state to be changed 
// So, in a class you write mutators to update the state
// Each mutator should call setChanged() and 
// the notifyObservers() after it has actually changed the state
// NotifyObservers will send an update message to each registered observer(s) (View(s)).

//
	public void setF (double tempF)
	{
		
		temperatureF = tempF;
		
		// Each mutator should call setChanged() and one or the other of notifyObservers() after it has actually changed the state. 
		// NotifyObservers will send an update message to each registered observer (View).
		// There are versions of notifyObservers that let you pass additional information about the change as well.
		setChanged(); // Marks this Observable object as having been changed; the hasChanged method will now return true.
		
		// If this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed. 
		notifyObservers();
		//always remember that Each observer has its update method called with two arguments: this observable object and the arg argument.
	}
	
	public void setC (double tempC)
	{
		temperatureF = tempC*9.0/5.0 + 32.0;
		setChanged();
		notifyObservers(); // this generic notifyOberver requires that view to pull from the model model.getValue()

	}
	
	private double temperatureF = 32.0;
}
