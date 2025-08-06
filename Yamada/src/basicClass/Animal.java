package basicClass;

public class Animal {

	public static void main(String[] args) {
		/*mainメソッド２個でやろうとしたが、できないので事前にmainで呼び出しておく*/
		showDogName();

		showDogCount();
	}

	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。

	public static void showDogName() {
		Dog dog1 = new Dog();
		System.out.println("動物: " + dog1.Dog);
		/*new Dog();はどこでもドアをくぐって来た犬でその前のDog dog1が案内人のような役割を起こす。
		 * 寿司屋の待ち順のような番号を渡された犬はSystemoutの指定した場所にたどり着ける*/
	}
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。

	public static void showDogCount() {
		Dog dog2 = new Dog(5);
		System.out.println("数は: " + dog2.DogCount);
	}
}