package vehicle;

/*データ型と宣言(プライベートの為、情報保存の際は入れ込み必須setter)*/
public class Car extends Vehicle {
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	/*コンストラクタ(指定されたデータや宣言の受け取り口）*/
	public Car(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	/*フィールド名の変更と外部からの情報取り出しの作業を担う*/
	public String fullName() {
		return firstName + lastName;
	}

	public int getage() {
		return age;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public double getheight() {
		return this.height;
	}

	public double setweight() {
		return this.weight;
	}

	public void setage(int age) {
		this.age = age;
	}

	public void setheight(double height) {
		this.height = height;
	}

	public void setweight(double weight) {
		this.weight = weight;
	}

	/*完結型Owner生成機 上のfullNameから名前を引っ張りsetで入れ込みgetで呼び出し*/
	public void buy(Car car) {
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}

}
