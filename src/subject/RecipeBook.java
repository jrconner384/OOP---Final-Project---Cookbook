/**
 * @author Jason Conner
 */

package subject;

import java.util.ArrayList;
import java.util.List;

import structures.Ingredient;
import structures.Recipe;

public class RecipeBook extends Subject
{
	/**
	 * A collection of Recipe objects
	 */
	private List < Recipe > recipes;
	
	/**
	 * This constructor takes no arguments.  It simply initializes the List of Recipe objects
	 */
	public RecipeBook()
	{
		recipes = new ArrayList < Recipe >();
	}

	/**
	 * This method adds a Recipe object to the RecipeBook by taking in a List of Ingredient objects and a String of instructions
	 * 
	 * @param ingredients - A List of Ingredient objects associated with a single Recipe
	 * @param instructions - A String with the instructions for a single Recipe
	 */
	public void addRecipe(List < Ingredient > ingredients, String instructions)
	{
		Recipe newRecipe = new Recipe(ingredients, instructions);
		recipes.add(newRecipe);
		notifyObservers();
	}
	
	/**
	 * This method adds the user-provided Recipe object to the RecipeBook collection
	 * 
	 * @param recipe - A Recipe object
	 */
	public void addRecipe(Recipe recipe)
	{
		recipes.add(recipe);
		notifyObservers();
	}
	
	/**
	 * @return - A List of all Recipe objects in this RecipeBook
	 */
	public List < Recipe > getRecipes()
	{
		return recipes;
	}
}
