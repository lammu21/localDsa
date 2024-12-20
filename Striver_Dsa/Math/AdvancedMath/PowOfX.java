package Math.AdvancedMath;

public class PowOfX {
    public static double myPow(double x, int n) 
    {
        int m=Math.abs(n) ;

        double result=1.0;
        while(m>0){
            if(m%2==1){
                result*=x;
                m=m-1;
            }
            else{
              
                m=m/2;
                x*=x;
            }

        }
        if(n<0){
            result = 1.0/result;
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(myPow(2.00000,-2));
    }

}
