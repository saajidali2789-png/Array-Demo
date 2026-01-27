package Stack;
import java.util.*;

public class RemoveKDigit {
    public static void main(String[] args) {
        String s = "1432219";
        int k = 3;
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length();i++){
            
            while(!st.isEmpty() && k > 0 && (st.peek() - '0') >(s.charAt(i) - '0')){
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        while(k > 0) st.pop(); k--;//edge case when k is not reduces

        if(st.isEmpty()){//when stack has no numbers
            System.out.println("0");
        }

        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }

        while(str.length() > 0 && str.charAt(str.length() - 1) == '0'){//when it has trailing zeroes start,end
            str.deleteCharAt(str.length() - 1);
        }
        str.reverse();

        if(str.length() == 0){//after performing it becomes empty
            System.out.println("0");
        }

        System.out.println(str.toString());

        
    }
}
