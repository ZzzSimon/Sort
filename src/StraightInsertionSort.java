/**
 * Created by Administrator on 2017/3/4.
 * 将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。
 * 即：先将序列的第1个记录看成是一个有序的子序列，然后从第2个记录逐个进行插入，直至整个序列有序为止。
 */
class StraightInsertionSort {
    static void sort(int[] a){
        for (int i =1;i<a.length;i++) {
            if(a[i]<a[i-1]){
                int j;
                int x = a[i];
                a[i] = a[i-1];
                for(j = i-1; j>0&&x<a[j-1];j--){
                    a[j]=a[j-1];
                }
                a[j]=x;
            }
        }
    }

}
