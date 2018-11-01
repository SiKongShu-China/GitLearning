package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       零钱兑换
 * @author    艾萨克·乔布斯
 * @date      2018年10月21日 下午1:30:14
 * @copyright 伽蛙
 * @remark    TODO
 */
public class MoneyExchangeDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要兑换零钱的金额：");
		double money = input.nextDouble();
		int yuan = (int)money;
		int count1 = yuan / 10;
		int count2 = yuan % 10 / 5;
		int count3 = yuan % 10 - 5;
		int jiao = (int)((money - (double)yuan) * 10);
		int count4 = jiao % 5;
		int count5 = jiao - 5;
		System.out.printf("十元纸币：%d\n五元纸币：%d\n一元纸币：%d\n五角纸币：%d\n一角纸币：%d\n",count1,count2,count3,count4,count5);
	}
}
