
package Admin.BusManagement.AddBus;

import Admin.AdminChoices;
import Admin.BusManagement.BusManagementChooices;
import busreservationsystem.Input;


public class AddBusData
{
      Input input = new Input();
      public void addBusData()
      {
          System.out.println("/////////////////////////////////////////////////////////////////");
          System.out.println("Enter the BUS NO ::: ");
          String busNo = input.inputString();
          System.out.println("Enter the Source ::: ");
          String source = input.inputString();
          source = source.toUpperCase().trim();
          System.out.println("Enter the Destination ::: ");
          String destination = input.inputString();
          destination = destination.toUpperCase().trim();
          System.out.println("Enter the Time ::: ");
          String time = input.inputString();
          System.out.println("Enter the price ::: ");
          int  price = input.integerBug();
          System.out.println("Enter the Seats ::: ");
          int seats = input.integerBug();
          System.out.println("/////////////////////////////////////////////////////////////////");
          StoreBusdata busdata = new StoreBusdata();
          busNo = busNo.toUpperCase().trim();
          boolean check = busdata.checkBus(busNo);
          if(check)
          {
               busdata.storeData(busNo, source, destination, time, price, seats);
               BusManagementChooices ac = new BusManagementChooices();
               ac.busManagementChoices();
          }
          else
          {
              System.out.println("Bus Number is Already Available .................");
              System.out.println("You want try again (Yes / No )");
              String str = input.inputString();
              str = str.toUpperCase().trim();
               if(str.equals("YES"))
               {
                     addBusData();
               }
               else
               {
                     BusManagementChooices ac = new BusManagementChooices();
                     ac.busManagementChoices();
               }
          }
          
      }
    
}
