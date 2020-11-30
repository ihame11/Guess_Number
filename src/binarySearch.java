

import java.util.Random;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
//int r= (int)(Math.random()*1000+1);
		Random rand= new Random();
		Scanner t= new Scanner(System.in);
		int x= rand.nextInt(1000);
//
//		//linear search 
//
//		for(int a=0; a<=1000; a++) {
//			if(a==x) {
//				System.out.println("I got it  using linear searching "+ a);
//			}
//		}

		// binary search
		int x1 = 0, x2 = 0;
		int avg;
		//
		System.out.println("please enter secret number");
		//int p=t.nextInt();

		while (true) {
			avg= (x1+x2)/2;
			if(x==avg) {
				System.out.println(" I  GOT IT USING BINARY SEARCH "+x);
				System.exit(1);
			}
			else if(x > avg) {
				//if it is yes
				x1=avg;
				x2=x2;
				System.out.println("  Too high. Try again.  ");
			}
			else if(x<avg){
				x1=x1;
				x2=avg;
				System.out.println("  Too low. Try again.  ");
			}
			//if (x==p) {
			//	System.out.println("conglatulation");
			//}
		}


	}

}