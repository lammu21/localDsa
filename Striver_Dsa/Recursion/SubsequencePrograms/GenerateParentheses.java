package SubsequencePrograms;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, n);
                return result;
            }
        
            private void generateParenthesisHelper(List<String> result, String current, int open, int close, int max) {

                if(current.length()==max*2){
                    result.add(current);
                    return;
                }

                if(open<max){
                    generateParenthesisHelper(result, current+'(', open+1, close, max);
                }
                if(close<open){
                    generateParenthesisHelper(result, current+')', open, close+1, max);
                }
               
            }


            public static void main(String[] args) { 
            GenerateParentheses solution = new GenerateParentheses(); 
            // Example 1
             int n1 = 10; 
            System.out.println("Generated Parentheses for n = " + n1 + ": " + solution.generateParenthesis(n1));
             // Example 2 
             int n2 = 1; 
             System.out.println("Generated Parentheses for n = " + n2 + ": " + solution.generateParenthesis(n2)); 
            }

    
}