package Stack;
import java.util.*;


public class NextGreater2 {
    public static void main(String[] args) {

        Stack<Integer> st =  new Stack<>();
        int [] nums = {1,2,3,4,3};
        int n1 = nums.length;
        int n =  2 * nums.length;
        int [] arr = new int[n1];

        for(int i = n - 1; i >= 0; i--){

            while(!st.isEmpty() && st.peek() <= nums[i%n1]){
                st.pop();
            }

                if(i < n1){
                    arr[i] = st.isEmpty() ? -1 : st.peek();
                }
                st.push(nums[i%n1]);
            
        }

        System.out.print("{");
        for(int i = 0 ; i < arr.length;i++){
            System.out.println(+arr[i] + " ");
        }
            System.out.print("}");
        }
    }




    