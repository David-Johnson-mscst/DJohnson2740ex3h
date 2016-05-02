package DJohnson2740ex3h;

import java.util.Arrays;

public class Rainfall {
	private double [] rainfallArray;
	
	public Rainfall(double[] rainfallArray) {
		  // Create a new array the same length as s.
		rainfallArray = new double[rainfallArray.length];
	      
	      // Copy the values in s to sales.
	      for (int index = 0; index < rainfallArray.length; index++)
	    	  rainfallArray[index] = rainfallArray[index];
	   }


	@Override
	public String toString() {
		return "Rainfall [rainfallArray=" + Arrays.toString(rainfallArray)
				+ "]";
	}


	public double getTotal() {
		 double total = 0.0;   // Accumulator

	      // Add up all the values in the sales array.
	      for (double value : rainfallArray)
	         total += value;

	      // Return the total.
	      return total;
	}
	
	public double getAverage() {
		return getTotal() / this.rainfallArray.length;
	}
	
	public double getHighest() {
		 // Store the first value in the sales array in
	      // the variable highest.
	      double highest = rainfallArray[0];

	      // Search the array for the highest value.
	      for (int index = 1; index < rainfallArray.length; index++)
	      {
	         if (rainfallArray[index] > highest)
	            highest = rainfallArray[index];
	      }

	      // Return the highest value.
	      return highest;
	}
	
	public double getLowest() {
		  // Store the first value in the sales array in
	      // the variable lowest.
	      double lowest = rainfallArray[0];

	      // Search the array for the lowest value.
	      for (int index = 1; index < rainfallArray.length; index++)
	      {
	         if (rainfallArray[index] < lowest)
	            lowest = rainfallArray[index];
	      }

	      // Return the lowest value.
	      return lowest;
	}
}
