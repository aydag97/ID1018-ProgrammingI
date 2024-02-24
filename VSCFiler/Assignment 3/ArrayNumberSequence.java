import java.util.Arrays;

// ArrayNumberSequence.java

/****************************************************************

ArrayNumberSequence represents a sequence of real numbers.
Such a sequence is defined by the interface NumberSequence.
The class uses an array to store the numbers in the sequence.

Author
Fadil Galjic

****************************************************************/

public class ArrayNumberSequence implements NumberSequence
{
	// numbers in the sequence
    private double[] numbers;

    // create the sequence
    public ArrayNumberSequence (double[] numbers)
    {
		if (numbers.length < 2)
		    throw new IllegalArgumentException("not a sequence");

		this.numbers = new double[numbers.length];
		for (int i = 0; i < numbers.length; i++)
		    this.numbers[i] = numbers[i];
	}

    // toString returns the character string representing this
    // sequence
	public String toString ()
	{
		String s = "";
		for (int i = 0; i < numbers.length - 1; i++)
		    s = s + numbers[i] + ", ";
		s = s + numbers[numbers.length - 1];

		return s;
	}

    public int length ()
	{
		return numbers.length;
	}

	public double upperBound()
	{
		double max = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		return max;
	}

	public double lowerBound()
	{
		double min = numbers[0];
		for(int i = 1; i < numbers.length; i++)
		{
			if (numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		return min;
	}

	public double numberAt (int position)
	{
		if(position < 0 || position >= numbers.length)
		{
			throw new IndexOutOfBoundsException("Invalid position!");
		}

		return numbers[position];
	}

	public int positionOf (double number)
	{
		int position = -1;
		for(int i = 0; i < numbers.length; i++)
		{
			if(number == numbers[i])
			{
				position = i;
				break;
			}
		}
		return position;
	}

	public boolean isIncreasing ()
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			if (numbers[i+1] < numbers[i])
			{
				return false;
			}
		}
		return true;
	}

	public boolean isDecreasing ()
	{
		for(int i = 0; i < numbers.length - 1; i++)
		{
			if (numbers[i+1] > numbers[i])
			{
				return false;
			}
		}
		return true;
		
	}

	public boolean contains (double number)
	{
		return positionOf(number) != -1;
	}
	
	public void add(double number)
	{
		double[] copyNumbers = new double[numbers.length + 1];
		for(int i = 0; i < numbers.length; i++)
		{
			copyNumbers[i] = numbers[i];
		}
		copyNumbers[copyNumbers.length - 1] = number;
		numbers = copyNumbers;
	}

	public void insert(int position, double number)
	{
		if(position < 0 || position > this.length())
		{
			throw new IndexOutOfBoundsException("Invalid position!");
		}

		double[] copyNumbers = new double[numbers.length + 1];
		
		for(int i = 0; i < position; i++)
		{
			copyNumbers[i] = numbers[i];
		}
		copyNumbers[position] = number;
		for(int i = position +1; i < numbers.length; i++)
		{
			copyNumbers[i+1] = numbers[i];
		}

		numbers = copyNumbers;
	}

	public void removeAt(int position)
	{
		if(position < 0 || position > numbers.length)
		{
			throw new IndexOutOfBoundsException("Invalid position!");
		}
		if(numbers.length == 2)
		{
			throw new IllegalStateException("Too short to be a sequence!");
		}

		double[] copyNumbers = new double[numbers.length - 1];
		int counter = 0;
		for (int i = 0; i < numbers.length; i++)
		{
			if(i != position)
			{
				copyNumbers[counter] = numbers[i];
				counter++;
			}
		}
		numbers = copyNumbers;
	}

	public double[] asArray() 
	{
		return numbers.clone();
	}
}