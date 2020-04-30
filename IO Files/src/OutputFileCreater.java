import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFileCreater
{  
   public static void main(String args[])
   {              
       try
       {          
           File x = new File("C:\\Users\\riede\\Downloads\\numbers.txt");
          
           Scanner y = new Scanner(x);
          
           double total = 0;
          
           while(y.hasNextDouble())
           {
               total = total + y.nextDouble();
           }
           
           File output = new File("C:\\Users\\riede\\Downloads\\total.txt");
          
           PrintWriter p = new PrintWriter(output);
          
           p.print(total);
          
           p.close();
           y.close();
       }
              
       catch(FileNotFoundException e)
       {
           System.out.println("File not found");
       }
   }
}
