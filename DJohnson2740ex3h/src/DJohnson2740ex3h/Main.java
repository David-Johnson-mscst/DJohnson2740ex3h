package DJohnson2740ex3h;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		double [] dblRainfall = {
			1.2, 2.7, 2.2, 3.1, 2.9, 5.1,
			3.2, 2.7, 3.6, 1.8, 2.2, 1.7
		};
		String [] strRainfall = {
			"1.2", "2.7", "2.2", "3.1", "2.9", "5.1",
			"3.2", "2.7", "3.6", "1.8", "2.2", "1.7"
		};
		DecimalFormat fmt = new DecimalFormat("#0.0");
		
		Rainfall rainfall1 = new Rainfall(dblRainfall);
		System.out.println("Rainfall1 total:   " + fmt.format(rainfall1.getTotal()));

	}

}
