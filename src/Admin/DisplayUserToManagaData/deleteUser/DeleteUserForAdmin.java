/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.DisplayUserToManagaData.deleteUser;

import Admin.DisplayUserToManagaData.AdminChoicesToUSer;
import User.UserLogin.UserLoginToAccess;
import User.editUserData.EditUserData;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author MCT
 */
public class DeleteUserForAdmin 
{
     Input input = new Input();
     
      public void replaceData()
     {
         try
         {
            
               FileReader fileReader = new FileReader("temp.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("UserIDs.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      writer.write(data);
                      writer.newLine();
               }
               writer.close();
               reader.close();
         }
         catch (Exception e) 
         {
         }
     }
      public void removeUserNo(String userID)
      {
         try
         {
               FileReader fileReader = new FileReader("UserIDs.txt");
               BufferedReader reader = new BufferedReader(fileReader);
               FileWriter fileWriter = new FileWriter("temp.txt", false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               String data =  "";
               while((data = reader.readLine()) != null)
               {
                      if(data.equals(userID))
                      {
                          writer.write("");
                      }
                      else
                      {
                         writer.write(data);
                         writer.newLine();
                      }
               }
               writer.close();
               reader.close();
               replaceData();
          }
         catch (Exception e) 
          {
          }
      }
     
      public void deleteUserFile(String userID)
      {
          File file = new File(userID+".txt");
            if(file.delete())
            {
                System.out.println("File Deleted Successfully ...........");
                removeUserNo(userID);
            }
            else
            {
                System.out.println("File are not Deleted  ...........");
            }
      }
      
     public void deleteUser()
     {
            System.out.println("/////////////////////////////////////////////////////////////////");
            System.out.println("Enter User ID :::: ");
            int userID = input.integerBug();
            UserLoginToAccess access = new UserLoginToAccess();
            boolean check = access.idIsValid(Integer.toString(userID));
            if(check)
            {
                  deleteUserFile(Integer.toString(userID));
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
                         deleteUser();
                   }
                  else
                   {
                         AdminChoicesToUSer actus = new AdminChoicesToUSer();
                         actus.AdminUserChoices();
                   }
                
            }
     }
}
