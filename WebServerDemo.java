/* 
 Reference Source : http://www.java2s.com/Code/Java/Network-Protocol/ASimpleWebServer.htm
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServerDemo {

    public static void main(String args[]) {
        ServerSocket s;
        int flag = 0;
        System.out.println("Webserver starting up on port 12000");
        try {
             // create the main server socket
            s = new ServerSocket(12000);
        } catch (Exception e) {
            System.out.println("Error: " + e);
           return e;
        }  
        System.out.println("Waiting for connection");
	    while(true) {
            try {
            // wait for a connection
            Socket remote = s.accept();
            // remote is now the connected socket
            System.out.println("Connection, sending data.");
		    System.out.println(flag++);
            BufferedReader in = new BufferedReader(new InputStreamReader(
            remote.getInputStream()));
            PrintWriter out = new PrintWriter(remote.getOutputStream());
			System.out.println("Sending Request");
			// Send Request to Web server
            out.println("HTTP/1.0 200 OK");
            out.println("Content-Type: text/html");
            out.println("Server: Bot");
		    out.println("");
			out.println("<br><br/>");
		    out.println("<h1 align=center>Hello ACS560!</h1>");
            out.flush();

			System.out.println("Reading Response");
            // Read the Response
            String str = ".";
            while (!str.equals(""))
            str = in.readLine(); 
            remote.close();
			System.out.println("Remote Closed");	
            System.out.println("Enter Ctrl+c to Close");			
            } catch (Exception e) {
                 System.out.println("Error: " + e);
            }
	    }
	}
}
