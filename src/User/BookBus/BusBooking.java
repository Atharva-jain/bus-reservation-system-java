
package User.BookBus;

import User.UserChoices;
import User.UserSelectiveOption;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import jdk.nashorn.internal.objects.NativeRegExp;
import sun.java2d.pipe.BufferedBufImgOps;

public class BusBooking 
{
      static ArrayList<String> busavailable = new ArrayList<String>();
      Input input = new Input();
      boolean check = false;
      
      public void checkDataFromFile(String busNo, String source, String destination)
      {
           String  sourceCheck = "", destinationCheck = "";
           try
          {
                FileReader fileReader = new FileReader(busNo+".txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data =  "" ;
                int i = 0 ;
                while((data = reader.readLine()) != null)
                {
                      if(i == 1)
                      {
                          sourceCheck = data;
                      }
                      if(i==2)
                      {
                           
                          destinationCheck = data;
                      }
                      if(source.equals(sourceCheck)  && destination.equals(destinationCheck))
                      {
                          check = true;
                          busavailable.add(busNo);
                          break;
                      }
                      i++;
                }
                reader.close();
          } 
          catch (Exception e) 
          {
          }
      }
     
      public void cheekingAvailableBus(String source, String destination)
      {
     
          try
          {
                FileReader fileReader = new FileReader("BusNumbers.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data =  "" ;
                int i = 0 ;
                while((data = reader.readLine()) != null)
                {
                      checkDataFromFile(data, source, destination);
                }
                reader.close();
          } 
          catch (Exception e) 
          {
          }
      }
      
      
      public void bookingBus(String userID)
      {
            System.out.println("/////////////////////////////////////////////////////////////////");
            busavailable.clear();
            System.out.println("Enter Source :: ");
            String source = input.inputString();
            source = source.toUpperCase().trim();
            System.out.println("Enter Destination :: ");
            String destination = input.inputString();
            destination = destination.toUpperCase().trim();
            System.out.println("Enter Seats to Book ::");
            int seats = input.integerBug();
            String seatString = Integer.toString(seats);
            cheekingAvailableBus(source, destination);
            if(check)
            {
                check = false;
            if(busavailable != null)
            {
                 BusBookingChoices bbc = new BusBookingChoices();
                 bbc.busBookingChoices(busavailable, userID, seatString);
            }
            if(busavailable.isEmpty())
            {
                 System.out.println("Bus are not Available ...................");  
                 System.out.println("You want to try again (YES / NO )");
                 String str = input.inputString();
                 str = str.toUpperCase().trim();
                 if(str.equals("YES"))
                {
                    bookingBus(userID);
                }
                else
               {
                     UserChoices  choices = new UserChoices();
                     choices.userChoices();
               }
             }
           }
           else
           {
                 System.out.println("Bus are not Available ...................");  
                 System.out.println("You want to try again (YES / NO )");
                 String str = input.inputString();
                 str = str.toUpperCase().trim();
                 if(str.equals("YES"))
                {
                    bookingBus(userID);
                }
                else
               {
                     UserSelectiveOption option = new UserSelectiveOption();
                     option.userSelectiveOption(userID);
               }
           }
      }
    
}
