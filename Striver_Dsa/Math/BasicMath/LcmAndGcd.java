/**
 * LcmAndGcd
 */
public class LcmAndGcd {
public static void main(String[] args) {
    Long a = 440154L , b = 89532L;

    // 440154 89532

    Long[] Result=lcmAndGcd(a, b);

    for (int i = 0; i < Result.length; i++) {
        System.out.println(Result[i]);
    }


    
}
    


static Long[] lcmAndGcd(Long A , Long B) {
    // code here
    

    Long a=A,b=B;
 
    Long [] result = new Long [2];
 
    Long GCD=0L;
    
    
    while(A>0&&B>0){
        if(A>B){
            A=A%B;
        }
        else {
        B=B%A;
        }
        if(A==0){
            GCD=B;
        }
        else{
            GCD=A;
            
        }
    }
    Long LCM= (A*B)/GCD;
    
    result[0]=LCM;
    result[1]=GCD;
    
    return result;
    
}
}