package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       给出2018年1月之后某年的某个月，用for循环嵌套打印从2018年1月到指定月份的日历
 * @author    艾萨克·乔布斯
 * @data      2018年10月23日 下午1:14:28
 * @copyright 伽蛙
 * @remark    今天是2018.10.23星期二,2018年1月1日是星期一
 */
public class CalendarImproveDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day = 1;
		System.out.println("您要打印哪年哪月的日历？");
		System.out.println("某年：");
		int year = input.nextInt();
		System.out.println("某月：");
		int month = input.nextInt();
		//首先根据年月判断该月的起始日是周几
		for(int i = 2017;i < year - 1;i++) {	//年循环
			for(int j = 0;j < 12;j++) {	//从2018年以来的月循环
				switch (j + 1) {
				case 2:
				case 4:
				case 6:
				case 8:
				case 9:
				case 11:
					day = (day + 31) % 7;
					break;
				case 1:
					if((i + 1) != 2018)
						day = (day + 31) % 7;	//上个月的起始日加上上个月天数对7取余就是下个月的的起始日星期
					break;
				case 5:
				case 7:
				case 10:
				case 12:
					day = (day + 30) % 7;
					break;
				case 3:
					if((i + 1) % 4 == 0 && (i + 1) % 100 != 0 || (i + 1) % 400 ==0) {	//判断是否为闰年
						day = (day + 29) % 7;
					}else {
						day = (day + 28) % 7;
					}
					break;
				}
				System.out.println("---------------------------------------------------");
				System.out.println("\t\t阴历 \t" + (i + 1) + " 年" + "  " + (j + 1) + " 月");
				System.out.println("---------------------------------------------------");
				System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
				switch(day) {
				case 1:
					break;
				case 2:
					System.out.print("\t");
					break;
				case 3:
					System.out.print("\t\t");
					break;
				case 4:
					System.out.print("\t\t\t");
					break;
				case 5:
					System.out.print("\t\t\t\t");
					break;
				case 6:
					System.out.print("\t\t\t\t\t");
					break;
				case 0:
					System.out.print("\t\t\t\t\t\t");
					break;
				}
				int dayOfMonth = 0;
				switch (j + 1) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					dayOfMonth = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					dayOfMonth = 30;
					break;
				case 2:
					if((i + 1) % 4 == 0 && (i + 1) % 100 != 0 || (i + 1) % 400 ==0) {	//判断是否为闰年
						dayOfMonth = 29;
					}else {
						dayOfMonth = 30;
					}
					break;
				}
				for(int k = 1;k < (dayOfMonth + 1);k++) {
					System.out.print(k);
					if((k + day + 6) % 7 == 0) {
						System.out.print("\n");
					}else {
						System.out.print("\t");
					}
				}
				System.out.println();
			}
			}
		for(int j = 0;j < month;j++) {	//当年的月循环
			switch (j + 1) {
			case 2:
			case 4:
			case 6:
			case 8:
			case 9:
			case 11:
				day = (day + 31) % 7;
				break;
			case 1:
				if(year != 2018)
					day = (day + 31) % 7;	//上个月的起始日加上上个月天数对7取余就是下个月的的起始日星期
				break;
			case 5:
			case 7:
			case 10:
			case 12:
				day = (day + 30) % 7;
				break;
			case 3:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {	//判断是否为闰年
					day = (day + 29) % 7;
				}else {
					day = (day + 28) % 7;
				}
				break;
			}
			System.out.println("---------------------------------------------------");
			System.out.println("\t\t阴历 \t" + year + " 年" + "  " + month + " 月");
			System.out.println("---------------------------------------------------");
			System.out.println("周一\t周二\t周三\t周四\t周五\t周六\t周日");
			switch(day) {
			case 1:
				break;
			case 2:
				System.out.print("\t");
				break;
			case 3:
				System.out.print("\t\t");
				break;
			case 4:
				System.out.print("\t\t\t");
				break;
			case 5:
				System.out.print("\t\t\t\t");
				break;
			case 6:
				System.out.print("\t\t\t\t\t");
				break;
			case 0:
				System.out.print("\t\t\t\t\t\t");
				break;
			}
			int dayOfMonth = 0;
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dayOfMonth = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dayOfMonth = 30;
				break;
			case 2:
				if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {	//判断是否为闰年
					dayOfMonth = 29;
				}else {
					dayOfMonth = 30;
				}
				break;
			}
			for(int k = 1;k < (dayOfMonth + 1);k++) {
				System.out.print(k);
				if((k + day + 6) % 7 == 0) {
					System.out.print("\n");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
