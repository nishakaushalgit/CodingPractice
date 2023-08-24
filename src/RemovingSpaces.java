public class RemovingSpaces {
    static void removingSpcaes(String str){
       String str1=str.replaceAll("\\s", "");
        System.out.println(str1);
    }
    public static void main(String[] args) {
        String str= "My name is Nisha";
        removingSpcaes(str);
    }
}
