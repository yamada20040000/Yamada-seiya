package Main;

import java.util.ArrayList; /*インターフェイスように導入主にArrayListで使用*/
import java.util.Comparator; /*インターフェイスを導入するために使用した主にルールを教えてくれる*/
import java.util.List; /*リストを作成するために導入したもの*/
import java.util.Scanner; /*文字を入力するために導入したもの*/

import Date.P; /*DateパッケージのPをインポートして情報を呼び出している*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("数字（都道府県ID）をカンマ区切りで入力してください");
		String input = sc.nextLine();
		/*入力をできるようにしてる*/

		System.out.println("昇順（asc）か降順（desc）か入力してください");
		String order = sc.nextLine().trim().toLowerCase();
		/*入力を可能にしStringで別の宣言を行いascとdescを入力のお願いをしている
		 * trimで空白を作成している*/

		sc.close();

		// 入力を分割して整数のリストに変換
		List<Integer> ids = new ArrayList<>(); /*リストを作りましたの宣言名前はids、インターフェイスの表示の役割*/
		for (String s : input.split("[,、\\s]+")) { /*0や５など飛んだ場合などをsとして処理し取り出す繰り返しの処理*/
			try {
				ids.add(Integer.parseInt(s.trim())); /*文字列を整数に変えようとする処理*/
			} catch (NumberFormatException e) { /*整数が獲得できなかった場合エラー文の代わりに下が出るようにしてる*/
				System.out.println(s + " は無効なIDです。無視します。");
			}
			/*forで入力した,、を空白で分割している、分割したものは空白をtrimで除去することで読み込みを可能にした
			 * Integerでids.addに追加、この時整数に変換している、sysoutで整数以外ははじくようにしている*/
		}

		List<P> selectP = new ArrayList<>();  /*空白のリストを作成している*/
		for (int id : ids) { /*ユーザーが入力したPの情報を取り出す作業を繰り返し行っている*/
			P p = P.getById(id); 
			if (p != null) { /*Idに対応した都道府県が見つからない、もしくは何らかの状態で取り出せない場合
			したのプリントアウトに出せるようにしてる 見つかる場合はselectP.addでデータを表示できるようにしている*/
				selectP.add(p);
			} else {
				System.out.println(id + " は登録されていません。");
			}
		}

		Comparator<P> comp = Comparator.comparingDouble(P::getArea);
		/*PのgetAreaの読み込みソート順にするためのもの Comparatorの作成もしている*/
		if (order.equals("desc")) {
			/*もしdescだった場合の処理を行っている下記のreversedの意味のままで順番をリバースし逆にしている*/
			comp = comp.reversed();
		}
		selectP.sort(comp);/*選択されたデータを大小でソートしている*/

		/*処理が終わったデータを繰り返しを使ってPのコンソール出力処理を繰り返し行っている*/
		for (P p : selectP) {
			p.display();
		}
	}
}
