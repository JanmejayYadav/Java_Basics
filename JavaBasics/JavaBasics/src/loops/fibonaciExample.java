package loops;

import java.util.Scanner;

public class fibonaciExample {

	public static void main(String[] args) {
Scanner in =new Scanner(System.in);
int num=in.nextInt();
int a=0;
int b=1;
System.out.print(a+" ");
if(num>1) {
	for (int i=2; i<=num; i++) {
		System.out.print(b+" ");
		int temp=b;
		b=a+b;
		a=temp;
	
}
}
}
}


