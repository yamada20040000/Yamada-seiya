package vehicle;

/*データ型と宣言*/
public class Bicycle extends Vehicle {
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	/*コンストラクタ（並び順に注意）*/
	public Bicycle(String firstName, String lastName, int age, double height, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	/*情報の受け取りとprivateに情報をセットするもの*/
	public String fullName() {
		return firstName + lastName;
	}

	public int getage() {
		return age;
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

	/*上の情報受け取りからFirst+lastのfullNameを呼びsetOwnerをしている
	 * getを使い呼び出しを行う（ここだけで完結している）*/
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
