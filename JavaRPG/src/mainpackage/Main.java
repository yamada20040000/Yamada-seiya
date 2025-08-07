package mainpackage;

import java.util.Scanner; /*スキャナーでコンソールに文字入力ができるようにインポート*/

import statuspackage.Player; /*Player.javaから情報を受け取ってる*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); /*Scannerのインスタンスを作成*/

		System.out.print("名前を入力してください：");
		String inputName = scanner.nextLine(); /*１行文字を入力できるようにしている*/

		Player player = new Player(inputName);/*プレイヤー情報のインスタンスを作成、送り返している*/

		/*コンソールに表示するために書いておく↓*/
		System.out.println("\nこんにちは 「" + player.getName() + "」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + player.getHp());
		System.out.println("MP：" + player.getMp());
		System.out.println("攻撃力：" + player.getAttack());
		System.out.println("素早さ：" + player.getSpeed());
		System.out.println("防御力：" + player.getDefense());
		System.out.println("おまけ" + " 運の良さ" + player.getlucky());
		System.out.println("\nさあ冒険に出かけよう！");
	}
}