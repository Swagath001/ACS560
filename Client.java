/* 
 Reference - Source :http://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
  */

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {

        URL readUrl = new URL(args[0]);
        BufferedReader in = new BufferedReader(new InputStreamReader(readUrl.openStream()));
		
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}