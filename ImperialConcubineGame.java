package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       利用数组和循环做一个后宫选妃游戏
 * @author    艾萨克·乔布斯
 * @data      2018年10月27日 下午1:07:04
 * @copyright 伽蛙
 * @remark    在十天之内一旦有三个及以上妃子好感度低于60则游戏结束
 */
public class PickUpBridesDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的名讳：");
		String dynasty = input.next();
		System.out.println(dynasty + "王朝");
		System.out.println("------------------------------");
		System.out.println("这是您的江山，陛下！");
		System.out.println("爱江山更爱美人，万千佳丽一点红~");
		System.out.print("快来搭建您的后宫班子吧！您打算纳多少妃子：");
		final int N = input.nextInt();
		String[] positions = {"贵人","嫔","妃","贵妃","皇后"};
		String[] wivesPosition = new String[N];
		String[] wives = new String[N];	//后宫数组
		int[] love = new int[N];	//好感度数组
		for(int i = 0;i < N;i++) {
			System.out.println("请纳第" + (i + 1) + "个" + positions[0]);
			wives[i] = input.next();
			wivesPosition[i] = positions[0];
			love[i] = 60;
		}
		System.out.println("名讳\t等级\t好感度");
		for(int i = 0;i < N;i++) {
			System.out.println(wives[i] + "\t" + wivesPosition[i] + "\t" + love[i]);
		}
		int day = 0;	//记录天数
		int number = 0;	//记录好感度低于60的妃子个数
		while(day++ < 10 && number < 3) {
			number = 0;
			System.out.println();
			System.out.println(dynasty + "王朝");
			System.out.println("------------------------------");
			System.out.println("第" + day + "天，一夜春宵~，陛下请选择：");
			System.out.println("1、宠幸");
			System.out.println("2、翻牌子");
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("妃子名讳：");
				String name1 = input.next();
				for(int i = 0;i < N;i++) {
					if(wives[i].equals(name1)) {
						love[i] += 10;
					}else {
						love[i] -= 10;
					}
					if(love[i] < 60) {
						number += 1;
					}
				}
				break;
			case 2:
				System.out.print("陛下翻牌：");
				String name2 = input.next();
				for(int i = 0;i < N;i++) {
					if(love[i] < 60) {
						number += 1;
					}
					if(wives[i].equals(name2)) {
						love[i] += 10;
					}
				}
				break;
			}
			System.out.println("名讳\t等级\t好感度");
			for(int i = 0;i < N;i++) {
				if(love[i] < 70) {
					wivesPosition[i] = positions[0];
				}else if(love[i] < 80) {
					wivesPosition[i] = positions[1];
				}else if(love[i] < 90) {
					wivesPosition[i] = positions[2];
				}else if(love[i] < 100) {
					wivesPosition[i] = positions[3];
				}else {
					wivesPosition[i] = positions[4];
				}
				System.out.println(wives[i] + "\t" + wivesPosition[i] + "\t" + love[i]);
			}
		}
		if(day < 10) {
				System.out.println("昏庸无能的狗皇帝，后宫发生暴乱，您的" + dynasty + "王朝被推翻！");
		}else {
			System.out.println("您成功地稳住了后宫，天下太平！");
		}
	}
}
