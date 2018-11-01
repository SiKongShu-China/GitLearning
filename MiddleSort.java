package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       利用二分法进行查找
 * @author    艾萨克·乔布斯
 * @data      2018年10月25日 下午10:23:13
 * @copyright 伽蛙
 * @remark    前提是数组是有序的，假设是升序		用要查找的元素与中间元素比较，然后一步步筛选
 */
public class MiddleSortDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数字个数：");
		final int N = input.nextInt();
		int[] numbers = new int[N];
		for(int i = 0;i < numbers.length;i++) {
			System.out.print("请输入第" + (i + 1) + "个元素：");
			numbers[i] = input.nextInt();
		}
		System.out.println("升序排列后：");
		for(int i = 0;i < numbers.length - 1;i++) {	//冒泡排序
			for(int j = 0;j < numbers.length - i - 1;j++) {
				if(numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		for(int i = 0;i < numbers.length;i++) {
			if(i == 0)
				System.out.print("{");
			System.out.print(numbers[i]);
			if(i != numbers.length - 1) {
				System.out.print("，");
			}else {
				System.out.println("}");
			}
		}
		System.out.print("请输入要查找的元素：");
		int number = input.nextInt();
		int index;
		int midIndex = (N - 1) / 2;
		int highIndex = N - 1;
		int lowIndex = 0;
		boolean isFind = false;	//默认没有找到元素
		while(highIndex >= lowIndex) {
			if(number == numbers[midIndex]) {		
				index = midIndex;
				System.out.println("该元素在数组中是第" + (index + 1) + "个元素！");
				break;	//找到之后跳出循环
			}else if(number > numbers[midIndex]) {
				lowIndex = midIndex + 1;	//如果该元素比中间元素大，让最小值跳到中间值右边
				midIndex = (lowIndex + highIndex) / 2;
			}else {
				highIndex = midIndex - 1;
				midIndex = (lowIndex + highIndex) / 2;
			}
		}
		if(!isFind) {
			System.out.println("很遗憾，数组中没有这个元素！");
		}
	}
}
