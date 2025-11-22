package DataTransfer;

public class LoaiSanPham {
    private int maLoai;
    private String tenLoai;
    private String moTa;
    private boolean isDeleted;

    public LoaiSanPham() {
    }

    public LoaiSanPham(int maLoai, String tenLoai, String moTa, boolean isDeleted) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.moTa = moTa;
        this.isDeleted = isDeleted;
    }

    public int getMaLoai() {
        return this.maLoai;
    }

    public void setMaLoai(int maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return this.tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" +
                "maLoai=" + maLoai +
                ", tenLoai='" + tenLoai + '\'' +
                ", moTa='" + moTa + '\'' +
                ", isDeleted=" + isDeleted +
                '}';
    }

    // public static class LoginDetail {
    //     private int loginId;
    //     private String authKey;
    //     private String ipAddress;
    //     private String macAddress;
    //     private Timestamp loginTime;
    //     private Timestamp logoutTime;
    //     private int soTK;
    //     public LoginDetail(){}

    //     public LoginDetail(int loginId, String authKey, String ipAddress, String macAddress, Timestamp loginTime, Timestamp logoutTime, int soTK) {
    //         this.loginId = loginId;
    //         this.authKey = authKey;
    //         this.ipAddress = ipAddress;
    //         this.macAddress = macAddress;
    //         this.loginTime = loginTime;
    //         this.logoutTime = logoutTime;
    //         this.soTK = soTK;
    //     }

    //     public int getLoginId() {
    //         return loginId;
    //     }

    //     public String getAuthKey() {
    //         return authKey;
    //     }

    //     public String getIpAddress() {
    //         return ipAddress;
    //     }

    //     public String getMacAddress() {
    //         return macAddress;
    //     }

    //     public Timestamp getLoginTime() {
    //         return loginTime;
    //     }

    //     public Timestamp getLogoutTime() {
    //         return logoutTime;
    //     }

    //     public int getSoTK() {
    //         return soTK;
    //     }

    //     public void setLoginId(int loginId) {
    //         this.loginId = loginId;
    //     }

    //     public void setAuthKey(String authKey) {
    //         this.authKey = authKey;
    //     }

    //     public void setIpAddress(String ipAddress) {
    //         this.ipAddress = ipAddress;
    //     }

    //     public void setMacAddress(String macAddress) {
    //         this.macAddress = macAddress;
    //     }

    //     public void setLoginTime(Timestamp loginTime) {
    //         this.loginTime = loginTime;
    //     }

    //     public void setLogoutTime(Timestamp logoutTime) {
    //         this.logoutTime = logoutTime;
    //     }

    //     public void setSoTK(int soTK) {
    //         this.soTK = soTK;
    //     }

    //     @Override
    //     public String toString() {
    //         return "LoginDetail{" +
    //                 "loginId=" + loginId +
    //                 ", authKey='" + authKey + '\'' +
    //                 ", ipAddress='" + ipAddress + '\'' +
    //                 ", macAddress='" + macAddress + '\'' +
    //                 ", loginTime=" + loginTime +
    //                 ", logoutTime=" + logoutTime +
    //                 ", soTK=" + soTK +
    //                 '}';
    //     }
    // }
}
