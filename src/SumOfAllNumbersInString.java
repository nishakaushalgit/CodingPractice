public class SumOfAllNumbersInString {
    static int sumOfAllNumbersInString(String str){
        String temp="0";
        int sum=0;
      for(int i=0; i<str.length();i++){
          char c=str.charAt(i);
          if(Character.isDigit(c)){
              temp+=c;
          }
          else{
              sum+=Integer.parseInt(temp);
              temp="0";
          }
      } return sum +Integer.parseInt(temp);
    }
    public static void main(String[] args) {
        String str="My 78name is 10Nisha 14";
        System.out.println(sumOfAllNumbersInString(str));
    }
}
