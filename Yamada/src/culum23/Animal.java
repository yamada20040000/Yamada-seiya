package culum23;

public class Animal {

	/*フィールド（すべてprivate）*/
	private String name;
	private double length;
	private int speed;

	public void setName(String name) {/*setを使って値を作っている指定がなければ使わなくてもOK、ただ安全になる*/
		this.name = name; /*thisでフィールドを指定している*/
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() { /*値を取り出すためのものset,getと名前のまま役割分担*/
		return this.name; /*このクラスにあるnameに戻り値を返している、コンソールに表示するならこっちの処理*/
	}

	public double getLength() { /*こちらも同じ*/
		return this.length; /*こちらも上のthis同様*/
	}

	public int getSpeed() {
		return this.speed;
	}

	public void showInfo() {/*mainメソットに表示するためのもの*/
		System.out.println("動物名：" + getName()); /*setには値をセットするなどの役割がある*/
		System.out.println("体長：" + getLength() + "m");/*そのため値を取り出すgetがここで選ばれる*/
		System.out.println("速度：" + getSpeed() + "km/h");
	}

	public static void main(String[] args) { /*ここからメイン*/
		Animal lion = new Animal();  /*インスタンス作成*/

		lion.setName("ライオン");/*setに値をセットしている。内容を変えても問題ない*/
		lion.setLength(2.1);
		lion.setSpeed(80);

		/*infoに用意したsopをここでコンソールに表示する*/
		lion.showInfo();
	}
}