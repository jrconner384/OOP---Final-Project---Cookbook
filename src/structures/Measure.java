/**
 * @author Jason Conner
 */

package structures;

public class Measure
{
	/**
	 * The numerical value associated with this Measure
	 */
	private int number;
	/**
	 * The unit type of this Measure (i.e. ounces, cups, etc.)
	 */
	private String type;
	
	/**
	 * @param number - The numerical value associated with the Measure
	 * @param type - The unit type of the Measure (i.e. ounces, cups, etc.)
	 */
	public Measure(int number, String type)
	{
		this.number = number;
		this.type = type;
	}
	
	/**
	 * Returns the numerical value of this Measure
	 * @return number - The numerical value of this Measure
	 */
	public int getNumber()
	{
		return number;
	}
	/**
	 * Sets the numerical value of this Measure
	 * @param number - The numerical value of this Measure
	 */
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	/**
	 * Returns the type of this Measure
	 * @return type - The type of this Measure
	 */
	public String getType()
	{
		return type;
	}
	/**
	 * Sets the type of this Measure
	 * @param type - The type of this Measure
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	 * Returns a String representation of this Measure.  If the numerical value is 16 and the type is ounces, it will return the String '16 ounces'
	 * @return A String representation of this Measure
	 */
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(Integer.toString(this.number));
		builder.append(" " + type);
		return builder.toString();
	}
}
