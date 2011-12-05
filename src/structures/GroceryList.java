/**
 * @author Jason Conner
 */

package structures;

import java.util.ArrayList;
import java.util.List;

public class GroceryList
{
	/**
	 * The singleton instance for this class
	 */
	private static GroceryList instance = null;
	/**
	 * The amalgamated list of Ingredients
	 */
	public List < Ingredient > groceryList;
	
	/**
	 * If no instance yet exists, it instantiates the class.
	 * @return The singleton instance of this class
	 */
	public GroceryList getInstance()
	{
		if(instance == null)
		{
			instance = new GroceryList();
		}
		return instance;
	}
	
	/**
	 * Takes an Ingredient object as an argument and determines if it is already in groceryList.
	 * If it is, it increments the amount of that Ingredient.  If it isn't, it adds the Ingredient to the List
	 * @param ingredient
	 */
	public void addIngredient(Ingredient ingredient)
	{
		if(groceryList.contains(ingredient))
		{
			//int location = groceryList.indexOf(ingredient);
		}
		else
		{
			groceryList.add(ingredient);
		}
	}
	
	/**
	 * Constructor is kept private for the singleton pattern
	 */
	private GroceryList()
	{
		groceryList = new ArrayList < Ingredient >();
	}
}
