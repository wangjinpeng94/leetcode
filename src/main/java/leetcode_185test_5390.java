public class leetcode_185test_5390 {
    public static void main(String[] args) {
        leetcode_185test_5390 obj = new leetcode_185test_5390();
        int number = obj.minNumberOfFrogs("croak");
        System.out.println("number:"+number);

    }
    //croak
    public int minNumberOfFrogs(String croakOfFrogs) {
        char[] chars = croakOfFrogs.toCharArray();
        int[][] ss=new int[chars.length][chars.length];
        for (int i = 0; i < chars.length; i++) {

            if(chars[i]=='c') {
                int[] ints = count(chars, i);
                if (ints!=null) {
                    ss[i]=ints;
                }


            }

        }
        int countn=0;
        for (int i = 0; i < ss.length-1; i++) {
            if (ss[i]!=null) {
                countn++;
//                if(ss[i][4]>ss[i+1][0]){
//                    countn--;
//                }
            }
            System.out.println("countn:"+countn);
        }
        return countn;


    }

    //判断数组某个下标后有没有某个字符
    public static int judge(char [] cc ,int i,char c){
        for (int j = i; j < cc.length; j++) {
            if (cc[j]==c){
                return  j;
            }

        }
        return  -1;
    }
    public static int [] count(char[] chars,int i){
        int m = judge(chars, i, 'r');
        if (m != -1) {
            int n = judge(chars, m, 'o');
            if (n != -1) {
                int y = judge(chars, n, 'a');
                if (y != -1) {
                    int h = judge(chars, y, 'k');
                    if (h != -1) {
                        int[] ints = new int[5];
                        ints[0] = i;
                        ints[1] = m;
                        ints[2] = n;
                        ints[3] = y;
                        ints[4] = h;
                        return ints;
                    }
                }
            }
        }
        return null;
    }

}
