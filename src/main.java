/**
 * Created by Administrator on 2017/3/4.
 */
public class main {

    private static void print(String name,int[] a){
        System.out.print(name);
        for (int i:a
                ) {
            System.out.print(i);

        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        int[] a = new int[]{5,3,4,1,2};
        int[] b= new int[]{5,3,4,1,2};
        int[] c= new int[]{5,3,4,1,2};
        int[] d= new int[]{5,3,4,1,2};


        StraightInsertionSort.sort(a);
        print("直接插入排序：",a);
        ShellSort.sort(b);
        print("希尔排序：",b);
        BubbleSort.sort(c);
        print("冒泡排序：",c);
        QuickSort.sort(d,0,d.length-1);
        print("快速排序：",d);
    }
}
