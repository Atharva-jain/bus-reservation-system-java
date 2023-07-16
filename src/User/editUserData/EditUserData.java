/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.editUserData;

import User.NewUser.CreateUser;
import User.UserSelectiveOption;
import busreservationsystem.Input;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author MCT
 */
public class EditUserData 
{
    Input input = new Input();
    CreateUser createUser = new CreateUser();
    
     public void replaceData(String fileName)
    {
        try
        {
            FileReader fileReader = new FileReader("temp.txt");
            FileWriter fileWriter = new FileWriter(fileName,false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                writer.write(data);
                writer.newLine();
                i++;
            }
            writer.close();
            reader.close();
        }
        catch (Exception e) 
        {
           
        }
     }
    public void updateData(String fileName, String valueOfUpdate, int index)
       {
        try
        {
            FileReader fileReader = new FileReader(fileName);
            FileWriter fileWriter = new FileWriter("temp.txt",false);
            BufferedReader reader= new BufferedReader(fileReader);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            
            String data = "";
            int i =0;
            while((data = reader.readLine()) != null)
            {
                if(i==index)
                {
                     data = data.replaceAll(data, valueOfUpdate);
                     writer.write(data);
                     writer.newLine();
                }
                else
                {
                    writer.write(data);
                    writer.newLine();
                }
                i++;
            }
            writer.close();
            reader.close();
            replaceData(fileName);
            System.out.println("SUCCESSFULLY UPDATE!!!");
          }
           catch(Exception e){}
       }
    
    
    public void editData(String UserID, int index)
    {
             boolean check = true;
             try
             {
                     UserID = UserID+".txt";
                     while(check)
                     {
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");  
                          System.out.println("+++++++++++++ A  :  Update your Name +++++++++++++++++++++");
                          System.out.println("+++++++++++++ B  :  Update your Gender ++++++++++++++++++++");
                          System.out.println("+++++++++++++ C  :  Update your Phone Number  ++++++++++++++");
                          System.out.println("+++++++++++++ D  :  Update your Address  ++++++++++++++++++");
                          System.out.println("+++++++++++++ E  :  Update your Username +++++++++++++++");
                          System.out.println("+++++++++++++ X  :  Exit ++++++++++++++++++++++++++++++++");
                          System.out.println("+++++++++++++ Enter your Choice ::: ");
                          String choice =  input.inputString();
                          choice = choice.toUpperCase().trim();
                          switch(choice)
                          {
                                case "A" :
                                      System.out.println("Enter  Name :::: ");
                                      String temp = input.inputString();
                                      temp = temp.trim();
                                      updateData(UserID, temp, 1);
                                      break;
                                 case "B" :
                                      System.out.println("Gender Choice :::: ");
                                      temp = createUser.genderChoice();
                                      temp = temp.trim();
                                      updateData(UserID, temp, 2);
                                      break;
                                case "C" :
                                      System.out.println("Enter phone No :::: ");
                                      long tmp = input.longBug();
                                      updateData(UserID, Long.toString(tmp), 3);
                                      break;     
                                case "D" :
                                      System.out.println("Enter Address :::: ");
                                      temp =  input.inputString();
                                      temp = temp.trim();
                                      updateData(UserID, temp, 4);
                                      break;
                                case "E" :
                                      System.out.println("Enter Username :::: ");
                                      temp =  input.inputString();
                                      temp = temp.trim();
                                      updateData(UserID, temp, 5);
                                      break;
                                case "X" :
                                      check = false;
                                      break;
                                default:
                                    System.out.println("Enter the Value between the given Choices ...........................");
                                           
                          }
                     }
                     if(check == false)
                     {
                         if(index == 0 ){
                             UserSelectiveOption option = new UserSelectiveOption();
                             option.userSelectiveOption(UserID);
                         }
                         if(index  == 1){
                              
                         }
                     }
             }
             catch (Exception e) 
             {
              }
       }
    
}
