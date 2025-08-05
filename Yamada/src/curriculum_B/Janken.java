package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Janken {
	public void janken() {
	     Scanner SCM = new Scanner(System.in);
    	 
		 System.out.println("じゃんけんを開始します！");
		 System.out.println("0.グー");
		 System.out.println("1.チョキ");
		 System.out.println("2.パー");
		 
		 Random rand = new Random(); /*形はScannerと同じであるが、ランダム性を提供するインスタンス*/
		 int winCount = 0;

	     for (int i = 1; ; i++) { /*Forを用いて繰り返し処理を行えるようにしている*/
	      System.out.print("あなたの手を入力してください（0〜2）：");
	     int userHand;
	     /*ユーザーが文字の入力を可能にする*/
	     try {
	      userHand = Integer.parseInt(SCM.nextLine());
	     } 
	     /*何を入力したのか判別を行う*/ 
	     catch (NumberFormatException e) {
	      System.out.println("数字で 0〜2 を入力してください");
	     continue;
	     }
	     if (userHand < 0 || userHand > 2) { /*変数の数字がどうなっているのか処理している、演算子を用いて結果ごとに処理している*/
	      System.out.println("無効な入力です（0〜2を入力）");
	     continue; /*コンテニューで処理をもう一度呼び起こし再度入力を可能にする*/
	     }
	     int cpuHand = rand.nextInt(3);
	      String[] hands = {"ぐー", "ちょき", "ぱー"};
	      System.out.println("あなた: " + hands[userHand]);
	      System.out.println("相手: " + hands[cpuHand]);
	     if (userHand == cpuHand) {
	      System.out.println("DROW あいこ。もう一度やりましょう！");
	     } 
	     else if ((userHand == 0 && cpuHand == 1) ||
	              (userHand == 1 && cpuHand == 2) || /*IF文でもし数値が〇〇であいてと同じだった場合を処理している*/
	              (userHand == 2 && cpuHand == 0)) {
	      System.out.println("やるやん！");
	      System.out.println("次は俺にリベンジさせて！");
	       winCount = i;
	     break;
	     } 
	     else {
	      System.out.println("俺の勝ち！");
	      System.out.println("負けは次につながるチャンスです！");
	      System.out.println("ネバーギブアップ！");
	     }
	     }
	     System.out.println("勝つまでにかかった時間は " + winCount + " 回です！");
	     System.out.println("もう一度遊びますか？");
		 String c = "";
		  c = SCM.next();
		 if (c.equals("y")) { /*継承前の処理同様、作業をわかりやすくするため継承し処理を継続させる*/
			 janken();
		 } 
		 else {
		   return;
		 }
	 }
}
