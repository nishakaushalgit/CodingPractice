public class ReverseWords {
    static void reverseWords(String str){
        String newStr[]= str.split(" ");
        String rev="";
        for(int i=newStr.length-1; i>=0;i--){
            rev= rev+newStr[i]+" ";
        }
        System.out.print(rev);
    }
    public static void main(String[] args) {
        String str= "I Love You";
        reverseWords(str);
    }
}
