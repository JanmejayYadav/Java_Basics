package loops;

public class xamplepattern5 {

	public static void main(String args[]) {
//		print this pattern
//		    *
//		   **
//		  ***
//		 ****

		int n = 4;
		for(int i=n; i>=1; i--) {
		for(int j=1; j<i; j++) {
		System.out.print(" ");
		}
		for(int j=0; j<=n-i; j++) {
		System.out.print("*");
		}
		System.out.println();
		}
		}
		}