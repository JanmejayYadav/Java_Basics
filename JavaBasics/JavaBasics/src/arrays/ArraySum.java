package arrays;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int sum=0;
        for (int i=0; i<=arr.length-1; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length-1; i++){
            sum=sum+arr[i];
            
        }System.out.println(sum);
    }
	
}


