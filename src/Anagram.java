public class Anagram {
    static final int CHAR= 256;
    static boolean isAnagram(String a1, String b1){
        char a[]= a1.toCharArray();
        char b[]= b1.toCharArray();
        if(a.length!=b.length){
            return false;
        }
        int count[]=new int[CHAR];
        for(int i=0;i<a.length && i<b.length;i++){
            count[a[i]]++;
            count[b[i]]--;
        }
        for(int i=0; i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
    }
    return true;
    }
    public static void main(String[] args) {
        String a1="NISHA";
        String b1= "HASIN";
        if(isAnagram(a1, b1)){
            System.out.println("IS ANAGRAM");
        }
        else {
            System.out.println("IS NOT ANAGRAM");
        }
    }
}
