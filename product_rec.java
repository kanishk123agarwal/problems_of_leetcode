package leetCode;

public class product_rec {
    public static void main(String[] args) {
        int x = 2,y = 5;
        System.out.println(product(x,y));
    }
    static int product(int x,int y){
        if(y!=0){
            return (x+(product(x,y-1)));
        }
        else{
            return 0;
        }
    }
}
