
package Admin.DisplayUserToManagaData.searchUser;

import Admin.DisplayUserToManagaData.AdminChoicesToUSer;
import User.DisplatUserData.DiaplayUSerData;
import User.UserLogin.UserLoginToAccess;
import busreservationsystem.Input;

public class SearchUserDataForAdmin 
{
   public void searchData()
   {
       Input input = new Input();
      try
         {
          System.out.println("/////////////////////////////////////////////////////////////////");
          System.out.println("Enter User ID :::: ");
          int userID = input.integerBug();
          UserLoginToAccess access = new UserLoginToAccess();
          boolean check = access.idIsValid(Integer.toString(userID));
          if(check)
          {
              DiaplayUSerData data1 = new DiaplayUSerData();
              data1.displayData(Integer.toString(userID), 1);
              AdminChoicesToUSer actus = new AdminChoicesToUSer();
              actus.AdminUserChoices();
          }
          else
          {
                    System.out.println("User ID is Not Available  .................");
                    System.out.println("You want try again (Yes / No )");
                    String str = input.inputString();
                    str = str.toUpperCase().trim();
                   if(str.equals("YES"))
                   {
                         searchData();
                         AdminChoicesToUSer actus = new AdminChoicesToUSer();
                         actus.AdminUserChoices();
                   }
                  else
                   {
                         AdminChoicesToUSer actus = new AdminChoicesToUSer();
                         actus.AdminUserChoices();
                         
                   }
          }
      } 
      catch (Exception e) {
      }
   }
    
}
