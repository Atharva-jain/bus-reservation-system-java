
package Admin.BusManagement.DeleteBus;

import Admin.AdminChoices;
import Admin.BusManagement.BusManagementChooices;
import Admin.BusManagement.EditBus.EditBusData;
import busreservationsystem.CheckBusNumber;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DeleteBusFile
{
      Input input = new Input();
      public void replaceData()
     {
         try
         {
            
               FileReader fileReader = new FileReader("temp.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("BusNumbers.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      writer.write(data);
                      writer.newLine();
               }
               writer.close();
               reader.close();
         }
         catch (Exception e) 
         {
         }
     }
      public void removeBusNo(String busNo)
      {
         try
         {
               FileReader fileReader = new FileReader("BusNumbers.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("temp.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      if(data.equals(busNo))
                      {
                          writer.write("");
                      }
                      else
                      {
                         writer.write(data);
                         writer.newLine();
                      }
               }
               writer.close();
               reader.close();
               replaceData();
          }
         catch (Exception e) 
          {
          }
      }
      public void inputBusNo()
      {
            
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Enter Bus No ::: ");
            String busNo = input.inputString();
            CheckBusNumber busNumber = new CheckBusNumber();
            boolean check =  busNumber.checkBusNumber(busNo);
            if(check)
            {
               deleteBusFile(busNo);
             }
            else
            {
              System.out.println("Bus Number is Not Available .................");
              System.out.println("You want try again (Yes / No )");
              String str = input.inputString();
              str = str.toUpperCase().trim();
               if(str.equals("YES"))
               {
                     inputBusNo();
               }
               else
               {
                     BusManagementChooices ac = new BusManagementChooices();
                     ac.busManagementChoices();
               }
            }
            System.out.println("/////////////////////////////////////////////////////////////////");
      }
      public void deleteBusFile(String busNo)
      {
          File file = new File(busNo+".txt");
            if(file.delete())
            {
                System.out.println("File Deleted Successfully ...........");
                removeBusNo(busNo);
            }
            else
            {
                System.out.println("File are not Deleted  ...........");
                BusManagementChooices ac = new BusManagementChooices();
                ac.busManagementChoices();
            }
      }
}
