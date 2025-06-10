package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
		// 正しい値が入力されているか確認
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
			scanner.close();
		} else {
			System.out.println("じゃんけんの手ではありません。再入力してください。");
			input = scanner.nextLine();
		}
		
		return input;
	}
	// 対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		 String[] randomjyanken = {"r", "s", "p"};
		 int i = (int)Math.floor(Math.random() * 3);
		 
		 return randomjyanken[i];
	}
	
	// じゃんけんを行う
	public void playGame() {
		HashMap<String, String> jyankenMap = new HashMap<String, String>();
		
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		String myhand = getMyChoice();
		String yourhand = getRandom();
		
		System.out.println("自分の手は" + jyankenMap.get(myhand) + "対戦相手の手は" + jyankenMap.get(yourhand));
		
		if(myhand.equals(yourhand))
		   {
			System.out.println("あいこです");
		} else if((myhand.equals("r") && yourhand.equals("s")) || 
		          (myhand.equals("s") && yourhand.equals("p")) ||
		           myhand.equals("p") && yourhand.equals("r")) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}
}
