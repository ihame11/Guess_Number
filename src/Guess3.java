import java.util.Random;
import java.util.Scanner;
public class Guess3 {


	public static void main(String[] args) {
		//int r= (int)(Math.random()*1000+1);
		int secretNum,guess=0;
		Random rand= new Random();
		Scanner x= new Scanner(System.in);
		System.out.println("plese enter maxRange");
		int input =x.nextInt();

		int t= rand.nextInt(input);

		//boolean corr = true;
		//System.out.println("please enter your secret number");
		//secretNum=x.nextInt();
		// if(guess<=1000 || guess>=0)
		System.out.println(t);
		int c=0;
		while(true) {


			System.out.print(" guess a number ");
			guess = x.nextInt();


			if(guess==t && c<log2(input) ) {

				//corr=true;
				System.out.println(" Congratulations. You guessed the number!");
				System.out.println(" you know the secret ");
				//continue;
				//System.out.println("ihame");
				System.out.println("numbers of tries "+c);

				System.out.println("do you wont tp");
				System.out.println("enter 1 to play again or 0 to exit");
				int p=x.nextInt();

				if(p==1) { 
					c=0;
					System.out.println("plese enter maxRange");
					input =x.nextInt();
					t=rand.nextInt(input);
					System.out.println(t);
					System.out.println("number of guessed people"+c);
					continue;
				}
				else if(p==0) 
				{
					System.exit(1);
				}
				else {System.exit(1);}
			}

			else if(guess==t && c==log2(input) ) {

				//corr=true;
				System.out.println(" Congratulations. You guessed the number!");
				System.out.println(" ahh you are lucky you know the secret!! ");
				//continue;
				//System.out.println("ihame");
				System.out.println("numbers of tries "+c);

				System.out.println("do you wont tp");
				System.out.println("enter 1 to play again or 0 to exit");
				int p=x.nextInt();

				if(p==1) { 
					c=0;
					System.out.println("plese enter maxRange");
					input =x.nextInt();
					t=rand.nextInt(input);
					System.out.println(t);
					System.out.println("number of guessed people"+c);
					continue;
				}
				else if(p==0) 
				{
					System.exit(1);
				}
			}

			if(c>log2(input) ) {

				//corr=true;
				System.out.println(" You should be able to do better! ");
				System.out.println("numbers of tries "+c);

				System.out.println("do you wont tp");
				System.out.println("enter 1 to play again or 0 to exit");
				int p=x.nextInt();

				if(p==1) { 
					c=0;
					System.out.println("plese enter maxRange");
					input =x.nextInt();
					t=rand.nextInt(input);
					System.out.println(t);
					System.out.println("number of guessed people"+c);
					continue;
				}
				else if(p==0) 
				{
					System.exit(1);
				}
			}

			if(guess>t) {
				System.out.println("  Too high. Try again.  ");}
			else if(guess<t) {
				System.out.println("  Too low. Try again.  ");}

			c++;
		}

	}
	public static int log2(int n) {
		int r= (int) Math.round(Math.log10(n) / Math.log10(2.));
		return r;
	}		
}



