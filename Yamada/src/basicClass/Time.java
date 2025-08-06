package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;/*←＊１*/

// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

public class Time {

	/*現在時刻をメソットから文字列に仕手返す処理*/
	public static String NT() {
		LocalDateTime now = LocalDateTime.now(); /*インポート先から情報を習得している(Localから)*/
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		/*↑現在時刻のデータを得るため、imort先のメソットとクラスを引用＊１ 
		 * ちなみにこちらはインポート見ての通りフォーマットから*/
		return now.format(fmt); /*リターンを付けることでフォーマットに返すことをしている*/
	}

	public static void main(String[] args) {
		/*メソッドを呼び出して、結果を表示*/
		String nt = NT();
		System.out.println("現在の日時: " + nt);
	}
}
