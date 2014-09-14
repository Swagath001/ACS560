import java.io.FileWriter;
public class JavatoHTML
{
  public static void main(String[] args) {    
try {
      /* from source: http://stackoverflow.com/questions/5744919/generating-output-in-java */

StringBuilder htmlBuilder = new StringBuilder();

htmlBuilder.append("<html><title>Courses Taken</title><head><style>th{width : 100px;align = center;padding : 1px 1px 1px 1px;}</style></head><body><table border=2 align=center height=300></br></br><h1 align =center> Registered Courses </h1></br><tr><th> Semester</th><th> Course Id</th><th> Course Registered</th></tr><tr><td> Fall 2014 </td><td> ACS 56000 - 01</td><td> Software Engineering</td></tr><tr><td> Fall 2014 </td><td> CS 59000 - 01 </td><td> Mobile Application Dev I</td></tr><tr><td> Fall 2014 </td><td> CS 59000 - 03</td><td> Embedded Systems</td></tr></table></body></html>");

FileWriter writer = new FileWriter(System.getProperty("user.home") + "/HelloHTML2.html");
writer.write(htmlBuilder.toString());
writer.close();
   }
   catch ( Exception e ){ } } }