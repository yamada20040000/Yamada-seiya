package curriculum_B;
import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); /*文字入力をかのうにしている*/
        System.out.print("生徒の人数を入力してください: ");
        int ns= scn.nextInt();

        double[] heikin = new double[ns]; /*平均値を格納しておくためのもの生徒の平均点を格納する*/

        /*全体の平均値を格納するための処理*/
        double  HKT = 0; /*平均値を格納するための宣言*/
        int BEN = 4 * ns; /*生徒×教科の数を指定*/

        for (int i = 0; i < ns; i++) { /*入力した生徒の数を表示する＋点数入力のスクリプト*/
            System.out.println("\n" + (i + 1) + "人目の成績を入力してください");
            System.out.print("『英語』の点数: ");
            int e = scn.nextInt(); /*変数を宣言しておくことで後の平均作成に使用する*/
            System.out.print("『数学』の点数: ");
            int m = scn.nextInt();
            System.out.print("『理科』の点数: ");
            int sc = scn.nextInt();
            System.out.print("『社会』の点数: ");
            int so = scn.nextInt();

            double average = (e + m + sc + so) / 4.0;/*教科の数と入力した数値を処理、ダブルに格納している（上記とは別のダブル*/
            heikin[i] = average; /*上記で作成したダブルに平均値を苦悩*/

            HKT += (e+ m+ sc + so); /*平均点を格納するためにおいている*/
        }

        System.out.println("\n各生徒の平均点");
        for (int i = 0; i < ns; i++) {  /*繰り返し行うことでn数の生徒数に対応し、かつ１人ずつの処理を行っている*/
            System.out.printf("%d人目の平均点: %.2f点%n", (i + 1), heikin[i]);
        }

        double heikin2 = HKT / BEN; /*生徒人数あたりの平均を計算し出力している変数の宣言も忘れずに*/
        System.out.printf("\n全体の平均点: %.2f点%n", heikin2); /*ただの表示ではなく先頭２文字を追加することで指定人数表示している*/

        scn.close();/*スキャンを閉じ入力できないようにしている*/
    }
}