public class ReplaceFirstVovel {
    static boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
}
static void replaceFirstVowel(String str){
    String str1="";
    for(int i=0;i<str.length();i++){
        //char arr[]=str.toCharArray();
        if(!isVowel(str.charAt(i))){
            continue;
        }
        else if(isVowel(str.charAt(i))){
           str1=str.replace(str.charAt(i),'-') ;
           break;
        }
    }
    System.out.println(str1);
    
    
}
public static void main(String[] args) {
    String str="Nisha";
   
   replaceFirstVowel(str);

}
}
