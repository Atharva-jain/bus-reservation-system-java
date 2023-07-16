
package User.NewUser;

import User.UserChoices;
import busreservationsystem.Input;

public class CreateUser
{
        Input input = new Input();
        protected String custName, custGender, custEmail, custPassword, custAddress, accoutType;
        protected long  mobileNo;
        
         public String genderChoice()
         {
           boolean check = true;
           String genderChoiceDemo = "";
           while(check == true)
           {
               System.out.println("M : Male");
               System.out.println("F : Female");
               System.out.println("C : Custom");
               System.out.println("-------------------------------------------------------------------------------");
               System.out.println("Enter your Choice :: ");
               try
               {
                   String choice = input.inputString();
                   choice = choice.toUpperCase().trim();
                   switch(choice)
                  {
                      case "M" :
                         genderChoiceDemo = "Male" ; 
                         check = false;
                          break;
                      case "F" :
                          genderChoiceDemo = "Female" ; 
                          check = false;
                          break;
                      case "C" : 
                          genderChoiceDemo = "Custom" ; 
                          check = false;
                          break;
                      default:
                          System.out.println("Enter Choice Between (M,F,C) ..............");
               }
               } catch (Exception e) 
               {
                    
               }
               
           }
           return genderChoiceDemo;
      }
     
        public void customerDetails()
        {
               System.out.println("------------------------------------------------------------------");
               System.out.println("Enter Customer Name ::: ");
               custName = input.inputString();
               System.out.println("------------------------------------------------------------------");
               System.out.println("Choose Gender ::: ");
               custGender = genderChoice();
               System.out.println("------------------------------------------------------------------");
               System.out.println("Enter Mobile Number ::: ");
               mobileNo = input.longBug();
               System.out.println("------------------------------------------------------------------");
               System.out.println("Enter Address ::: ");
               custAddress = input.inputString();
               System.out.println("------------------------------------------------------------------");
               System.out.println("Enter your Username ::: ");
               custEmail = input.inputString();
               System.out.println("------------------------------------------------------------------");
               System.out.println("Enter Password ::: ");
               custPassword = input.inputString();
               StoreUserData data = new StoreUserData();
               data.storeData(custName, custGender, mobileNo, custAddress, custEmail, custPassword);
               UserChoices  choices = new UserChoices();
               choices.userChoices();
        }
}
