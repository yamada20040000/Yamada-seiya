package curriculum_New_question;

import java.util.Random;

public class Qes7 {
    public static void main(String[] args) {
        int[] Anb = GRN(7);           /*ランダムな7つの数値を指定した*/
        double average = AVR(Anb);    /* 平均値を取得している*/
        System.out.println(average >= 50); /* 平均値が50以上か判定して出力←ここが問題 */
        }

    /*引数の回数分、1～100のランダムな整数を配列に格納して返す*/
    public static int[] GRN(int count) {
        Random r = new Random(); /*インスタンスを作成*/
        int[] re = new int[count];
        for (int i = 0; i < count; i++) { /*前回と同じで数字をランダムに作成*/
            re[i] = r.nextInt(100) + 1;
            System.out.println(re[i]);
        }
        return re;
}
    /*配列の平均値を計算して返す（表示もする）*/
    public static double AVR(int[] array) { /*受け取りのメソット*/
        double sum = 0; /*ダブルを使用することで大きな数値や小数点にも対応*/
        for (int v : array) {
            sum += v;
        }
        double ave = sum / array.length; /*ランダムに出した数値と値を割る処理*/
        System.out.println("平均" + ave);
        return ave;
        }
}

