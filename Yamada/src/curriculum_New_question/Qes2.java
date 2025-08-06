package curriculum_New_question;

public class Qes2 {
	public static void sub(int a, int b) {/*今回は整数のためintでa,bを指定*/
		int POI = a * b ; /*宣言したPOIはabの計算を行った結果が格納される*/
		System.out.println(POI);
	}
	public static void main(String...args) {
		sub(2, 2); /*subのメソットを使い今回は２を送る*/
	}
	/*メソットの[]と...の違いはデータを送る側か受け取る側かで考えるとわかりやすい*/
}
