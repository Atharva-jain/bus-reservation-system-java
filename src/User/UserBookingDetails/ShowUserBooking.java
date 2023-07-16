
package User.UserBookingDetails;

import User.UserSelectiveOption;
import java.io.BufferedReader;
import java.io.FileReader;


public class ShowUserBooking 
{  
      public void  bookingDetails(String fileName)
      {
           try
           {
                      FileReader fileReader = new FileReader(fileName+".txt");
                      BufferedReader reader = new BufferedReader(fileReader);
                      String data = "";
                      int  i = 0 ;
                      System.out.println("/////////////////////////////////////////////////////////////////");
                      while((data = reader.readLine()) != null)
                      {
                             if( i == 0 )
                             {
                                 System.out.println("User ID ::: "+data);
                             }
                             if( i == 1 )
                             {
                                 System.out.println("Name ::: "+data);
                             }
                             if( i == 2 )
                             {
                                 System.out.println("Bus Number ::: "+data);
                             }
                             if( i == 3 )
                             {
                                 System.out.println("Source ::: "+data);
                             }
                             if( i == 4 )
                             {
                                 System.out.println("Destination ::: "+data);
                             }
                             if( i == 5 )
                             {
                                 System.out.println("Time ::: "+data);
                             }
                             if( i == 6 )
                             {
                                 System.out.println("Price ::: "+data);
                             }
                             if( i == 7 )
                             {
                                 System.out.println("Seats Book  ::: "+data);
                             }
                              i++;
                      }
                      System.out.println("/////////////////////////////////////////////////////////////////");
               
                
           }
           catch (Exception e) 
           {
          }
      }
      
      public void showBusBookingDetails(String userID)
      {
             try 
             {
                      System.out.println("/////////////////////////////////////////////////////////////////");
                      FileReader fileReader = new FileReader(userID+"booking.txt");
                      BufferedReader reader = new BufferedReader(fileReader);
                      String data = "";
                      while((data = reader.readLine()) != null)
                      {
                          bookingDetails(data);
                      }
                      UserSelectiveOption option = new UserSelectiveOption();
                      option.userSelectiveOption(userID);
                      System.out.println("/////////////////////////////////////////////////////////////////");
             } 
             catch (Exception e) 
              {
                  System.out.println("You are not Book any Bus ............................................");
              }
    
      }
}
