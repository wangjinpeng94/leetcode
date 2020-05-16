import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class leetcode_5380 {
    public static void main(String[] args) {
        leetcode_5380 obj = new leetcode_5380();
        String[] words = {"leetcode", "et", "code"};
        List<String> result = obj.stringMatching(words);
        for (String s : result) {
            System.out.println("result:" + s);
        }
    }
    public String[] sortList( String[] sList){

        Arrays.sort(sList,new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        for (String s : sList) {
            System.out.println("sList:"+s);
        }
        return  sList;
    }

    public List<String> stringMatching(String[] word) {
       String[] words= sortList(word);
        for (String s : words) {
            System.out.println("words:"+s);
        }
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 1; j < words.length - i; j++) {
                if (justy(words[i], words[j])) {
                    System.out.println("words[i]:"+words[i]);
                    System.out.println("words[j]:"+words[j]);
                    list.add(words[i]);
break;
                }
            }
        }
        return list;
    }

    public boolean justy(String s1, String s2) {
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1 == "" || s2 == "") {
            return false;
        }
        if (s1.length() > s2.length()) {
            return false;
        }
        int count = 0;
        int index=0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length();j++ ) {
                if (s2.charAt(j) == s1.charAt(i)) {

                    System.out.println("s1.charAt(j):"+s2.charAt(j));
                    System.out.println("s1.charAt(i):"+s1.charAt(i));
                    count++;
                    index=j;
                  break;

                }
                if (count == s1.length()) {
                    return true;
                }
            }

        }

        return false;
    }


}
