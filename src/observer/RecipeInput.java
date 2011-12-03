/**
 * @author Jason
 */

package observer;

import javax.swing.JFrame;

import subject.RecipeBook;

public class RecipeInput extends JFrame implements Observer
{
	private static final long	serialVersionUID	= 5469161471997515212L;

	/**
	 * @param book - A RecipeBook which the Input will use to add to the collection of Recipes
	 */
	public RecipeInput(RecipeBook book)
	{
		super("Recipe Card");
	}

	@Override
	public void update()
	{
		// TODO Auto-generated method stub

	}

}
