
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener
{
   private Measurable[] objects;
   private String metric;

   public ButtonListener(Measurable[] objects,String metric)
   {  
       this.objects = objects;  
       this.metric = metric;
   }

   public void actionPerformed(ActionEvent event)
   {
       double result = 0;
  
       if (metric == "Maximum")
       {
           result = Data.max(objects);
          
           if (objects[0] instanceof BankAccount) {
               JOptionPane.showMessageDialog(null,
                       metric + " Account Balance is " + result,
                           "MAX", JOptionPane.INFORMATION_MESSAGE);
           }
          
           if (objects[0] instanceof Country) {
               JOptionPane.showMessageDialog(null,
                       metric + " Country Area is " + result,
                           "MAX", JOptionPane.INFORMATION_MESSAGE);
           }
          
           if (objects[0] instanceof Quiz) {
               JOptionPane.showMessageDialog(null,
                       metric + " Quiz Score is " + result,
                           "MAX", JOptionPane.INFORMATION_MESSAGE);
           }
       }
       
       if (metric == "Minimum")
       {
           result = Data.min(objects);
          
           if (objects[0] instanceof BankAccount) {
               JOptionPane.showMessageDialog(null,
                       metric + " Account Balance is " + result,
                           "MIN", JOptionPane.INFORMATION_MESSAGE);
           }
          
           if (objects[0] instanceof Country) {
               JOptionPane.showMessageDialog(null,
                       metric + " Country Area is " + result,
                           "MIN", JOptionPane.INFORMATION_MESSAGE);
           }
          
           if (objects[0] instanceof Quiz) {
               JOptionPane.showMessageDialog(null,
                       metric + " Quiz Score is " + result,
                           "MIN", JOptionPane.INFORMATION_MESSAGE);
           }
       }
       
       if (metric == "Average")
       {
   result = Data.average(objects);
     
   if (objects[0] instanceof BankAccount) {
               JOptionPane.showMessageDialog(null,
                       metric + " Account Balance is " + result,
                           "AVG", JOptionPane.INFORMATION_MESSAGE);
   		   }
     
           if (objects[0] instanceof Country) {
               JOptionPane.showMessageDialog(null,
                       metric + " Country Area is " + result,
                           "AVG", JOptionPane.INFORMATION_MESSAGE);
           }
          
           if (objects[0] instanceof Quiz) {
               JOptionPane.showMessageDialog(null,
                       metric + " Quiz Score is " + result,
                           "AVG", JOptionPane.INFORMATION_MESSAGE);
           }
       }
       
       if (objects[0].getClass().getName().equals("BankAccount"))
       {          
           System.out.println(metric + " Account Balance is "+result);
       }
       if (objects[0].getClass().getName().equals("Country"))
       {
           System.out.println(metric + " Country Area is "+result);  
       }
       if (objects[0].getClass().getName().equals("Quiz"))
       {
           System.out.println(metric + " Quiz Score is "+result);  
       }
   }
}
