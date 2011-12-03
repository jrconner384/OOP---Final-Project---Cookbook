/**
 * @author Jason Conner
 */

package observer;

import javax.swing.JFrame;

import subject.RecipeBook;

public class GroceryList extends JFrame implements Observer
{
	private static final long	serialVersionUID	= 4377298481153990620L;

	/**
	 * @param book - A RecipeBook the GroceryList will use to reference all recipes selected by the user
	 */
	public GroceryList(RecipeBook book)
	{
		super("Grocery List");
	}

	@Override
	public void update()
	{
		// TODO Auto-generated method stub

	}

}
