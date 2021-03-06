/**
 * 	Verdict	: Accepted
 * 	OJ	 	: UVA online judge
 * 
 * 	@author: absakDev 
 * 	@version: 25/5/2016
 */
import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long t = input.nextLong();
		double n;
		double x[] = new double[101];
		double minValue, maxValue;
		for (int I = 1; I <= t; I++){
			n = input.nextDouble();
			minValue = Double.MAX_VALUE;
			maxValue = Double.MIN_VALUE;
			for (int J = 0; J < n; J++){
				x[J] = input.nextDouble();
				if (x[J] < minValue) {
					minValue = x[J];
				}
				if (x[J] > maxValue){
					maxValue = x[J];
				}
			}
			double result = Math.abs(maxValue - minValue) * 2;
			System.out.format("%.0f\n", result);
		}
		input.close();
	}

}
