/**
 * @author Jason Conner
 */

package structures;

import java.util.List;

public class Recipe
{
	/**
	 * A List of Ingredient objects used in this Recipe
	 */
	private List < Ingredient > ingredients;
	/**
	 * A String holding the instructions for the Recipe
	 */
	private String instructions;
	/**
	 * The name of the recipe
	 */
	private String name;
	
	/**
	 * @param ingredients - A List of Ingredient objects associated with the recipe
	 * @param instructions - A String representation of the instructions
	 */
	public Recipe(List < Ingredient > ingredients, String instructions)
	{
		this.ingredients = ingredients;
		this.instructions = instructions;
	}
	
	/**
	 * Returns a list of all the Ingredients in this Recipe
	 * @return ingredients - A List of all of the Ingredient objects associated with the recipe
	 */
	public List < Ingredient > getIngredients()
	{
		return ingredients;
	}
	/**
	 * Replaces the current List of Recipes with the user-provided list of Recipes
	 * @param ingredients - A List of Ingredients to associate with this Recipe
	 */
	public void setIngredients(List < Ingredient > ingredients)
	{
		this.ingredients = ingredients;
	}
	/**
	 * Takes a single ingredient and adds it to this Recipe's List of ingredients
	 * @param ingredient - The Ingredient to add to the List of Ingredients
	 */
	public void addIngredient(Ingredient ingredient)
	{
		this.ingredients.add(ingredient);
	}
	
	/**
	 * Returns the instructions for this Recipe
	 * @return instructions - A String containing the Recipe's instructions
	 */
	public String getInstructions()
	{
		return instructions;
	}
	/**
	 * Sets the instructions to the user-provided String
	 * @param instructions - A String containing the instructions for this Recipe
	 */
	public void setInstructions(String instructions)
	{
		this.instructions = instructions;
	}
	
	/**
	 * Returns this Recipe's name
	 * @return name - The name of the Recipe
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Sets the name to the user-provided String
	 * @param name - The name of the Recipe
	 */
	public void setName(String name)
	{
		this.name = name;
	}
}
