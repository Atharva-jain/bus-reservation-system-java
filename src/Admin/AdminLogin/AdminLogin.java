
package Admin.AdminLogin;

import Admin.AdminChoices;
import Admin.HomePage.FrontView;
import busreservationsystem.Input;

public class AdminLogin 
{
    Input input = new Input();
       public void login()
       {
           System.out.println("/////////////////////////////////////////////////////////////////");
           System.out.println("Enter  Username ::: ");
           String username = input.inputString();
           System.out.println("Enter  Password ::: ");
           String password = input.inputString();
           if(username.equals("atharva") && password.equals("atharva"))
           {
                System.out.println("Successfully Login !!!..........................");
                AdminChoices ac = new AdminChoices();
                ac.adminChoices();
           }
           else
           {
               System.out.println("Invalid Username / Password ....................");
               System.out.println("You want to try Again (Yes / No )");
               String str = input.inputString();
               str = str.toUpperCase().trim();
               if(str.equals("YES"))
               {
                   login();
               }
               else
               {
                   FrontView frontView = new FrontView();
                   frontView.designedView();
               }
           }
           System.out.println("/////////////////////////////////////////////////////////////////");
       }
}
