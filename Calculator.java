package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       制作一个简单的计算器
 * @author    艾萨克·乔布斯
 * @data      2018年10月23日 下午12:39:36
 * @copyright 伽蛙
 * @remark    可以进行加减乘除取模运算
 */
public class CalculatorDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double number1 = 0;	//用户输入操作数
		double number2 = 0;
		String op = null;	//运算符
		double result = 0;	//接收结果
		System.out.println("加\t减\t乘\t除\t取模");
		System.out.println("+\t—\t*\t/\t%");
		System.out.print("请选择运算符：");
		op = input.next();
		System.out.print("请输入两个操作数：");
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		switch(op) {
		case "+":
			result = number1 + number2;
			break;
		case "-":
			result = number1 - number2;
			break;
		case "*":
			result = number1 * number2;
			break;
		case "/":
			result = number1 / number2;
			break;
		case "%":
			result = number1 % number2;
			break;
		}
		System.out.println(number1 + " " + op + " " + number2 + " " + "=" + " " + result);
	}
}
