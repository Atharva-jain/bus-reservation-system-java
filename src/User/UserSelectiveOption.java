
package User;

import Admin.AdminChoices;
import Admin.DisplayUserToManagaData.DisplayUser.DisplayHoleUserToAdmin;
import Admin.DisplayUserToManagaData.deleteUser.DeleteUserForAdmin;
import Admin.DisplayUserToManagaData.editUser.EditUserDataForAdmin;
import Admin.DisplayUserToManagaData.searchUser.SearchUserDataForAdmin;
import User.BookBus.BusBooking;
import User.DisplatUserData.DiaplayUSerData;
import User.UserBookingDetails.ShowUserBooking;
import User.editUserData.EditUserData;
import busreservationsystem.Input;


public class UserSelectiveOption
{
      public void userSelectiveOption(String userID)
      {
          Input input = new Input();
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> A : BOOK BUS   <<<<<<<<<<<<<<<");
          System.out.println(">>>> B : EDIT DATA  <<<<<<<<<<<<<<<<");
          System.out.println(">>>> C : DISPLAY DETAILS <<<<<<<<<<<");
          System.out.println(">>>> D : BOOKING DETAILS <<<<<<<<<<");
          System.out.println(">>>> E  : EXIT     <<<<<<<<<<<<<<<<<<<");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> Enter Your Choice  :::::::::::::::  ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
                 BusBooking bb = new BusBooking();
                 bb.bookingBus(userID);
          }
          else if (str.equals("B"))
          {
                 EditUserData data = new EditUserData();
                 data.editData(userID, 0);
          }
          else if (str.equals("C"))
          {
                 DiaplayUSerData data = new DiaplayUSerData();
                 data.displayData(userID, 0);
          }
          else if (str.equals("D"))
          {
              ShowUserBooking booking = new ShowUserBooking();
              booking.showBusBookingDetails(userID);
          }
          else if(str.equals("E"))
          {
                UserChoices choices = new UserChoices();
                choices.userChoices();
          }
          else
          {
              System.out.println("Please enter the Choice Between Given Choices ...........................");
              userSelectiveOption(userID);
          }
      }
}
