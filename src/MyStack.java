
public class MyStack {
    int arr[];
    int cap;
    int top;
    MyStack(int c){
        top=-1;
        cap=c;
        arr=new int[cap];
        }
        void push(int x){
            if(top==cap-1){System.out.println("Stack is full");return;}
                top++;
                arr[top]=x;
            }
        int pop(){
            if(top==-1){System.out.println("Stack is empty");return Integer.MIN_VALUE;}
            int res=arr[top];
            top--;
            return res;
            }
        int peek(){
            if(top==-1){System.out.println("Stack is empty");return Integer.MIN_VALUE;}
            return arr[top];
        }
    public static void main(String[] args) {
        MyStack st= new MyStack(5);
        st.push(5);
        st.push(10);
       System.out.println(st.peek());
       System.out.println(st.pop());

    }
}
