public class DuplicateWords {
    static void duplicateWords(String s1){
        String s= s1.toLowerCase();
        String newstr[]= s.split(" ");
        int count;
        for(int i=0;i<newstr.length;i++){
            count=1;
            for(int j=i+1;j<newstr.length;j++){
                if(newstr[i].equals(newstr[j])){
                    count ++;
                    newstr[j]="0";
                }
            }
            if((count>1) && (newstr[i]!="0")){
                System.out.println(newstr[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        String s1= "Big black bear big buck bear big bear";
        duplicateWords(s1);
        
    }
}
