import java.util.regex.Pattern;

public class Regex {
    static String isValid(String IP){
        String regex="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"; 
        String regex1="((([0-9a-fA-F]){1,4})\\:){7}([0-9a-fA-F]{1,4})";
        Pattern p= Pattern.compile(regex);
        Pattern p1= Pattern.compile(regex1);
        if(p.matcher(IP).matches()){
            return "valid IP4";
        }
        else if(p1.matcher(IP).matches()){
            return "valid IP6";
        }

        return "Invalid IP";
    }
    public static void main(String[] args) {
        String IP= "255.0.97.250";
        System.out.println(isValid(IP));

        IP= "Ff08:8:7cd2:89fa:6:76d:adc1:ffff";
        System.out.println(isValid(IP));

        IP="HJTW:866T:5TFD:9";
        System.out.println(isValid(IP));
    }
}
