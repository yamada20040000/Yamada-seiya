package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	String Dog;

	// Q2：フィールドに動物の数の変数を定義してください。
	int DogCount;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() { /*←どこでもドアにたとえるとわかりやすい*/
		Dog = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int count) {
		DogCount = count;
	}
}
/*public ～OO～はどこでもドア（入口）のような役割を持っている
 * その中に何を通すのか決める、数字、今回のように犬など*/
