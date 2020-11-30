import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		//int r= (int)(Math.random()*1000+1);
		int secretNum,guess=0;
		Random rand= new Random();
		Scanner x= new Scanner(System.in);
		int t= rand.nextInt(1000);

		//boolean corr = true;
		//System.out.println("please enter your secret number");
		//secretNum=x.nextInt();
		// if(guess<=1000 || guess>=0)
		System.out.println(t);
		int c=0;
		while(true) {

			 
			System.out.print(" guess a number ");
			guess = x.nextInt();
			
			
			if(guess==t && c<10 ) {
			
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
					t=rand.nextInt(1000);
					System.out.println(t);
					System.out.println("number of guessed people"+c);
					continue;
					}
				else if(p==0) 
				{
					System.exit(1);
				}
			}
			
			else if(guess==t && c==10 ) {
				
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
					t=rand.nextInt(1000);
					System.out.println(t);
					System.out.println("number of guessed people"+c);
					continue;
					}
				else if(p==0) 
				{
					System.exit(1);
				}
			}
			
			if(c>10 ) {
				
				//corr=true;
				System.out.println(" You should be able to do better! ");
				System.out.println("numbers of tries "+c);
				 
				System.out.println("do you wont tp");
				System.out.println("enter 1 to play again or 0 to exit");
				int p=x.nextInt();
				
				if(p==1) { 
					c=0;
					t=rand.nextInt(1000);
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
	}


 