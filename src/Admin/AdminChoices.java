
package Admin;

import Admin.BusManagement.BusManagementChooices;
import Admin.DisplayAllBusBookingDetails.DisplayBusBookingDetails;
import Admin.DisplayUserToManagaData.AdminChoicesToUSer;
import Admin.HomePage.FrontView;
import Admin.ShowAllBookingDetails.DisplayAllBookings;
import busreservationsystem.Input;


public class AdminChoices 
{
     Input input = new Input();
     public void adminChoices()
     {
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> A : BOOKING DETAILS <<<<<<<<<");
          System.out.println(">>>> B : BOOKING MANAGEMENT  <<<");
          System.out.println(">>>> C : USER MANAGEMENT  <<<<<<<");
          System.out.println(">>>> E  : EXIT     <<<<<<<<<<<<<<<<<<<");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> Enter Your Choice  :::::::::::::::  ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
                DisplayBusBookingDetails bookingDetails = new DisplayBusBookingDetails();
                bookingDetails.displayBookingDetails();
          }
          else if (str.equals("B"))
          {
                BusManagementChooices bmc = new BusManagementChooices();
                bmc.busManagementChoices();
          }
          else if (str.equals("C"))
          {
                AdminChoicesToUSer actus = new AdminChoicesToUSer();
                actus.AdminUserChoices();
          }
          else if(str.equals("E"))
          {
               FrontView frontView = new FrontView();
               frontView.designedView();
          }
          else
          {
              System.out.println("Please enter the Choice Between Given Choices ...........................");
              adminChoices();
          }
     }
    
}
