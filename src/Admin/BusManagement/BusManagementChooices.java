
package Admin.BusManagement;

import Admin.AdminChoices;
import Admin.BusManagement.AddBus.AddBusData;
import Admin.BusManagement.DeleteBus.DeleteBusFile;
import Admin.BusManagement.EditBus.EditBusData;
import Admin.BusManagement.ViewAllBus.ShowBus;
import busreservationsystem.Input;

public class BusManagementChooices 
{
      Input input = new Input();
      public void busManagementChoices()
      {
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> A : ADD BUS  <<<<<<<<<<<<<<<<");
          System.out.println(">>>> B : EDIT BUS  <<<<<<<<<<<<<<<<");
          System.out.println(">>>> C : VIEW ALL BUS  <<<<<<<<<<<<");
          System.out.println(">>>> D : DELETE BUS  <<<<<<<<<<<<<<");
          System.out.println(">>>> E  : EXIT     <<<<<<<<<<<<<<<<<<<");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> Enter Your Choice  :::::::::::::::  ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
               AddBusData abd = new AddBusData();
               abd.addBusData();
          }
          else if (str.equals("B"))
          {
              EditBusData busData = new EditBusData();
              busData.inputBusNo();
          }
          else if (str.equals("C"))
          {
              ShowBus bus = new ShowBus();
              bus.showBus();
          }
          else if (str.equals("D"))
          {
              DeleteBusFile busFile = new DeleteBusFile();
              busFile.inputBusNo();
          }
          else if(str.equals("E"))
          {
              AdminChoices ac = new AdminChoices();
              ac.adminChoices();
          }
          else
          {
              System.out.println("Please enter the Choice Between Given Choices ...........................");
              busManagementChoices();
          }
      }
    
}
