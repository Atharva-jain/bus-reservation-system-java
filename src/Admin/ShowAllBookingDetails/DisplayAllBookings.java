/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.ShowAllBookingDetails;

import User.UserBookingDetails.ShowUserBooking;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author MCT
 */
public class DisplayAllBookings 
{
     public void displayAllBooking()
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
          }
          catch (Exception e) 
          {
               
          }
     }
    
}
