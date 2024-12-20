import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
    
 public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) 
        {
            if(ch=='(' || ch=='{' ||ch=='[')
            {
               st.push(ch);
            }
            else
            {
              if(st.isEmpty()){
                return false;
              }
              char cha=st.pop();
              if((ch==')' && cha=='(')||
                (ch=='}' && cha=='{')||
                (ch==']'&& cha=='['))
                {
                    continue;
                }
                else
                    return false;
                
            }

        }
        return st.isEmpty();

    }

}
