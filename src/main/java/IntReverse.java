import java.util.Stack;

public class IntReverse {
    public static void main(String[] args) {
        int reverse = reverse(-2147483648);
        System.out.println("reverse:"+reverse);
    }

        public static int reverse(int x) {
            if(x>0){
                Stack<Long> stack=new Stack<Long>();
                long xx=x;
                do{
                    stack.push(xx%10);
                    xx=xx/10;


                }while(xx!=0);



                long n=1L;
                long num=0L;

                while(!stack.isEmpty()){


                    long a=stack.pop();
                    num=num+a*n;
                    n=n*10;
                }
                System.out.println("num:"+num);
                if(num>Integer.MAX_VALUE||num<Integer.MIN_VALUE) return 0;
                return (int)num;

            }
            if(x<0){
                System.out.println("x:"+x);
                int  xxx=Math.abs(x);
                System.out.println("xxx:"+xxx);

                return -reverse(xxx);




            }






            return 0;

        }
    }

