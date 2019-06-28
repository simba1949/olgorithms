package top.simba1949;

/**
 * 交换排序——冒泡排序算法
 *
 * 冒泡排序算法原理：
 *     1. 对要排序的数组中的数据，依次比较相邻的两个数据的大小。
 *     2. 如果前面的数据大于后面的数据，就把这两个数据进行交换。这样一轮比较和交换过后，就把最小的数据放在数组的最前面；
 *     或者说最大的数据放在数组的最后面
 *     3. 按照上述比较和交换的方法，把剩下的数据再进行相同操作，最后，便可按照从小到大的顺序对数组完成排序。
 *
 * @author SIMBA1949
 * @date 2019/6/28 22:20
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = {1, 9, 90, 20, 30, 66, 34, 55};
		bubbleSortImp(intArr);
		for (int i : intArr) {
			System.out.print(i + "\t");
		}
	}

	public static void bubbleSortImp(int[] arr){
		if (null == arr || arr.length <= 1){
			return;
		}
		// 假设第一个数是最大数，冒泡最大的数放在数组后面
		for (int area = arr.length - 1; area >= 0; area--){
			for (int i = 0; i < area; i++) {
				// 如果前面的数据比后面的大，数据交换
				if (arr[i] > arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
