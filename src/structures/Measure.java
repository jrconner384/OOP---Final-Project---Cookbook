/**
 * @author Jason Conner
 */

package structures;

import java.util.ArrayList;

import exceptions.IncompatableMeasurementType;
import exceptions.InvalidMeasurementType;

public class Measure
{
	public static String OUNCE = "ounce";
	public static String POUND = "pound";
	public static String TEASPOON = "teaspoon";
	public static String TABLESPOON = "tablespoon";
	public static String CUP = "cup";
	public static String PINT = "pint";
	public static String QUART = "quart";
	public static String GALLON = "gallon";
	
	private  ArrayList < String > validTypes;
		
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
	 * @throws InvalidMeasurementType
	 */
	public Measure(int number, String type)
	{
		validTypes = new ArrayList < String >();
		validTypes.add(OUNCE);
		validTypes.add(POUND);
		validTypes.add(TEASPOON);
		validTypes.add(TABLESPOON);
		validTypes.add(CUP);
		validTypes.add(PINT);
		validTypes.add(QUART);
		validTypes.add(GALLON);
		
		if(! validTypes.contains(type))
		{
			try
			{
				throw new InvalidMeasurementType();
			}
			catch (InvalidMeasurementType e)
			{
				System.out.println("Measure's constructor was passed in an invalid measurement type.  Refer to this class' static Strings to find valid types.");
			}
		}
		else
		{
			this.number = number;
			this.type = type;
		}
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
	 * @throws InvalidMeasurementType
	 */
	public void setType(String type)
	{
		if(! validTypes.contains(type))
		{
			try
			{
				throw new InvalidMeasurementType();
			}
			catch (InvalidMeasurementType e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			this.type = type;
		}
	}
	
	/**
	 * Takes two Measure objects and adds them together (i.e. 10 ounces + 1 pound = 26 ounces)
	 * @param left - The left operand
	 * @param right - The right operand
	 * @return A Measure object representing the combination of the operands
	 */
	public static Measure convert(Measure left, Measure right)
	{
		/*
		 * Valid measure types are mass and volume for the purposes of this application
		 * Currently valid types of measure are listed as public static Strings in this class
		 */
		
		//First if statement convert units of mass
		if(left.getType().equals(OUNCE) || left.getType().equals(POUND))
		{
			if(right.getType().equals(OUNCE) || right.getType().equals(POUND))
			{
				//TODO Do something clever here...
			}
			else
			{
				try
				{
					throw new IncompatableMeasurementType();
				}
				catch (IncompatableMeasurementType e)
				{
					System.out.println("Measure.convert(Measure, Measure) has been passed two incompatable Measure types.");
				}
			}
		}
		//Second if statement converts units of volume
		else if(left.getType().equals(TEASPOON) || left.getType().equals(TABLESPOON) || left.getType().equals(CUP) || left.getType().equals(PINT) || left.getType().equals(QUART) || left.getType().equals(GALLON))
		{
			if(right.getType().equals(TEASPOON) || right.getType().equals(TABLESPOON) || right.getType().equals(CUP) || right.getType().equals(PINT) || right.getType().equals(QUART) || right.getType().equals(GALLON))
			{
				//TODO Do something clever here, too...
			}
			else
			{
				try
				{
					throw new IncompatableMeasurementType();
				}
				catch (IncompatableMeasurementType e)
				{
					System.out.println("Measure.convert(Measure, Measure) has been passed two incompatable Measure types.");
				}
			}
		}
		
		return null;		
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
