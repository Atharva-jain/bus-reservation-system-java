
package Admin.DisplayUserToManagaData.editUser;

import Admin.DisplayUserToManagaData.AdminChoicesToUSer;
import User.UserLogin.UserLoginToAccess;
import User.editUserData.EditUserData;
import busreservationsystem.Input;

public class EditUserDataForAdmin
{
       Input input = new Input();
       public void editUserData()
       {
           
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Enter User ID :::: ");
            int userID = input.integerBug();
            UserLoginToAccess access = new UserLoginToAccess();
            boolean check = access.idIsValid(Integer.toString(userID));
            if(check)
            {
                  EditUserData data = new EditUserData();
                  data.editData(Integer.toString(userID),1);
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
                         editUserData();
                   }
                  else
                   {
                         AdminChoicesToUSer actus = new AdminChoicesToUSer();
                         actus.AdminUserChoices();
                   }
                
            }
       }
}
