/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckBusNumber {
    
    public boolean checkBusNumber(String busNumber)
    {
        boolean check = false;
        try
        {
                 FileReader fileReader = new FileReader("BusNumbers.txt");
                 BufferedReader reader = new BufferedReader(fileReader);
                 String data = "";
                 while((data = reader.readLine()) != null)
                 {
                       if(busNumber.equals(data))
                       {
                           check = true;
                           break;
                       }
                 }
        }
        catch (Exception e) {
        }
        return check;
    }
    
}
