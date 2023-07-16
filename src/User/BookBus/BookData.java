
package User.BookBus;

import User.UserSelectiveOption;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BookData 
{
      String userID, name;
      String busNumber, sorce, destination, time, price;
      
      public void storePerticularBusBooking(String userID, String busNO)
      {
          try
          {
                     FileWriter fileWriter = new FileWriter(userID+"booking.txt", true);
                     BufferedWriter writer = new BufferedWriter(fileWriter);
                     writer.write(busNO);
                     writer.newLine();
                     writer.close();
          }
          catch (Exception e) 
          {
              
              
          }
      }
      
      public void storeAllBusNumber(String busNo)
      {
            try 
            {
                     FileWriter fileWriter = new FileWriter("bookingnumber.txt", true);
                     BufferedWriter writer = new BufferedWriter(fileWriter);
                     writer.write(busNo);
                     writer.newLine();
                     writer.close();
            } 
            catch (Exception e) 
            {
             }
          
      }
      
      public void getBusData(String busNo)
      {
          try
          {
               FileReader fileReader = new FileReader(busNo+".txt");
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";               
               int i =0 ;
               while((data = reader.readLine()) != null)
               {
                   if(i == 0)
                   {
                       busNumber = data;
                   }
                   if(i == 1)
                   {
                       sorce = data;
                   }
                   if(i == 2)
                   {
                       destination = data;
                   }
                   if(i == 3)
                   {
                       time = data;
                   }
                   if(i == 4)
                   {
                       price = data;
                   }
                   
                   i++;
               }
               reader.close();
          }
          catch (Exception e) 
          {
          }
      }
      
      public void getUserData(String UserId)
      {
           try
           {
               FileReader fileReader = new FileReader(UserId+".txt");
               BufferedReader reader = new BufferedReader(fileReader);
               String data =  "";               
               int i =0 ;
               while((data = reader.readLine()) != null)
               {
                   if(i == 0)
                   {
                       userID = data;
                   }
                   if(i == 1)
                   {
                       name = data;
                   }
                   i++; 
                       
               }
               reader.close();
          }
           catch (Exception e) 
           {
          }
      }
      public void bookData(String busNo, String userId, String seat)
      {
           try
           {
                getUserData(userId);
                getBusData(busNo);
                try 
                {
                    FileWriter fileWriter = new FileWriter(userId+busNo+"booking.txt");
                    BufferedWriter writer = new BufferedWriter(fileWriter);
                    writer.write(userID);
                    writer.newLine();
                    writer.write(name);
                    writer.newLine();
                    writer.write(busNumber);
                    writer.newLine();
                    writer.write(sorce);
                    writer.newLine();
                    writer.write(destination);
                    writer.newLine();
                    writer.write(time);
                    writer.newLine();
                    writer.write(price);
                    writer.newLine();
                    writer.write(seat);
                    writer.newLine();
                    writer.close();
                    System.out.println("Bus Are book ....................................");
                    storeAllBusNumber(userId+busNo+"booking");
                    storePerticularBusBooking(userId, userId+busNo+"booking" );
                    
               }
                catch (Exception e) 
               {
               }
            }
           catch (Exception e)
            {
          }
      }
}
