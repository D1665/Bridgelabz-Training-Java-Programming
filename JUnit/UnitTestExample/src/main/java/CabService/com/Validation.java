package CabService.com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public boolean isValidemail(String email){
        Pattern p= Pattern.compile("^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");

        Matcher m=p.matcher(email);
        return m.matches();
    }
    public boolean isValidpassword(String pass){
        Pattern p= Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8,}$");

        Matcher m=p.matcher(pass);
        return m.matches();
    }
    public boolean isValidphone(String phone){
        Pattern p= Pattern.compile("\\d{10}");

        Matcher m=p.matcher(phone);
        return m.matches();
    }
}
