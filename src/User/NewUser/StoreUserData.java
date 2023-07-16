
package User.NewUser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StoreUserData
{
    public void storeUserID(String userID)
    {
        try
        {
                FileWriter writer = new FileWriter("UserIDs.txt", true);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(userID);
                buffWriter.newLine();
                buffWriter.close();
        } catch (Exception e) {
        }
 
    }
    public int getCustomerID()
    {
        //  these variable is used to store unique value 
         int number = 0 ;
         try
         {
                FileReader fileReader = new FileReader("UserID.txt");
                BufferedReader reader = new BufferedReader(fileReader);
                String data = reader.readLine();
                number = Integer.parseInt(data);
                number = number + 1;
                reader.close();
                FileWriter writer = new FileWriter("UserID.txt", false);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                buffWriter.write(Integer.toString(number));
                buffWriter.close();
                
         }
         catch (Exception e) 
         {
         }
         return number;
    }
    public void storeData(String custName, String custGender, long mobileNo, String custAddress, 
               String custGmail, String custPassword)
       {
           int customerID = getCustomerID();
           String customerIDS = Integer.toString(customerID);
           custGmail = custGmail.trim();
           custPassword = custPassword.trim();
           try
           {
               FileWriter fileWriter = new FileWriter(customerIDS+".txt",false);
               BufferedWriter writer = new BufferedWriter(fileWriter);
               writer.write(customerIDS);
               writer.newLine();
               writer.write(custName);
               writer.newLine();
               writer.write(custGender);
               writer.newLine();
               writer.write(Long.toString(mobileNo));
               writer.newLine();
               writer.write(custAddress);
               writer.newLine();
               writer.write(custGmail);
               writer.newLine();
               writer.write(custPassword);
               writer.newLine();
               writer.close();
         
               System.out.println("/////////////////////////////////////////////////////////////////////////////");
               System.out.println("Your User ID is "+customerIDS);
               System.out.println("/////////////////////////////////////////////////////////////////////////////");
               storeUserID(customerIDS);
           }
           catch (Exception e) 
           {
           }
       }
}
