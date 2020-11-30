package b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class input {

	public static void main(String[] args) throws IOException {
		ArrayList<String> arrayList = new ArrayList<>();
String sent = null;
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader t= new BufferedReader(is);
		sent = t.readLine();
		    while (sent!=null) {
		         arrayList.add(sent);
		    }
		    System.out.println(arrayList.add(sent));
		}

		    // Handle a potential exception
		

	}


