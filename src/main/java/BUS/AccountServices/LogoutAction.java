package BUS.AccountServices;

import java.sql.Timestamp;

import DataAccess.DataAccessObject.LoginDetailDAO;
import DataTransfer.LoginDetail;

public class LogoutAction {
    public static void logout(){
        LoginFile loginFile = new LoginFile(null);
        loginFile.writeToFile();
    }

    public static void storeLogoutTime(LoginDetail loginDetail){
        LoginDetailDAO lgDao = new LoginDetailDAO();
        loginDetail.setLogoutTime(new Timestamp(System.currentTimeMillis()));
        lgDao.update(loginDetail.getLoginId(), loginDetail);
    }
}
