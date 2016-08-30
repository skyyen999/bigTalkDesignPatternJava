package c18.memento;

import c18.memento.GameRole;
import c18.memento.RoleStateCareTaker;

/**
 * 備忘錄模式-客戶端
 * @author Yan
 *
 */
public class GameRoleClient {

	public static void main(String[] args) {
		// boss一開始的狀態
		GameRole boss = new GameRole();
		boss.stateDisplay();

		
		// 使用複雜的神秘小技巧，可以降低boss攻擊力
		System.out.println("使用複雜的神秘小技巧，低boss攻擊力， 先存檔");
		boss.setAtk(60);
		
		// 趕快存檔
		RoleStateCareTaker rsc = new RoleStateCareTaker();
		rsc.setSave(boss.save());
		boss.stateDisplay();

		
		// 開打了
		boss.fight();
		boss.stateDisplay();
		
		// 隊伍血沒先回滿，倒了一半，快讀取剛才的存檔
		boss.load(rsc.getSave());
		System.out.println("不行不行，讀檔重打");
		boss.stateDisplay();
	}
	
}
