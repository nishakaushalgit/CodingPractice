import java.util.*;

public class MostRepeatingCharacter {
    static char mostRepeatingCharater(String s){
        HashMap<Character, Integer> map= new HashMap<>();
        int count=0;
        char ans=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            map.put(c, (map.getOrDefault(c,0)+1));
        }
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(count<map.get(c)){
                ans=c;
                count=map.get(c);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= "KSHITIJ";
        System.out.println(mostRepeatingCharater(s));
    }

}
