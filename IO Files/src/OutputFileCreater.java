import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutputFileCreater
{  
   public static void main(String args[]) throws IOException
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
           
           String num = null;
           FileReader reader = new FileReader("C:\\Users\\riede\\Downloads\\numbers.txt");
           BufferedReader reader1 = new BufferedReader(reader);
           
           System.out.println("Input: ");
           while((num = reader1.readLine()) != null) {
        	   System.out.println(num);
           }
           
           reader1.close();
           
           String tot = null;
           FileReader reader2 = new FileReader("C:\\Users\\riede\\Downloads\\total.txt");
           BufferedReader reader3 = new BufferedReader(reader2);
           
           System.out.println();
           System.out.println("Output: ");
           System.out.println(num = reader3.readLine());
           }
       
       catch(FileNotFoundException e)
       {
           System.out.println("File not found");
       }
   }
}
