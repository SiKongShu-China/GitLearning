package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       使用选择排序
 * @author    艾萨克·乔布斯
 * @data      2018年10月23日 下午9:42:20
 * @copyright 伽蛙
 * @remark    除此之外还有	Array.sort(array[N]);快速排序，需要引进一个包	import java.util.Array;
 */
public class SelectSortDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您需要的数组大小：");
		int N = input.nextInt();
		int[] array = new int[N];
		for(int i = 0;i < array.length;i++) {
			System.out.print("请输入第" + (i + 1) + "个数字：");
			array[i] = input.nextInt();
		}
		System.out.print("1、从小到大排序\t2、从大到小排序\t请选择排序方式：");
		//选择排序，默认第i个为最小值，下标为minIndex
		int choice = input.nextInt();
		switch(choice) {
		case 1:
			for(int i = 0;i < array.length;i++) {
				int min = array[i];
				int minIndex = i;
				for(int j = i + 1;j < array.length;j++) {
					if(min > array[j]) {
						min = array[j];
						minIndex = j;
					}
				}
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
				
			}
			break;
		case 2:
			for(int i = 0;i < array.length;i++) {
				int max = array[i];
				int maxIndex = i;
				for(int j = i + 1;j < array.length;j++) {
					if(max > array[j]) {
						max = array[j];
						maxIndex = j;
					}
				}
				int temp = array[i];
				array[i] = array[maxIndex];
				array[maxIndex] = temp;
				
			}
			break;
		}
		for(int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
