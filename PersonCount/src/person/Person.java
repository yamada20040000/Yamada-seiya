package person;

/*宣言 パブリックにしてインポートを可能にした*/
public class Person{
	 private static int count = 0;
	 private String firstName;
	 private String lastName;
	 private int age;
	 private double height, weight;

	 /*コンストラクタ、カウントは前回と違いclassPersonと指定することで前回のエラーがでなくなる
	  * 理由は指定しているから、count単体ではないかつthisを使っていた為のエラー*/
	 public Person(String firstName, String lastName, int age, double height, double weight){
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.age = age;
	  this.height = height;
	  this.weight = weight;
	  Person.count ++;
	 }

	 /*受け取った情報を組み合わせて姓名を合体している*/
	 public String fullName(){
	  return this.firstName + this.lastName;
	 }
	 /*mainからの情報受け取り用*/
	 public int getage() {
		 return this.age;
	 }
	 /*今回はfirstNameをみて実行した結果、格納されることがわかったので略した(同じ型じゃないとできない)*/
	 public double getwenadhe() {
		 return this.weight + this.height;
	 }
	 
	 public String setfullName(String firstName, String lastName) {
		 return this.firstName + this.lastName;
	 }
	 
	 public int setage(int age) {
		return age;
	 }
	 
	 public double setweight(double weight, double height) {
		 return this.weight + this.height;
	 }

	 /*格納した情報の出力*/
	 public void print(){
	  System.out.println("名前は" + this.fullName() + "です");
	  System.out.println("年は" + this.age + "です");
	  System.out.println("身長は" + this.height + "です");
	  System.out.println("体重は" + this.weight + "です");
	  double bmiV = Math.floor(this.bmi());
	  System.out.println("BMIは" + bmiV + "です");
	  System.out.println();
	 }

	 /*BMIの計算*/
	 public double bmi(){
	  return this.weight / this.height / this.height;
	 }

	 /*合計人数の出力*/
	 public static void printCount(){
	  System.out.println("合計" + Person.count + "人です");
	 }
	}

/*今回学んだのは他はパッケージクラスを他のところで使いたい場合class単体ではなくpublicをつけること*/
/*同じ型であれば宣言は同時におこなうことは可能である*/

/*$$今気づいたのですが、計算とか変更があるわけじゃないのでreturn消してsetの型部分voidでよかったですね。
 * fullNameだけ必用ですが、変更が必要な場合ご連絡お願い致します。*/

