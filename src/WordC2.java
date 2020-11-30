import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class WordC2 {

	public static void main(String[] args) throws IOException {
		System.out.println("... please enter sentence...");
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader t= new BufferedReader(is);
		String sentence = null;
		sentence = t.readLine();
		int c=0;
		String array[];
		ArrayList<String> p= new ArrayList<>();

		while(!sentence.equals("")) {// or .isBlank();
			if(c==9) {
				break;
			}
			p.add(sentence);
			System.out.println("Please enter a string, press Enter to end:");
			sentence = t.readLine();		
			c++;
		}
		System.out.println("Thank you for entering "+(c)+" lines of data. Here are your results:");
		//System.out.println("** Line 1: "+sentence);
		String letters[] = null;
		// printing our sentences
		for(String f:p) {
			System.out.println("** Line : "+f);
			letters=splitLetters(f);
			//System.out.println(letters); 
		}
		for(int i=0;i<=letters.length;i++) {
			System.out.println("letter["+i+"]:"+letters[i]);
		}
		//for(String string :letters) {
			//System.out.println(" "+letters);
			//}
		//System.out.println("letter[]:\n"+Arrays.asList(letters));

	}

	public static String[] splitLetters(String q) {
       String[] result= q.split("");

		return result;
		}
}




//	for(int i=c;i<=10;i++) {			
//		System.out.println(sentence);
//		}
// System.exit(0);
// continue;
// }	
//		}
//		System.out.println(sentence);
//		
//		
////		for(String w:sentence.split(" ")) {
////			p.add(w);
//		
//		}}
////System.out.println(sentence);
//	
//		//if(c==3) {
//			//System.out.println(sentence);
//		//}
//
//	
