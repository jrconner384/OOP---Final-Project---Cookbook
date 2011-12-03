/**
 * @author Jason Conner
 */

package observer;

import javax.swing.JFrame;

import subject.RecipeBook;

public class Calendar extends JFrame implements Observer
{
	private static final long	serialVersionUID	= 8336078154463231062L;
	
	/**
	 * @param book - A RecipeBook which the calendar will use to reference the recipes selected for the calendar
	 */
	public Calendar(RecipeBook book)
	{
		super("Selected Recipes");
	}

	@Override
	public void update()
	{
		// TODO Auto-generated method stub

	}

}
