
package User;

import Admin.BusManagement.BusManagementChooices;
import Admin.DisplayAllBusBookingDetails.DisplayBusBookingDetails;
import Admin.DisplayUserToManagaData.AdminChoicesToUSer;
import Admin.HomePage.FrontView;
import User.NewUser.CreateUser;
import User.UserForgotPassword.UserForgotPassword;
import User.UserLogin.UserLoginToAccess;
import busreservationsystem.Input;

public class UserChoices 
{
      Input input = new Input();
      public void userChoices()
      {
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> A : USER LOGIN  <<<<<<<<<<<<<<");
          System.out.println(">>>> B : CREATE USER  <<<<<<<<<<<<<");
          System.out.println(">>>> C : FORGOT PASSWORD  <<<<<<<<");
          System.out.println(">>>> E  : EXIT     <<<<<<<<<<<<<<<<<<<");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> Enter Your Choice  :::::::::::::::  ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
                 UserLoginToAccess access = new UserLoginToAccess();
                 access.loginUser();
          }
          else if (str.equals("B"))
          {
                CreateUser createUser = new CreateUser();
                createUser.customerDetails();
          }
          else if (str.equals("C"))
          {
                UserForgotPassword forgotPassword = new UserForgotPassword();
                forgotPassword.forgotPassword();
          }
          else if(str.equals("E"))
          {
               FrontView frontView = new FrontView();
               frontView.designedView();
          }
          else
          {
              System.out.println("Please enter the Choice Between Given Choices ...........................");
              userChoices();
          }
     }
 }
   

