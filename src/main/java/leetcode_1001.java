public class leetcode_1001 {
    public static void main(String[] args) {
        int [] A={1,2,3,0,0,0};
        int m=3;

             int[] B= {2,5,6};
             int n=3;
             merge(A,m,B,n);
    }
    public static void merge(int[] A, int m, int[] B, int n) {
        int [] s=new int[m+n];
        int i=0;
        int k=0;
        int j=0;
        while( i<m+n&&k<m&&j<n){
            if(A[k]>B[j]){
                s[i]=B[j];
                j++;
                i++;
                continue;
            }
            if(A[k]<B[j]){
                s[i]=A[k];
                k++;
                i++;
                continue;
            }
            if(A[k]==B[j]){
                s[i]=A[k];
                s[i+1]=B[j];
                i=i+2;
                k++;
                j++;
                continue;
            }


        }
        for(int x=0;x<s.length;x++){
//            A[x]=s[x];
            System.out.println(s[x]);
        }

    }

}
