package curriculum_New_question;

public class Qes3 {
	public static void moon(int[] Nbers) {
    for (int NB : Nbers) { /*for文を使用することでn数個だった場合にも繰り返すことで対応させた*/
    	System.out.println(NB); /*mainで指定した整数をNBで回収、格納しているのでここでNBを指定*/
    }
}
    public static void main(String[] args) {
    	int[] Num = {1,2,3}; /*入力した順番で表示される*/
    	moon(Num); /*int Nberに値を渡している*/
    }
}

