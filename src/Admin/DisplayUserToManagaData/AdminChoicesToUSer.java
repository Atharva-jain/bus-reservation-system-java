
package Admin.DisplayUserToManagaData;

import Admin.AdminChoices;
import Admin.DisplayUserToManagaData.DisplayUser.DisplayHoleUserToAdmin;
import Admin.DisplayUserToManagaData.deleteUser.DeleteUserForAdmin;
import Admin.DisplayUserToManagaData.editUser.EditUserDataForAdmin;
import Admin.DisplayUserToManagaData.searchUser.SearchUserDataForAdmin;
import busreservationsystem.Input;


public class AdminChoicesToUSer
{
      Input input = new Input();
      public void AdminUserChoices()
      {
          System.out.println("-------------------------------------------------------");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> A : DISPLAY USER  <<<<<<<<<<<<");
          System.out.println(">>>> B : EDIT USER  <<<<<<<<<<<<<<<<");
          System.out.println(">>>> C : SEARCH USER  <<<<<<<<<<<<<");
          System.out.println(">>>> D : DELETE USER  <<<<<<<<<<<<<");
          System.out.println(">>>> E  : EXIT     <<<<<<<<<<<<<<<<<<<");
          System.out.println("-------------------------------------------------------");
          System.out.println(">>>> Enter Your Choice  :::::::::::::::  ");
          String str = input.inputString();
          str = str.toUpperCase().trim();
          if(str.equals("A"))
          {
               DisplayHoleUserToAdmin admin = new DisplayHoleUserToAdmin();
               admin.displayUsers();
          }
          else if (str.equals("B"))
          {
              EditUserDataForAdmin admin = new EditUserDataForAdmin();
              admin.editUserData();
          }
          else if (str.equals("C"))
          {
              SearchUserDataForAdmin admin = new SearchUserDataForAdmin();
              admin.searchData();
          }
          else if (str.equals("D"))
          {
              DeleteUserForAdmin admin = new DeleteUserForAdmin();
              admin.deleteUser();
          }
          else if(str.equals("E"))
          {
               AdminChoices ac = new AdminChoices();
               ac.adminChoices();
          }
          else
          {
              System.out.println("Please enter the Choice Between Given Choices ...........................");
              AdminUserChoices();
          }
      }
    
}
