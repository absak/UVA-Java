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
		String str = "";
		String ans = "";
		int n = input.nextInt();
		input.nextLine();
		for (int I = 1; I <= n; I++) {
			str = input.next();
			int lastIndex = str.length() - 1;
			int num = 0;
			if (lastIndex == 0 || lastIndex == 1){
				num = Integer.parseInt(str);
			}
			if (num == 1 || num == 4 || num == 78) {
				ans = "+";
			} else if (lastIndex > 0 && str.charAt(lastIndex - 1) == '3' && str.charAt(lastIndex) == '5') {
				ans = "-";
			} else if (str.charAt(0) == '9' && str.charAt(lastIndex) == '4') {
				ans = "*";
			} else  {
				ans = "?";
			}
			System.out.println(ans);
			ans = "";
		}
		input.close();
	}

}
