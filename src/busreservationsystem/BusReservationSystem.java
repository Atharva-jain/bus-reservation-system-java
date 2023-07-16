
package busreservationsystem;

import Admin.BusManagement.AddBus.AddBusData;
import Admin.BusManagement.DeleteBus.DeleteBusFile;
import Admin.BusManagement.EditBus.EditBusData;
import Admin.BusManagement.ViewAllBus.ShowBus;
import Admin.DisplayAllBusBookingDetails.DisplayBusBookingDetails;
import Admin.DisplayUserToManagaData.DisplayUser.DisplayHoleUserToAdmin;
import Admin.DisplayUserToManagaData.deleteUser.DeleteUserForAdmin;
import Admin.DisplayUserToManagaData.editUser.EditUserDataForAdmin;
import Admin.DisplayUserToManagaData.searchUser.SearchUserDataForAdmin;
import Admin.HomePage.FrontView;
import Admin.ShowAllBookingDetails.DisplayAllBookings;
import User.BookBus.BusBooking;
import User.NewUser.CreateUser;
import User.UserBookingDetails.ShowUserBooking;
import User.UserForgotPassword.UserForgotPassword;
import User.UserLogin.UserLoginToAccess;
import User.editUserData.EditUserData;

public class BusReservationSystem {

    public static void main(String[] args) 
    {
           AddBusData abd = new AddBusData();
       //    abd.addBusData();
           ShowBus bus = new ShowBus();
//           bus.showBus();
           EditBusData busData= new EditBusData();
//           busData.inputBusNo();
           DeleteBusFile busFile = new DeleteBusFile();
       //    busFile.inputBusNo();
        CreateUser createUser = new CreateUser();
     //   createUser.customerDetails();
        BusBooking bb = new BusBooking();
//        bb.bookingBus("1");
        ShowUserBooking booking = new ShowUserBooking();
//        booking.showBusBookingDetails("1");
        UserLoginToAccess access = new UserLoginToAccess();
//        access.loginUser();
        EditUserData data = new EditUserData();
//        data.editData("1", 0);
        UserForgotPassword forgotPassword = new UserForgotPassword();
      //  forgotPassword.forgotPassword();
        DisplayAllBookings allBookings = new DisplayAllBookings();
//        allBookings.displayAllBooking();
        DisplayHoleUserToAdmin admin = new DisplayHoleUserToAdmin();
//        admin.displayUsers();
         SearchUserDataForAdmin  admin1 = new SearchUserDataForAdmin();
//         admin1.searchData();
         EditUserDataForAdmin admin2 = new EditUserDataForAdmin();
//         admin2.editUserData();
         DeleteUserForAdmin admin3 = new DeleteUserForAdmin();
//         admin3.deleteUser();
          DisplayBusBookingDetails bookingDetails = new DisplayBusBookingDetails();
  //        bookingDetails.displayBookingDetails();
          FrontView frontView = new FrontView();
          frontView.designedView();
    }
    
}
