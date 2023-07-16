
package Admin.BusManagement.AddBus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StoreBusdata 
{
      public boolean checkBus(String busNo)
      {
          boolean check = true;
          try
          {
                 FileReader fileReader = new FileReader("BusNumbers.txt");
                 BufferedReader reader = new BufferedReader(fileReader);
                 String data = "";
                 while((data = reader.readLine()) != null)
                 {
                       if(data.equals(busNo))
                       {
                           check = false;
                       }
                 }
                 
                 
          } 
          catch (Exception e) 
          {
          }
          return check;
      }
      public void storeBusNumber(String busNo)      
      {
           try 
           {
               FileWriter fileWriter = new FileWriter("BusNumbers.txt", true);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               writer.write(busNo);
               writer.newLine();
               writer.close();
           }
           catch (Exception e) 
           {
           }
      }
      public void storeData(String busNo, String souce, String destination, String time, int price, int seats)
      {
          busNo = busNo.toUpperCase().trim();
          try
          {
              FileWriter fileWriter = new FileWriter(busNo+".txt");
              BufferedWriter writer = new BufferedWriter(fileWriter);
              writer.write(busNo);
              writer.newLine();
              writer.write(souce);
              writer.newLine();
              writer.write(destination);
              writer.newLine();
              writer.write(time);
              writer.newLine();
              writer.write(Integer.toString(price));
              writer.newLine();
              writer.write(Integer.toString(seats));
              writer.newLine();
              writer.close();
              storeBusNumber(busNo);
              System.out.println("Bus Added Successfully !!!....................");
          }
          catch (Exception e) 
          {
          }
      }
}
