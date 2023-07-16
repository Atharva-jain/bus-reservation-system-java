/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.DisplayUserToManagaData.DisplayUser;

import Admin.DisplayUserToManagaData.AdminChoicesToUSer;
import User.DisplatUserData.DiaplayUSerData;
import User.UserBookingDetails.ShowUserBooking;
import java.io.BufferedReader;
import java.io.FileReader;


public class DisplayHoleUserToAdmin 
{
       public void displayUsers()
       { 
             try
             {
                      DiaplayUSerData data1 = new DiaplayUSerData();
                      FileReader fileReader = new FileReader("UserIDs.txt");
                      BufferedReader reader = new BufferedReader(fileReader);
                      String data = "";
                      while((data = reader.readLine()) !=  null)
                      {
                           data1.displayData(data, 1);
                      }  
                      AdminChoicesToUSer actus = new AdminChoicesToUSer();
                      actus.AdminUserChoices();
              }
             catch (Exception e) {
              }
       }
}
