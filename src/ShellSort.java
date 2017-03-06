/**
 * Created by Administrator on 2017/3/4.
 * 我们简单处理增量序列：增量序列d = {n/2 ,n/4, n/8 .....1} n为要排序数的个数
 * 即：先将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，
 * 每组中记录的下标相差d.对每组中全部元素进行直接插入排序，
 * 然后再用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。
 * 继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
 */
class ShellSort {

    static void sort(int[] a){
        int dk = a.length/2;
        while(dk>=1){
            shellInsertSort(a,dk);
            dk/=2;
        }
    }
    private static void shellInsertSort(int[] a,int dk){
        for (int i =dk;i<a.length;i++) {
            if(a[i]<a[i-dk]){
                int j;
                int x = a[i];
                a[i] = a[i-dk];
                for(j = i-dk; j>=0&&x<a[j];j-=dk){
                    a[j+dk] = a[j];
                }
                a[j+dk]=x;
            }
        }
    }
}
