package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       使用冒泡排序对数组进行排序
 * @author    艾萨克·乔布斯
 * @data      2018年10月23日 下午9:11:33
 * @copyright 伽蛙
 * @remark    需要一个中间变量temp
 */
public class BubbleSortDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数字个数：");
		final int N = input.nextInt();	//接收用户自定义数组大小
		int[] array = new int[N];
		for(int i = 0;i < N;i++) {
			System.out.print("请输入第" + (i + 1) + "个数字：");
			array[i] = input.nextInt();
		}
		System.out.print("1、从大到小排序\n2、从小到大排序\n选择排序方式：");
		int choice = input.nextInt();
		int temp;
		switch(choice) {	//设定两种排序方法
		case 1:
			for(int i = 0;i < N - 1;i++) {
				for(int j = 0;j < N - i - 1;j++) {
					if(array[j] < array[j + 1]) {	//比较变量大小
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			break;
		case 2:
			for(int i = 0;i < N - 1;i++) {
				for(int j = 0;j < N - i - 1;j++) {
					if(array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			break;
		}
		for(int i = 0;i < N;i++) {	//遍历数组
			System.out.print(array[i] + "\t");
		}
	}
}
