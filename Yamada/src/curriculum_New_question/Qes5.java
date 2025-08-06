package curriculum_New_question;

import java.util.Random;

public class Qes5 {
	    
	    public static int[] GRN(int count) {
	        Random R = new Random();/*ランダムインスタンスを追加している*/
	        int[] re = new int[count]; /*ランダムに選ばれた結果を格納する*/
	        int i = 0;
	        while (i < count) {
	            int num = R.nextInt(100) + 1; /* 1～100の乱数を生成+1を付けることで０は生成されないようにした*/
	            re[i] = num; /*iの要素にnumを代入するもの*/
	            System.out.println((i)  + num); /*ランダムに選ばれた結果が表示される*/
	            i++;
	        }
	        return re;
	        }
	    public static void main(String[] args) {
	        int[] num = GRN(5); /*ランダムな数字を今回は５個作成するためのもの*/
	        for (int n : num) { /*配列の中身を確認する用、nを使用することで作成した個数分表示できる*/
	            System.out.print(n + " "); /*空白を空けることで、作成されたものが見やすくなっている*/
	    }
	    }
	    }
