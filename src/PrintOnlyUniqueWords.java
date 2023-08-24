import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class PrintOnlyUniqueWords {
    static void printUniqueWords(String str){
    
        HashMap<String, Integer> map= new HashMap<>();
        String str1= str.toLowerCase();
        String words[]=str1.split(" ");
        for(String s:words){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        for(Map.Entry<String, Integer> e:map.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
            }
        }
    }

        // String s= str.toLowerCase();
        // String newstr[]= s.split("\\W");
        // for(int i=0; i<newstr.length;i++){
        //     int count=1;
        //     for(int j=i+1;j<newstr.length;j++){
        //         if(newstr[i].equals(newstr[j])){
        //             count++;
        //             newstr[j]="0";
        //         }
        //     }
        
        // if((count==1) && newstr[i]!="0"){
        //     System.out.println(newstr[i]);
        // }
        // }
    
    public static void main(String[] args) {
        String str="Big black bear big buck bear big bear";
        printUniqueWords(str);
    }
}
