import java.util.*;

public class PrintDuplicate {
    static void printDuplicate(String s){
       HashMap<Character, Integer> map= new HashMap<Character, Integer>();
       for(int i=0; i<s.length();i++){
           char c= s.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
       }

       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue()>1){
            System.out.println(entry.getKey());
           }
       }
       }
    
    public static void main(String[] args) {
        String s= "aabbbcdeee";
        printDuplicate(s);
    }
}
