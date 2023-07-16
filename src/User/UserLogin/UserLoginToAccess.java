/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.UserLogin;

import User.UserChoices;
import User.UserSelectiveOption;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author MCT
 */
public class UserLoginToAccess 
{
      Input input = new Input();
      public String getPassword(String userID)
      {
          String passwordDemo ="";
          try
          {
              FileReader fileReader = new FileReader(userID+".txt");
              BufferedReader reader = new BufferedReader(fileReader);
              String data =  " ";
              int i  = 0 ;
              while((data = reader.readLine()) != null)
              {
                  if(i == 6)
                  {
                      passwordDemo = data;
                      break;
                  }
                   i++;
              }
              reader.close();
          } 
          catch(Exception e)
          {}
        return passwordDemo;
      }
      
      public String getUsername(String userID)
      {
          String  usernameDemo ="";
          try
          {
              FileReader fileReader = new FileReader(userID+".txt");
              BufferedReader reader = new BufferedReader(fileReader);
              String data =  " ";
              int i  = 0 ;
              while((data = reader.readLine()) != null)
              {
                  if(i == 5)
                  {
                      usernameDemo = data;
                      break;
                  }
                   i++;
              }
              reader.close();
          } 
          catch(Exception e)
          {}
        return usernameDemo;
      }
      
      public boolean idIsValid(String ID)
      {
          boolean check = false;
           try
           {
                FileReader fileReader = new FileReader("UserIDs.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = "";
                while((data = reader.readLine()) != null)
                {
                    if(data.equals(ID))
                    {
                        check = true;
                    }
                }
           }
           catch (Exception e) 
           {
                
           }
           return check;
      }
      public void loginUser()
      {
          System.out.println("/////////////////////////////////////////////////////////////////");
          System.out.println("Enter the User ID ::: ");
          int id = input.integerBug();
          boolean check = idIsValid(Integer.toString(id));
          if(check)
          {
                System.out.println("Enter the Username :::: ");
                String username = input.inputString();
                username = username.trim();
                System.out.println("Enter the Password :::: ");
                String password = input.inputString();
                password = password.trim();
                String usernameCheck = getUsername(Integer.toString(id));
                String passwordCheck = getPassword(Integer.toString(id));
                if(usernameCheck.equals(username) && passwordCheck.equals(password))
                {
                    System.out.println("Login Succesfully !!! ........................");
                    UserSelectiveOption option = new UserSelectiveOption();
                    option.userSelectiveOption(Integer.toString(id));
                }
                else
                {
                    System.out.println("Invalid Username / Password  .................");
                    System.out.println("You want try again (Yes / No )");
                    String str = input.inputString();
                    str = str.toUpperCase().trim();
                   if(str.equals("YES"))
                   {
                        loginUser();
                   }
                  else
                   {
                        UserChoices choices = new UserChoices();
                        choices.userChoices();
                   }
                }
          }
      }
    
}
