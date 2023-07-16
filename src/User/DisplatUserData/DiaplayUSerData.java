/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.DisplatUserData;

import User.UserSelectiveOption;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author MCT
 */
public class DiaplayUSerData
{
     public void displayData(String userId, int index)
     {
          try
           {
                      FileReader fileReader = new FileReader(userId+".txt");
                      BufferedReader reader = new BufferedReader(fileReader);
                      String data = "";
                      int  i = 0 ;
                      System.out.println("/////////////////////////////////////////////////////////////////");
                      while((data = reader.readLine()) != null)
                      {
                             if( i == 0 )
                             {
                                 System.out.println("User ID ::: "+data);
                             }
                             if( i == 1 )
                             {
                                 System.out.println("Name ::: "+data);
                             }
                             if( i == 2 )
                             {
                                 System.out.println("Gender ::: "+data);
                             }
                             if( i == 3 )
                             {
                                 System.out.println("Phone Number ::: "+data);
                             }
                             if( i == 4 )
                             {
                                 System.out.println("Address ::: "+data);
                             }
                             if( i == 5 )
                             {
                                 System.out.println("Username ::: "+data);
                             }
                              
                              i++;
                      }
                      System.out.println("/////////////////////////////////////////////////////////////////");
                      if(index == 0)
                      {
                          UserSelectiveOption option = new UserSelectiveOption();
                          option.userSelectiveOption(userId);
                      }
           }
           catch (Exception e) 
           {
           }
     }
    
}
