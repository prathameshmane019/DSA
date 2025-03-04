public class SquareRoot {
    public int mySqrt(int x) {
        int l=0;
        int r=x;
        while(l<=r){
            int m =l+(r-l)/2;
            if((long) x== (long) m*m){
                return m;
            }
            else if((long)x > (long)m*m){
                l= m+1;
            }
            else {
                r= m-1;
            }
        }
        return Math.round(r);
    }
}  
