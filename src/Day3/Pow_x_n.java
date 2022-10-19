package Day3;

public class Pow_x_n {
    public static void main(String[] args) {
        double ans=myPow(2,10);
        System.out.println(ans);
    }
    public static double myPow(double x, int n) {
        double ans=1.0; long nn=n;
        if(nn<0)
            nn=-nn;
        while(nn!=0){
            if(nn%2==0){
                x*=x;
                nn/=2;
            }
            else{
                ans=ans*x;
                nn-=1;
            }
        }
        if(n<0)
            ans= (double)1.0/ans;
        return ans;
    }
}
