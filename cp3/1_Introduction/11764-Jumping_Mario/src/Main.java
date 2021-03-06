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
		int T = input.nextInt();
		int N, jumpsOfMario[], highJumpCount, lowJumpCount;
		for (int I = 1; I <= T; I++) {
			N = input.nextInt();
			jumpsOfMario = new int[N + 1];
			highJumpCount = 0;
			lowJumpCount = 0;
			for (int J = 1; J <= N; J++) {
				jumpsOfMario[J] = input.nextInt();
			}
			for (int J = 1; J < N; J++) {
				if (jumpsOfMario[J + 1] > jumpsOfMario[J]) {
					highJumpCount++;
				} else if (jumpsOfMario[J + 1] < jumpsOfMario[J]) {
					lowJumpCount++;
				}
			}
			System.out.format("Case %d: %d %d\n", I, highJumpCount, lowJumpCount);
		}
		input.close();
	}

}
