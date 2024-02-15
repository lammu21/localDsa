package Leetcode.Array_easy;

public  class Bad_version {
   
   static int  firstBadVersion(int n) {
        int start =0;
        int end =n;
        int mid =0;
        while (start<end)
        {
             mid = start+(end-start)/2;

            if(isBadVersion(mid)) {
                =mid+1;
            }
            else if (!isBadVersion(mid))
            {
                start=mid+1;

            }
             
               
            
        }
       
        return end;
    }

   public static boolean isBadVersion(int num)
   {
     if(num>=1)
     {
        return true;
     }
    
   
    return false;
   }
    public static void main(String[] args) {
        int n =1;

       int res= firstBadVersion(n);
       System.out.println(res);
        
    }
}


