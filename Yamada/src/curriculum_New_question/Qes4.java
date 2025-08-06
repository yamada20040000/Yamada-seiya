package curriculum_New_question;

public class Qes4 {
	/*Q3でやったやつ*/
	public static void sub(int a, int b) {
		int POI = a * b ;  
		System.out.println(POI);
	}
/*------------------------------------------------------------------------*/
	
	public static void sub(double a, double b) {
		double SSA = a * b ; /*受け取り、格納し、プリントアウトを行う*/
		System.out.println(SSA);
	}
	public static void main(String...args) {
		sub(2.5, 2.9); /*少数点が使われている為、ダブルが優先される*/
	}
	/*メソットが同じ名前だとしても、パラメータ宣言が違うことで変わる
	 *  intは小数点が使えないためダブルが使われる*/
}
