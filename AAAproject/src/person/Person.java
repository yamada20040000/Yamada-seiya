package person;

/*プライベートの変数宣言*/
public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	public static int count = 0; /*今回は特に指定がないのでpublicメソットでやったが、priveteにするとエラーが出る*/

	/*コンストラクタ、mainの情報の受け取り屋さん*/
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
		count ++; /*問題文的に一人増えたのでカウントを増やせということだと認識したので、
		人数に応じて増えるようにした。（今回は１人追加)*/
	}

	/*今回の紹介文はプライベート宣言であるのでそれぞれ情報を保存、取り出しなどをできるようにしてる。
	 * 情報は抜き出しするためにgetとsetはpriveteを使い際は必用*/
	public String getname() {
		return this.name;
	}

	public int getage() {
		return this.age;
	}

	public double getheight() {
		return this.height;
	}

	public double getweight() {
		return this.weight;
	}

	public int getcount() {
		return count;
	}

	public String setname(String name) {
		return this.name = name;
	}

	public int setage(int age) {
		return this.age = age;
	}

	public double setheight(double height) {
		return this.height = height;
	}

	public double setweight(double weight) {
		return this.weight = weight;
	}

	public int setcount(int count) {
		return this.count = count;
	}

	/*BMIの計算のみプライベートクラスではなくpublicで宣言しているためgetsetは使っていないが
	 * 情報の引き抜きが必要なためthisを入れている。*/
	public double bmis() {
		return this.weight / this.height / this.height;
	}

	/*いつもの表示するやつ*/
	public void print() {
		System.out.println("名前は" + this.getname() + "です");
		System.out.println("歳は" + this.getage() + "です");
		System.out.println("身長は" + this.getheight() + "です");
		System.out.println("体重は" + this.getweight() + "です");
		System.out.println("BMIは" + this.bmis());
		System.out.println();
	}
}
