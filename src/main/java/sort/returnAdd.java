package sort;
//程序有问题 结果不对  20200516 11：13
public class returnAdd {
    public static void main(String[] args) {
        int[] a = new int[]{2, 5, 4, 9, 2, 1, 6, 7};
        sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void sort(int [] arrays,int L,int R){
        //如果只有一个元素，就不用排序了
        if(L==R){
            return;
        }else{
            //取中间的数，进行拆分
            int M=(L+R)/2;
            //左边的数不断进行拆分
            sort(arrays,L,M);
            //右边的数不断进行拆分
            sort(arrays,M+1,R);
            //合并
            merge(arrays, L, M + 1, R);
        }
    }
    public static void merge(int []arrays,int L,int M,int R){
        //左边的数组的大小
        int [] leftArray=new int[M-L];
        //右边的数组大小
        int[] rightArray=new int[R-M+1];
        //往这两个数组填充数据
        for (int i = L; i < M; i++) {
            leftArray[i-L]=arrays[i];
        }
        for (int i = M; i <=R; i++) {
            rightArray[i-M]=arrays[i];
        }
        int i=0,j=0;
        //arrays数组的第一个元素
        int k=L;
        //比较这两个数组的值，那个小就往数组上放
        while(i<leftArray.length&&j<rightArray.length){
            //谁比较小，谁将元素放入大数组中，移动指针，继续比较下一个
            if(leftArray[i]<rightArray[j]){
                arrays[k]=leftArray[i];
                i++;
                k++;
            }else{
                arrays[k]=rightArray[j];
                j++;
                k++;
            }
        }
        //如果左边的数组还没有比较完，右边的已经完了，那么将左边的数组抄到大数组中
        while (i<leftArray.length){
            arrays[k]=leftArray[i];
            i++;
            k++;
        }
        //如果右边的数组还没有比较完，左边边的已经完了，那么将右边的数组抄到大数组中
        while (j<leftArray.length){
            arrays[k]=leftArray[j];
            j++;
            k++;
        }
    }
}
