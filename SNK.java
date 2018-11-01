package com.jiawa.isaac.javabase;
import java.util.Scanner;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
/**
 * @aim       简单模拟拳皇玩家对战
 * @author    艾萨克·乔布斯
 * @date      2018年10月22日 上午9:04:09
 * @copyright 伽蛙
 * @remark    1、音乐播放不了 2、产生5-15之间的随机伤害  (int)(Math.random() * 10) % 11 + 5
 */
public class SimpleSNKDemo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {//中断异常
		Scanner input = new Scanner(System.in);
		File sound1 = new File("sounds/order.wav");
		AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
		sound_choose.play();
		//1、玩家选择角色
		//2、初始化角色参数（体力值默认100）
		String userName = null;//接收胜利者名字
		String userName1 = null;
		String skill1 = null;
		int hp1 = 100;
		String userName2 = null;
		String skill2 = null;
		int hp2 = 100;
		System.out.println("角色：\t1、草薙京\t2、不知火\t3、拳王隆\t4、八神奄");
		System.out.println("技能：\t流古武术\t和服诱惑\t流星霸皇踢\t嗜血暴走");
		int choice = (int)(Math.random() * 10) % 2 + 1;
		switch(choice) {
		case 1:
			System.out.print("玩家1请选择：");
			int choice1 = input.nextInt();
			switch(choice1) {
			case 1:
				userName1 = "草薙京";
				skill1 = "流古武术";
				break;
			case 2:
				userName1 = "不知火舞";
				skill1 = "和服诱惑";
				break;
			case 3:
				userName1 = "隆";
				skill1 = "流星霸皇踢";
				break;
			case 4:
				userName1 = "八神奄";
				skill1 = "嗜血暴走";
				break;
			}
			System.out.print("玩家2请选择：");
			int choice2 = input.nextInt();
			switch(choice2) {
			case 1:
				userName2 = "草薙京";
				skill2 = "流古武术";
				break;
			case 2:
				userName2 = "不知火舞";
				skill2 = "和服诱惑";
				break;
			case 3:
				userName2 = "隆";
				skill2 = "流星霸皇踢";
				break;
			case 4:
				userName2 = "八神奄";
				skill2 = "嗜血暴走";
				break;
			}
			break;
		case 2:
			System.out.print("玩家2请选择：");
			int choice3 = input.nextInt();
			switch(choice3) {
			case 1:
				userName2 = "草薙京";
				skill2 = "流古武术";
				break;
			case 2:
				userName2 = "不知火舞";
				skill2 = "和服诱惑";
				break;
			case 3:
				userName2 = "隆";
				skill2 = "流星霸皇踢";
				break;
			case 4:
				userName2 = "八神奄";
				skill2 = "嗜血暴走";
				break;
			}
			System.out.print("玩家1请选择：");
			int choice4 = input.nextInt();
			switch(choice4) {
			case 1:
				userName1 = "草薙京";
				skill1 = "流古武术";
				break;
			case 2:
				userName1 = "不知火舞";
				skill1 = "和服诱惑";
				break;
			case 3:
				userName1 = "隆";
				skill1 = "流星霸皇踢";
				break;
			case 4:
				userName1 = "八神奄";
				skill1 = "嗜血暴走";
				break;
			}
			break;
		}
		//3、循环开始模拟对战
		int i = 1;
		int j = 0;
		while(hp1 > 0 && hp2 > 0) {
			System.out.println("当前为第" + i + "回合！");
			hp1 -= (int)(Math.random() * 10) % 11 + 5;
			System.out.println(userName2 + "对" + userName1 + "使用" + skill2 + "," + userName1 + "剩余" + hp1 + "HP!");
			Thread.sleep(1000);
			if(hp1 <= 0) {
				userName = userName2;
				j = 2;
			}
			hp2 -= (int)(Math.random() * 10) % 11 + 5;
			if(hp1 > 0) {
				System.out.println(userName1 + "对" + userName2 + "使用" + skill1 + "," + userName2 + "剩余" + hp2 + "HP!\n");
				Thread.sleep(1000);
			}
			if(hp1 > 0 && hp2 <= 0) {
				userName = userName1;
				j = 1;
			}
			i++;
		}
		//4、打印最终结果
		System.out.println("\n经过" + (i - 1) + "回合的激烈战斗，最终" + userName + "获得胜利！\n恭喜玩家" + j + "!");
	}
}
