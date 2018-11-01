package com.jiawa.isaac.javabase;
import java.util.Scanner;
/**
 * @aim       使用循环实现三次密码输入错误退出系统
 * @author    艾萨克·乔布斯
 * @date      2018年10月22日 上午9:04:09
 * @copyright 伽蛙
 * @remark    TODO
 */
public class PasswordDemo {
	public static void main(String[] args) {
		final String PASSWORD = "123456";
		Scanner input = new Scanner(System.in);
		String password = null;	//或者 String password = "";
		int i = 0;
		while(i < 3) {
			System.out.print("请输入密码：");
			password = input.next();
			i++;
			//JAVA中不允许这样判断：if(password == "123465")
			if(!password.equals(PASSWORD)) {	//或者是：if(!"123465".equals(password))
				System.out.println("密码输入错误，您还有" + (3 - i) + "次机会!");
				if(i == 3) {
					System.err.println("你输入错误次数已达三次，强制退出系统！");
					System.exit(0);
				}
			}else {
				i = Integer.MAX_VALUE;
			}
		}
		System.out.println("密码正确，登陆成功！");
	}
}
