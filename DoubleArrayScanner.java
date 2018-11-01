package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       对二维数组进行动态赋值，录入多名学生多门课的成绩
 * @author    艾萨克·乔布斯
 * @data      2018年10月26日 下午3:05:34
 * @copyright 伽蛙
 * @remark    TODO
 */
public class DoubleArrayDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = {"刘备","关羽","张飞"};
		String[] courses = {"语文","数学","英语"};
		final int ROW = names.length;
		final int COL = courses.length;
		double[][] scores = new double[ROW][COL];
		for(int i = 0;i < ROW;i++) {	//双层循环控制行和列
			for(int j = 0;j < COL;j++) {
				System.out.print("请输入" + names[i] + "的" + courses[j] + "成绩：");
				scores[i][j] = input.nextDouble();
			}
		}
		System.out.print("\t");
		for(int i = 0;i < COL;i++) {
			System.out.print(courses[i] + "\t");
		}
		System.out.println();
		for(int i = 0;i < ROW;i++) {
			System.out.print(names[i] + "\t");
			for(int j = 0;j < COL;j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
