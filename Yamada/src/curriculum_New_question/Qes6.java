package curriculum_New_question;

import java.util.Random;

public class Qes6 {
	    public static void main(String[] args) {
	        int[] Anb = GRN(5);  /* 例：5回分ランダム生成している*/
	        AVR(Anb); /*平均値を出す*/
	       }

	    /*引数の回数分、1～100のランダムな整数を配列に格納して返す*/
	    public static int[] GRN(int count) {
	        Random r = new Random(); /*ランダムのインスタンスを作成*/
	        int[] re = new int[count];
	        for (int i = 0; i < count; i++) {  /*Forを使ってランダムな整数を作成している、今回は指定が５なので５回*/
	            int n = r.nextInt(100) + 1; // 1〜100（0を含まないというか無理やり１を足して０をなくしている）
	            re[i] = n; /*reにnを代入させている*/
	            System.out.println(n);
	            System.out.println();
	        }
	        return re;
	        }
	    /*配列の平均値を計算してダブルを用いて小数点付きで出力する*/
	    public static void AVR(int[] array) { /*呼び出しのメソット*/
	        double u = 0; /*初期化*/
	        for (int v : array) { /*拡張for文で全部の要素の合計をしている*/
	            u += v;
	        }
	        double ave = u / array.length; /*AVRのintArrayのレンジ（ある数字全部）を生成した分割っている*/
	        System.out.println("平均"+ave);
	        }
}
