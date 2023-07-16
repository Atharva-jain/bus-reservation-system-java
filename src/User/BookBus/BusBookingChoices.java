
package User.BookBus;

import Admin.BusManagement.ViewAllBus.ShowBus;
import User.UserSelectiveOption;
import busreservationsystem.CheckBusNumber;
import busreservationsystem.Input;
import java.util.ArrayList;


public class BusBookingChoices
{
    ShowBus bus = new ShowBus();
    public void busBookingChoices (ArrayList<String> list, String userID,  String seat)
    {
         BookData bd = new BookData();
         int listSize = list.size();
         for(String data : list)
         {
             bus.Display(data+".txt");
         }
          System.out.println("/////////////////////////////////////////////////////////////////");
          System.out.println("Enter Bus Number To Book ::: ");
          Input input = new Input();
          String busNumber = input.inputString();
          busNumber.toUpperCase().trim();
          CheckBusNumber busNumber1 = new CheckBusNumber();
          boolean check = busNumber1.checkBusNumber(busNumber);
          if(check)
          {
              BookData bd1 = new BookData();
              bd1.bookData(busNumber, userID, seat);
          }
          else
          {
              System.out.println("Bus Number is Already Available .................");
              System.out.println("You want try again (Yes / No )");
              String str = input.inputString();
              str = str.toUpperCase().trim();
               if(str.equals("YES"))
               {
                     busBookingChoices(list, userID, seat);
               }
               else
               {
                      UserSelectiveOption option = new UserSelectiveOption();
                      option.userSelectiveOption(userID);
               }
          }
    }
}
