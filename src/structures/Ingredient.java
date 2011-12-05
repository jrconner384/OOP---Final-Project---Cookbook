/**
 * @author Jason Conner
 */

package structures;

public class Ingredient
{
	/**
	 * The name of this Ingredient
	 */
	private String name;
	/**
	 * The amount of the Ingredient used
	 */
	private Measure amount;
	
	/**
	 * @param name - A String description of the Ingredient (i.e. Tomato)
	 * @param amount - A Measure object describing the amount of the ingredient (i.e. 16 ounces)
	 */
	public Ingredient(String name, Measure amount)
	{
		this.name = name;
		this.amount = amount;
	}
	
	/**
	 * Returns the name of this Ingredient
	 * @return name - The name of this Ingredient
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * Sets the name of the Ingredient to the user-provided value
	 * @param name - The user-provided name for this Ingredient
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Returns the amount of this Ingredient
	 * @return amount - A Measure object representing the amount of the Ingredient used
	 */
	public Measure getAmount()
	{
		return amount;
	}
	/**
	 * Sets the amount of the Ingredient needed by taking a user-provided Measure object
	 * @param amount - The Measure passed in by the user
	 */
	public void setAmount(Measure amount)
	{
		this.amount = amount;
	}
	/**
	 * Sets the amount of the Ingredient needed by taking a user-provided number and Measure type
	 * @param number - The numerical value of the Measure
	 * @param type - The type of the measure
	 */
	public void setAmount(int number, String type)
	{
		Measure measure = new Measure(number, type);
		this.amount = measure;
	}
	
	/**
	 * Adds the Measures of two Ingredients together.  This is done through Ingredient rather than Measure to ensure
	 * that the Measures being added are from the same kind of Ingredient.
	 * @param ingredient - The Ingredient to add to this Ingredient
	 * @return A Measure object which is the combination of of both Ingredients' Measures
	 */
	public Measure add(Ingredient ingredient)
	{
		//Only two ingredients of the same type can be added.  For example, you cannot add together tomatoes and carrots
		if(! this.getName().equals(ingredient.getName()))
		{
			return null;
		}
		
		Measure left = this.getAmount();		//This Ingredient's Measure
		Measure right = ingredient.getAmount();	//The passed-in Ingredient's Measure
		
		/* If the measure type of this and the passed-in Ingredient are the same, just add the Measure amounts together
		 * For example, if both operands have the measurement type of 'cup', the amounts just need to get added.
		 * If each operand has a different amount, some conversion has to be done.
		 */
		if(left.getType().equals(right.getType()))
		{
			return new Measure(left.getNumber() + right.getNumber(), left.getType());
		}
		else
		{
			return Measure.convert(left, right);
		}
	}
}
