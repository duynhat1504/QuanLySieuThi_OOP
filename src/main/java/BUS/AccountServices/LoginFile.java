package BUS.AccountServices;

import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class LoginFile {
    private String authKey;
    private final String directory = System.getenv("APPDATA");
    private final String fileName = "login.propreties";

    public LoginFile(){}
    public LoginFile(String authKey){
        this.authKey = authKey;
    }
    public String getAuthKey() {
        return authKey;
    }
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
    public void writeToFile(){
        String encodeStr;
        Properties prop = new Properties();
        if(authKey == null){
            byte[] encodedBytes = Base64.getEncoder().encode(authKey.getBytes());
            encodeStr = new String(encodedBytes);
            prop.put("authKey", encodeStr);
        }else{
            prop.put("authKey", " ");
        }
        String path = directory + "\\" + fileName;
        try{
            prop.store(new java.io.FileOutputStream(path), "Authentication key for login");
        } catch (IOException e) {
            System.out.println("Không thể ghi file: " + path);
        }
    }

    public String readFromFile(){
        Properties prop = new Properties();
        String path = directory + "\\" + fileName;
        try{
            prop.load(new java.io.FileInputStream(path));
            String authKey = prop.getProperty("authKey");
            if(authKey.equals(" ")){
                return " ";
            }
            byte[] decodedBytes = Base64.getDecoder().decode(authKey.getBytes());
            return new String(decodedBytes);
        } catch (IOException e) {
            System.out.println("Không thể mở file: " + path);
        }
        return null;
    }

    public String createAuthKey(int length){
        StringBuilder authKey = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for(int i = 0; i < length; i++){
            int index = (int) (Math.random() * characters.length());
            authKey.append(characters.charAt(index));
        }
        return authKey.toString();
    }
}
