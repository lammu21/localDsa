package stack;

import java.util.Stack;

public class ValidParanthesis {
    

    public boolean validParanthesisMethod (String s )

    {
        Stack <Character>stack = new Stack<>();

        for (char c : s.toCharArray()) 
        {
            if(c=='('|| c=='{'||c=='[')
            {
                 stack.push(c);
            }

            else{
               if(stack.isEmpty())
               {
                 return false;
               }

               else 
               {
                 char  top = stack.peek();
                 if((c==')'&& top=='(')||
                   (c=='}'&& top=='{')||
                   (c==']'&& top=='['))
                   {
                     stack.pop();
                   }

                   else{
                    return false;
                   }

               }
            }
        }
        return stack.isEmpty();
    } 




    public static void main(String[] args) {
        ValidParanthesis validator = new ValidParanthesis();
        
        // Example 1
        String input1 = "()";
        System.out.println("Is valid: " + validator.validParanthesisMethod(input1)); // Output: true

        // Example 2
        String input2 = "{[()]}";
        System.out.println("Is valid: " + validator.validParanthesisMethod(input2)); // Output: true

        // Example 3
        String input3 = "({[)}]";

        input3 = "{([])}";
        System.out.println("Is valid: " + validator.validParanthesisMethod(input3)); // Output: false
    }
}


