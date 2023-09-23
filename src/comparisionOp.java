public class comparisionOp {
    public static void main(String[]args){
        int x = 10;
        int y = 11;

        int a = 20;
        int b= 15;

        boolean result = x<=y || a>b;
        boolean result1 = x!=y  && a<b;
        boolean result2 = x>=y || a>=b;
        boolean result3 = x<=y && a==b;

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
