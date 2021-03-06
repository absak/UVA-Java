/**
 * 	Verdict	: Accepted
 * 	OJ	 	: UVA online judge
 * 
 * 	@author: absakDev 
 * 	@version: 25/5/2016
 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt(); // number of test case
		int lumberjacks[] = new int[11];
		for (int I = 1; I <= N; I++) {
			int ascendOrderCount = 0;
			int descendOrderCount = 0;
			for (int J = 1; J <= 10; J++) {
				lumberjacks[J] = input.nextInt();
				if (J > 1) {
					if (lumberjacks[J] > lumberjacks[J-1]) {
						ascendOrderCount++;
					}
					if (lumberjacks[J] < lumberjacks[J-1]) {
						descendOrderCount++;
					}
				}
			}
			if (I == 1) {
				System.out.println("Lumberjacks:");
			}
			if (descendOrderCount == 9 || ascendOrderCount == 9) {
				System.out.println("Ordered");
			} else {
				System.out.println("Unordered");
			}
		}
		input.close();
	}

}
