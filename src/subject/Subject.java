/**
 * @author Jason Conner
 */

package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
	/**
	 * A collection of every observer to be notified in the event of a significant change
	 */
	private List < Observer > observers;
	
	/**
	 * This constructor takes no arguments.  It simply initializes the collection of Observer objects
	 */
	public Subject()
	{
		observers = new ArrayList < Observer >();
	}
	
	/**
	 * Takes an Observer object and adds it to the collection of Observers
	 * @param o - The Observer to add to the collection
	 */
	public void attach(Observer o)
	{
		observers.add(o);
	}
	
	/**
	 * Takes an Observer object and, if it is in the collection of Observers, it is removed
	 * @param o - The Observer to remove
	 */
	public void detach(Observer o)
	{
		observers.remove(o);
	}
	
	/**
	 * Iterates through the collection of Observers and calls their update() method
	 */
	public void notifyObservers()
	{
		for(Observer o : observers)
		{
			o.update();
		}
	}
}
