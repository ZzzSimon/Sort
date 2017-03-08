/**
 * Created by Administrator on 2017/3/6.
 * /**
 * 快速排序
 * 从数列中挑出一个元素，称为“基准”
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，
 * 所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
 * 该基准是它的最后位置。这个称为分割（partition）操作。
 * 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
 */
class QuickSort {
    static void sort(int[] a,int left,int right) {
        if (left < right) {
            int i = left, j = right;
            int mid = a[left];
            do {
                while (a[j] > mid && j > left) {
                    j--;
                }
                while (a[i] < mid && i < right) {
                    i++;
                }
                if (i <= j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j--;

                }

            } while (i <= j);

            if (j > left) {
                sort(a, left, j);
            }
            if (j < right && j>=0) {
                sort(a, j, right);
            }
        }
    }
}
