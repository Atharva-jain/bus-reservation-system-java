
package Admin.BusManagement.ViewAllBus;

import Admin.BusManagement.BusManagementChooices;
import java.io.BufferedReader;
import java.io.FileReader;

public class ShowBus 
{
     public void Display(String busNo)
     {
          System.out.println("/////////////////////////////////////////////////////////////////");
          try
          {
                 FileReader fileReader = new FileReader(busNo);
                 BufferedReader reader = new BufferedReader(fileReader);
                 String data = "";
                 int i = 0 ;
                 while((data = reader.readLine()) != null)
                 {
                     if(i == 0)
                     {
                         System.out.println("Bus NO :: " +data);
                     }
                     if(i == 1)
                     {
                         System.out.println("Source :: " +data);
                     }
                     if(i == 2)
                     {
                         System.out.println("Destination :: " +data);
                     }
                     if(i == 3)
                     {
                         System.out.println("Time :: " +data);
                     }
                     if(i == 4)
                     {
                         System.out.println("Price :: " +data);
                     }
                     if(i == 5 )
                     {
                         System.out.println("Seat :: " +data);
                     }
                     i++;
                 }
                 System.out.println("/////////////////////////////////////////////////////////////////");
          }
          catch (Exception e) {
          }
     }
     public void showBus()
     {
         try
         {
                 FileReader fileReader = new FileReader("BusNumbers.txt");
                 BufferedReader reader = new BufferedReader(fileReader);
                 String data = "";
                 while((data = reader.readLine()) != null)
                 {
                      Display(data+".txt");
                 }
                 BusManagementChooices ac = new BusManagementChooices();
                 ac.busManagementChoices();
         }
         catch (Exception e) 
         {
         }
     }
    
}
