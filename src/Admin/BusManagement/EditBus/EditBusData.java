package Admin.BusManagement.EditBus;

import Admin.AdminChoices;
import Admin.BusManagement.BusManagementChooices;
import busreservationsystem.CheckBusNumber;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class EditBusData
{
      Input input = new Input();
      public void inputBusNo()
      {
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Enter Bus No ::: ");
            String busNo = input.inputString();
            CheckBusNumber busNumber = new CheckBusNumber();
            boolean check =  busNumber.checkBusNumber(busNo);
            if(check)
            {
               editBusChoice(busNo);
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
                     BusManagementChooices ac = new BusManagementChooices();
                     ac.busManagementChoices();
               }
               else
               {
                     BusManagementChooices ac = new BusManagementChooices();
                     ac.busManagementChoices();
               }
            }
            System.out.println("/////////////////////////////////////////////////////////////////");
      }
      
       public void replaceData(String busNo)
    {
        try
        {
            FileReader fileReader = new FileReader("temp.txt");
            FileWriter fileWriter = new FileWriter(busNo,false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                writer.write(data);
                writer.newLine();
                i++;
            }
            writer.close();
            reader.close();
        }
        catch (Exception e) 
        {
           
        }
     }
      
      public void editBusData(String busNo, String valueOfUpdate, int index)
      {
         try
        {
            FileReader fileReader = new FileReader(busNo);
            FileWriter fileWriter = new FileWriter("temp.txt",false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                if(i==index)
                {
                     data = data.replaceAll(data, valueOfUpdate);
                     writer.write(data);
                     writer.newLine();
                }
                else
                {
                    writer.write(data);
                    writer.newLine();
                }
                i++;
            }
            writer.close();
            reader.close();
            replaceData(busNo);
            System.out.println("SUCCESSFULLY UPDATE!!!");
           }
           catch (Exception e) 
           {
           }
      }
      public void editBusChoice(String busNo)
      {
          try
          {
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("+++++++++++++ A  :  Update Bus Source +++++++++++++++++++++");
                          System.out.println("+++++++++++++ B  :  Update Bus Destination +++++++++++++++++");
                          System.out.println("+++++++++++++ C  :  Update Bus Time ++++++++=+++++++++++++");
                          System.out.println("+++++++++++++ D  :  Update Bus Price  +++++++++++++++++++++");
                          System.out.println("+++++++++++++ E  :  Update Bus  Seats ++++++++++++++++++++++");
                          System.out.println("+++++++++++++ X  :  Exit ++++++++++++++++++++++++++++++++");
                          System.out.println("+++++++++++++ Enter your Choice ::: ");
                          String choice =  input.inputString();
                          choice = choice.toUpperCase().trim();
                          if(choice.equals("A"))
                          {
                                System.out.println("Enter Bus Source  ::: ");
                                String source = input.inputString();
                                editBusData(busNo+".txt", source, 1);
                              
                          }
                          else if(choice.equals("B"))
                          {
                              System.out.println("Enter Bus Destination  ::: ");
                              String source = input.inputString();
                              editBusData(busNo+".txt", source, 2);
                              
                              
                          }
                          else if(choice.equals("C"))
                          {
                              
                              System.out.println("Enter Bus Time  ::: ");
                              String source = input.inputString();
                              editBusData(busNo+".txt", source, 3);
                              
                          }
                          else if(choice.equals("D"))
                          {
                                System.out.println("Enter Bus Price  ::: ");
                                int price = input.integerBug();
                                String source = Integer.toString(price);
                                editBusData(busNo+".txt", source, 4);
                          }
                          else if(choice.equals("E"))
                          {
                                System.out.println("Enter Bus Seats  ::: ");
                                int price = input.integerBug();
                                String source = Integer.toString(price);
                                editBusData(busNo+".txt", source, 5);
                          }
                          else if(choice.equals("X"))
                          {
                              
                          }
                          else
                          {
                              System.out.println("Enter the Choice Between the given Choices .......................");
                              editBusChoice(busNo);
                          }
                          
          }
          catch (Exception e) {
          }
          
           
      }
}
