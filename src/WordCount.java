import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		//String b="hello ihame gilbert";
		//char character = new "hello".toCharArray();
		//StringBuilder t= new StringBuilder(b);
		//String x=t.reverse().toString();
		//System.out.println(x);
		
		System.out.println("... please enter sentence...");
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader t= new BufferedReader(is);
		
		//Scanner s=new Scanner(System.in);
		//System.err.println("... please enter sentence");
		//System.out.println("... please enter sentence...");
		//String sentence=s.nextLine();
		String sentence = null;
		try {
			sentence = t.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList p= new ArrayList();
		for(String w:sentence.split(" ")) {
		p.add(w);
		System.out.println("word:[]"+w+"\n");
		}
		String[] tokens = sentence.split("");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(tokens));
		System.out.println("letter[]:"+list+"\n");
		//int i,n=sentence.length();
		//for(i=0;i<=n;i++) {
System.out.println("totalwords are: \n"+p);
	}
}

