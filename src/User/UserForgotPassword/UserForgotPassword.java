
package User.UserForgotPassword;
import User.UserChoices;
import User.UserLogin.UserLoginToAccess;
import User.editUserData.EditUserData;
import busreservationsystem.Input;

public class UserForgotPassword 
{
      Input input = new Input();
      public void forgotPassword()
      {
          System.out.println("/////////////////////////////////////////////////////////////////");
          System.out.println("Enter User ID :::: ");
          int userID = input.integerBug();
          UserLoginToAccess access = new UserLoginToAccess();
          boolean check = access.idIsValid(Integer.toString(userID));
          if(check)
          {
                System.out.println("Enter Username ::: ");
                String username = input.inputString();
                String usernameCheck = access.getUsername(Integer.toString(userID));
                if(usernameCheck.equals(username))
                {
                     System.out.println("Enter New Password ::: ");
                     String password = input.inputString();
                     EditUserData data = new EditUserData();
                     data.updateData(Integer.toString(userID)+".txt", password, 6);
                     System.out.println("Password Changed Successfully !!!.........................");
                     UserChoices  choices = new UserChoices();
                     choices.userChoices();
                }
                else
                {
                    System.out.println("Invalid Username / Password  .................");
                    System.out.println("You want try again (Yes / No )");
                    String str = input.inputString();
                    str = str.toUpperCase().trim();
                   if(str.equals("YES"))
                   {
                        forgotPassword();
                        
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
                 
                    System.out.println("User ID is Not Available  .................");
                    System.out.println("You want try again (Yes / No )");
                    String str = input.inputString();
                    str = str.toUpperCase().trim();
                   if(str.equals("YES"))
                   {
                         forgotPassword();
                   }
                  else
                   {
                          UserChoices  choices = new UserChoices();
                          choices.userChoices();
                   }
                
          }
      }
      
    
}
