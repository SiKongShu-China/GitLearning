package com.jiawa.isaac.javabase;
/**
 * @aim       显示盖伦的基本信息
 * @author    艾萨克·乔布斯
 * @date      2018年10月21日 下午1:51:36
 * @copyright 伽蛙
 * @remark    TODO
 */
public class GalenDemo {
	public static void main(String[] args) {
		System.out.println("德玛西亚之力·盖伦");
		System.out.println("生  命  值：◆◆◆◆◆◆◆◆◇");
		System.out.println("物理攻击：◆◆◆◆◆◆◆◇◇");
		System.out.println("技能伤害：◆◆◆◆◆◇◇◇◇");
		System.out.println("速        度：◆◆◆◆◆◆◇◇◇");
		double attack = 57.88;	//伤害
		int attackDistance = 172;
		double attackGrowth = 4.5;	//伤害成长值
		double armor = 27.36;
		double armorGrowth = 3.0;
		double magicResistance = 32.1;
		double magicResistanceGrowth = 1.25;
		double hp = 616.28;
		double hpGrowth = 84.25;
		double hpRecovery = 7.84;
		double hpRecoveryGrowth = 0.5;
		double mana = 0.0;
		double manaGrowth = 0.0;
		double manaRecovery = 0.0;
		double manaRecoveryGrowth = 0.0;
		int speed = 340;
		String position = "上单 辅助 打野";
		int point = 450;
		int goldCoins = 1000;
		System.out.printf("\n伤        害：%.2f(+%.2f)\t攻击距离：%d\n护        甲：%.2f(+%.2f)\t魔        抗：%.2f(+%.2f)\n"
				+ "生  命  值：%.2f(+.2f)\t生命回复：%.2f(+%.2f)\n法  力  值：%.2f\t\t法力回复：%.2f(+%.2f)\n",
				attack,attackGrowth,attackDistance,armor,armorGrowth,magicResistanceGrowth,
				hp,hpGrowth,hpRecovery,hpRecoveryGrowth,mana,manaGrowth,manaRecovery,manaRecoveryGrowth);
		System.out.printf("移        速：%d\t\t定        位：%s\n点        券：%d\t\t金        币：%d\n",speed,position,point,goldCoins);
	}
}	
