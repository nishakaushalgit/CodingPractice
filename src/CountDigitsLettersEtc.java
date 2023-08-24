import java.util.Scanner;

public class CountDigitsLettersEtc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string: ");
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        int Letters=0;
        int digits=0;
        int spaces=0;
        int others=0;
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(ch[i])){
                digits++;
            }
            else if(Character.isSpaceChar(ch[i])){
                spaces++;
            }
            else if(Character.isLetter(ch[i])){
                Letters++;
            }
            else{
                others++;
            }
        }
            System.out.println("No. of letters are: "+Letters);
            System.out.println("No. of digits are: "+digits);
            System.out.println("No. of Spaces are: "+spaces);
            System.out.println("No. of special characters are: "+others);
        sc.close();
    }
}
