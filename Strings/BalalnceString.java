public class BalalnceString {
    public boolean isBalanced(String num) {
        int even=0;
        int odd =0;
        for(int i= 0;i<num.length();i++){
            if(i%2==0){
                even +=Integer.parseInt(num.charAt(i)+"");
            }
            else{
                  odd+=Integer.parseInt(num.charAt(i)+"");
            }
        }
        return even==odd;
    }

    public static void main(String[] args) {
        BalalnceString bs = new BalalnceString();
        System.out.println(bs.isBalanced("1234"));
    }
}
