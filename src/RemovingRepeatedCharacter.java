import java.util.*;

public class RemovingRepeatedCharacter {
    static void removingRepeatedCharater(String str1){
        char str[]=str1.toCharArray();
    HashSet<Character> s= new LinkedHashSet<>();
    for(char x: str){
        s.add(x);
    }
    System.out.println("New string ");
    for(char x:s){
        System.out.print(x);
    }
}
public static void main(String[] args) {
    String str1= "geek for geeks";
    removingRepeatedCharater(str1);
}
}