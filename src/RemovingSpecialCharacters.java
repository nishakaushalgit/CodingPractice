public class RemovingSpecialCharacters {
    static void removingSpecialCharacters(String s){
        //s=s.replaceAll("[aeiouAEIOU]", "");
        s=s.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s="Special !@ characters $$%&*()(+_% removed";
        removingSpecialCharacters(s);
    }
}
