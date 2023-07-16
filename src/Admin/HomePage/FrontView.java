
package Admin.HomePage;

import Admin.AdminLogin.AdminLogin;
import User.UserChoices;
import busreservationsystem.Input;

public class FrontView 
{
      Input input = new Input();
      public void designedView()
      {
          System.out.println("/////////////////////////////////////////////////////////////////////");
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>>BUS MANAGEMENT SYSTEM<<<<");
          System.out.println("/////////////////////////////////////////////////////////////////////");
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> A : ADMIN <<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>> B : USER    <<<<<<<<<<<<<<<<<<<");
          System.out.println(">>>> E  : EXIT     <<<<<<<<<<<<<<<<<<<");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> Enter Your Choice  :::::::::::::::  ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
                AdminLogin adminLogin = new AdminLogin();
                adminLogin.login();
          }
          else if (str.equals("B"))
          {
                UserChoices choices = new UserChoices();
                choices.userChoices();
          }
          else if(str.equals("E"))
          {
              System.exit(0);
          }
          else
          {
              System.out.println("Please enter the Choice Between Given Choices ...........................");
              designedView();
          }
      }
    
}
