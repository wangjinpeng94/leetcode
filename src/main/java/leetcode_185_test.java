public class leetcode_185_test {
    public static void main(String[] args) {
        leetcode_185_test object = new leetcode_185_test();
        String a0b1c2 = object.reformat("covid2019");

        System.out.println("\"covid2019\":"+a0b1c2);
    }
//输入：s = "a0b1c2"
//输出："0a1b2c"
    public String reformat(String s) {

        if (s.length()==0||s=="") {
            return null;
        }
        int nums=0;
        int cs=0;
        char[] numc=new char[s.length()/2];
        char[] sc=new char[s.length()/2];

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='a'&& chars[i]<='z') {
                sc[cs]=chars[i];
                cs++;
            }
            if (chars[i]>='0'&& chars[i]<='9') {
                numc[nums]=chars[i];
                nums++;
            }
        }
        if (cs!=nums) {
            return  null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length()/2;i++){
            sb.append(sc[i]);
            sb.append(numc[i]);

        }
        return sb.toString();


    }
}
