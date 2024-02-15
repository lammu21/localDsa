package Leetcode.Array_easy;

public class Employee2798 {
    
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
      
        int num_of_employee=0;

        for (int i = 0; i < hours.length; i++) 
            
         {
            if (target<=hours[i])
            {
                num_of_employee++;
            }
        }
      
        return num_of_employee;
        
    }

    public static void main(String[] args) {
    //    int [] hours = {0,1,2,3,4};
       int [] hours = {5,1,4,2,2};
       
       int target = 2;
       System.out.println(numberOfEmployeesWhoMetTarget(hours, target));

    }
}
