package b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordCount {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a string, press Enter to end:");
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader t= new BufferedReader(is);
		String sentence = null;
		sentence = t.readLine();
		int c=0;
		String array[];
		ArrayList<String> p= new ArrayList<>();

		while(!sentence.equals("")) {
			if(c==9) {
				break;
			}
			p.add(sentence);
			System.out.println("Please enter a string, press Enter to end:");
			sentence = t.readLine();		
			c++;
		}
		System.out.println("Thank you for entering "+(c)+" lines of data. Here are your results:");
		String letters[] = null;
		String wrd[] = null;
		String sent[] = null;
		for(String f:p) {
			System.out.println("** Line : "+f);
			letters=splitLetters(f);
		for(int i=0;i<letters.length;i++) {
			System.out.println("letter["+i+"]:"+letters[i]);
		}
		}
		for(String f:p) {
			System.out.println("** Line : "+f);
			wrd=splitWord(f);
			for(int i=0;i<letters.length;i++) {
				System.out.println("word["+i+"]:"+wrd[i]);
				}
			}
		for(String f:p) {
			System.out.println("** Line : "+f);
			sent=splitSent(f);
			for(int i=0;i<letters.length;i++) {
				System.out.println("sentence["+i+"]:"+sent[i]);
				}
			}
	}

	public static String[] splitLetters(String q) {
       String[] result= q.split("");

		return result;
		}
	public static String[] splitWord(String q) {
	       String[] result= q.split(" ");

			return result;
			}
	public static String[] splitSent(String q) {
	       String[] result= q.split("\n");

			return result;
			}
		}

	


