
package Admin.DisplayAllBusBookingDetails;

import Admin.AdminChoices;
import User.UserBookingDetails.ShowUserBooking;
import User.UserLogin.UserLoginToAccess;
import User.editUserData.EditUserData;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayBusBookingDetails 
{
       Input input = new Input();
       public void displayBookingDetails()
       {
           try
           {
                      ShowUserBooking booking = new ShowUserBooking();
                      FileReader fileReader = new FileReader("bookingnumber.txt");
                      BufferedReader reader = new BufferedReader(fileReader);
                      String data = "";
                      while((data = reader.readLine()) !=  null)
                      {
                           booking.bookingDetails(data);
                      }  
                      AdminChoices ac = new AdminChoices();
                      ac.adminChoices();
           }
           catch (Exception e) {
           }
       }
    
}
