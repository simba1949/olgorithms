package top.simba1949;

/**
 * 交换排序——快速排序算法
 *
 * 快速排序算法原理：
 *     1. 以数组第一个位置上的元素为切分元素，
 *     2. 定义左扫描 i 和  右扫描 j，
 *     3. 左扫描 i 从左向右扫描，直到扫描到小于切分元素的元素停止，右扫描 j 从右向左扫描，直到扫描到大于切分元素的元素停止
 *     4. 左扫描和右扫描都停止，交换位置
 *     5. 第一轮结束后，交换 i 或者 j 与切分元素的位置，此时， i 或者 j 位置左边都是小于切分元素，右边都是大于切分元素
 *     6. 以切分元素为分割点，进行左边数组排序，和右边数组排序
 *
 * @author SIMBA1949
 * @date 2019/6/29 7:33
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] intArr = {1, 9, 90, 20, 30, 66, 34, 55, 54, 44, 66};
		quickSortImpl(intArr, 0, intArr.length - 1);
		for (int i : intArr) {
			System.out.print(i + "\t");
		}
	}

	public static void quickSortImpl(int[] arr, int low, int high){
		if (null == arr || arr.length < 2){
			return;
		}
		// 如果低位索引大于高位索引返回
		if(low >= high){
			return;
		}

		int comparableValue = arr[low];
		int i = low;
		int j = high;
		while (i < j){
			// i 从左边向右边扫描，直到扫描到大于切分元素的元素，停止
			while (i < j && comparableValue >= arr[i]){
				i++;
			}
			// j 从右边向左边扫描，直到扫描到小于切分元素的元素，停止
			while (i < j && comparableValue <= arr[j]){
				j--;
			}
			// 如果 i 和 j 都停止，需要交换位置
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		// 数组以 i 位置为分割，左边全是小于切分元素，右边全是大于切分元素
		arr[low] = arr[i];
		arr[i] = comparableValue;
		// 对左边进行排序
		quickSortImpl(arr, 0, i - 1);
		quickSortImpl(arr, i + 1, high);
	}
}
