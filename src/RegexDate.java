import java.util.regex.Pattern;
public class RegexDate {
    static String date(String str){
        String regex= "(0?[1-9]|[12][0-9]|3[01])[./-](0?[1-9]|1[0-2])[./-](19|20)[0-9][0-9]";
        Pattern p=Pattern.compile(regex);
        if(p.matcher(str).matches()){
            return "date is valid";
        }
        else {
            return "date is invalid";
        }
    }
    public static void main(String[] args) {
        String str="31/01/2020";
        System.out.println(date(str));
         str="33/90/2010";
        System.out.println(date(str));
    }
}
