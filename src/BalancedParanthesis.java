import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
    static Boolean isBalanced(String s){
        Stack <Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else{
                if(st.empty()){
                    return false;
                }
                 if(c==')' && st.peek()!='(')
                 {
                    return false;
                }
                else if(c==']' && st.peek()!='['){
                    return false;
                }
                else if(c=='}' && st.peek()!='{'){
                        return false;
                }
                else st.pop();
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        if(sc.hasNextLine()){
            String s=sc.nextLine();
            if(isBalanced(s)){
                System.out.println("Pranthesis balanced");
            }
            else
            System.out.println("Paranthesis not balanced");
        }
        sc.close();
    }
}