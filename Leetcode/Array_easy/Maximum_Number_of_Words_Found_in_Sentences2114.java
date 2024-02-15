package Leetcode.Array_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Maximum_Number_of_Words_Found_in_Sentences2114
 */
public class Maximum_Number_of_Words_Found_in_Sentences2114 
{
  
    public static int mostWordsFound(String[] sentences) {
        int spaceCount=0;
        List<Integer> space_Count_List= new ArrayList();
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences[i].length(); j++) {
                if (sentences[i].charAt(j) == ' ') {
                    spaceCount++;

            }
         
        }
        space_Count_List.add(spaceCount);
        // for (int k = 0; k < space_Count_List.size(); k++) {
        //     System.out.println(space_Count_List.get(k));
        // }
        // System.out.println(spaceCount);
        spaceCount=0;
  

    }
        return Collections.max(space_Count_List)+1;
    }
    public static void main(String[] args) {
        String [] sentences = {"please wait", "continue to fight", "continue to win"};
       
       System.out.println( mostWordsFound(sentences));
    //    mostWordsFound(sentences);
    }

}

    

