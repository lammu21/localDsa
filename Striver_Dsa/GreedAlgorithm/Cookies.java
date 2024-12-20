public class Cookies {


    public static int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i]==s[j]){
                count++;
                break;
                }

            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        int g[]={10,9,8,7,10,9,8,7};
        int n[]={10,9,8,7};
        int ouput=findContentChildren(g,n);
        System.out.println(ouput);
    }
}