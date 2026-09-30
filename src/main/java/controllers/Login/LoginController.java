package controllers.Login;

public class LoginController {
    public boolean checkUserNameandPassowrd(String userName, String password ) {
         if (userName.equals("nimal") && password.equals("1234")){
                return true;
            }
            return false;
        }
    }

