package DataAccess.DataAccessObject;

import DataTransfer.LoaiSanPham;

import java.util.List;

public class LoginDetailDAO  extends  AbstractAccessData<LoaiSanPham.LoginDetail> implements ISimpleAccess<LoaiSanPham.LoginDetail, Integer>{
    {
        setClazz(LoaiSanPham.LoginDetail.class);
    }
    @Override
    public boolean insert(LoaiSanPham.LoginDetail loginDetail) {
        return executeUpdate("INSERT INTO LOGIN_DETAIL(AUTH_KEY, IP_ADDRESS, MAC_ADDRESS,LOGIN_TIME,LOGOUT_TIME,SOTK) VALUES(?,?,?,?,?,?)",
                loginDetail.getAuthKey(), loginDetail.getIpAddress(), loginDetail.getMacAddress(), loginDetail.getLoginTime(), loginDetail.getLoginTime());
    }

    @Override
    public boolean update(Integer loginId, LoaiSanPham.LoginDetail loginDetail) {
        return executeUpdate("UPDATE LOGIN_DETAIL SET AUTH_KEY = ?,IP_ADDRESS = ?,MAC_ADDRESS = ?,LOGIN_TIME = ?,LOGOUT_TIME = ?,SOTK = ? WHERE LOGIN_ID = ?",
                loginDetail.getAuthKey(),loginDetail.getIpAddress(),loginDetail.getMacAddress(),loginDetail.getLoginTime(),loginDetail.getLogoutTime(),loginDetail.getSoTK(),loginId);
    }

    @Override
    public boolean delete(Integer loginId) {
       return executeUpdate("DELETE FROM LOGIN_DETAIL WHERE LOGIN_ID = ?",loginId);
    }

    @Override
    public LoaiSanPham.LoginDetail select(Integer loginId) {
        return executeQuery("SELECT * FROM LOGIN_DETAIL WHERE LOGIN_ID = ?",loginId);
    }

    @Override
    public List<LoaiSanPham.LoginDetail> selectAll() {
        return executeQueryList("SELECT * FROM LOGIN_DETAIL");
    }

    public LoaiSanPham.LoginDetail selectByAuthKey(String authKey){
        return executeQuery("SELECT * FROM LOGIN_DETAIL WHERE AUTH_KEY = ? AND LOGOUT_TIME >= NOW()",authKey);
    }
}
