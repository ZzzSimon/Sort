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
        print("直接插入排序：",StraightInsertionSort.sort(a));
        print("shell排序：",ShellSort.sort(a));

    }
}
