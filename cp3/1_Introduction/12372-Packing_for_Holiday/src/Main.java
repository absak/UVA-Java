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
		int T, L, W, H;
		T = input.nextInt();
		for (int I = 1; I <= T; I++) {
			L = input.nextInt();
			W = input.nextInt();
			H = input.nextInt();
			if (L > 20 || W > 20 || H > 20){
				System.out.format("Case %d: bad\n", I);
			} else {
				System.out.format("Case %d: good\n", I);
			}
		}
	}

}
