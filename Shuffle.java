package com.jiawa.isaac.javabase;
/**
 * @aim       用数组模拟洗牌
 * @author    艾萨克·乔布斯
 * @data      2018年10月23日 下午4:08:18
 * @copyright 伽蛙
 * @remark    洗牌用Math.random();
 */
public class ShuffleDemo {
	public static void main(String[] args) {
		System.out.println("一筒全新的扑克牌：");
		final int N = 52;
		String[] poker = new String[N];
		poker[0] = "♥A";
		poker[10] = "♥J";
		poker[11] = "♥Q";
		poker[12] = "♥K";
		for(int i = 1;i < 10;i++) {
			poker[i] = "♥" + (i + 1);
		}
		poker[13] = "♦A";
		poker[23] = "♦J";
		poker[24] = "♦Q";
		poker[25] = "♦K";
		for(int i = 14;i < 23;i++) {
			poker[i] = "♦" + (i - 13 + 1);
		}
		poker[26] = "♠A";
		poker[36] = "♠J";
		poker[37] = "♠Q";
		poker[38] = "♠K";
		for(int i = 27;i < 36;i++) {
			poker[i] = "♠" + (i - 26 + 1);
		}
		poker[39] = "♣A";
		poker[49] = "♣J";
		poker[50] = "♣Q";
		poker[51] = "♣K";
		for(int i = 40;i < 49;i++) {
			poker[i] = "♣" + (i - 39 + 1);
		}
		for(int i = 0;i < 52;i++) {
			System.out.printf("%-5s",poker[i]);
			if((i + 14) % 13 == 0) {
				System.out.print("\n");
			}
		}
		for(int i = 0;i < poker.length;i++) {
			int newIndex = (int)(Math.random() * N);
			String temp = poker[i];
			poker[i] = poker[newIndex];
			poker[newIndex] = temp;
		}
		System.out.println("洗牌后：");
		for(int i = 0;i < 52;i++) {
			System.out.printf("%-5s",poker[i]);
			if((i + 14) % 13 == 0) {
				System.out.print("\n");
			}
		}
	}
}
