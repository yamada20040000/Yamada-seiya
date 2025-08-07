package statuspackage;

import java.util.Random; /*ランダムの要素をインポート*/

public class Player extends Character {
	private String name;

	public Player(String name) { /*プレイヤーのコンストラクタ*/
		this.name = name;
		generateRandomStatus(); /**/
	}

	public String getName() {
		return name; /*入力された文字の送り返し*/
	}

	public void setName(String name) {
		this.name = name; /*入力された文字をStringとして格納する　voidなのでなにも返さないと思われる*/
	}

	private void generateRandomStatus() {
		Random rand = new Random(); /*ランダムのインスタンスを作成*/
		setHp(rand.nextInt(901) + 100);  /*左側が最高値で右側が最低値です*/
		setMp(rand.nextInt(901) + 100);    /*ランダムがrand指定しているので、右の値からランダムで生成されます*/
		setAttack(rand.nextInt(501) + 50);   /*setがついているものに値が振られここからgetがあるmainに情報が飛んでいく*/
		setSpeed(rand.nextInt(901) + 100); 
		setDefense(rand.nextInt(201) + 10); 
		setlucky(rand.nextInt(901) + 10);
	}
}