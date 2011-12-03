/**
 * @author Jason Conner
 */
package observer;

public interface Observer
{
	/**
	 * This method will be overwritten by concrete observers.  It will be used by other classes to force the observers to update with the latest information
	 */
	public void update();
}
