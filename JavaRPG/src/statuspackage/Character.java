package statuspackage;

public class Character {
	/*別のところ直接干渉できないクラス*/
	private int hp;
	private int mp;
	private int atk;
	private int spd;
	private int def;
	private int lck;
	/*それぞれステータスを宣言*/

	public Character() {
		// デフォルトコンストラクタ
	}

	/*情報の取り出しを行う使用はgetter*/
	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getAttack() {
		return atk;
	}

	public int getSpeed() {
		return spd;
	}

	public int getDefense() {
		return def;
	}
	
	public int getlucky() {
		return lck;
	}

	/*情報を設定するためのもの、別の場所で設定をしている。*/
	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public void setAttack(int attack) {
		this.atk = attack;
	}

	public void setSpeed(int speed) {
		this.spd = speed;
	}

	public void setDefense(int defense) {
		this.def = defense;
	}
	
	public void setlucky(int lucky) {
		this.lck = lucky;
	}
}

/*コンストラクタや宣言などは１つのクラスやパッケージにまとめると見栄えがいいこと、やりやすいことに気づいた*/
