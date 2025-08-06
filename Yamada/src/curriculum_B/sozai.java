package curriculum_B;
import java.util.Scanner;

public class sozai {
	public class Qes6 {
        public static void main(String...age) {
     	   Scanner SC = new Scanner(System.in);
     	   String come;
     	   come = SC.nextLine();
     	   String[] item = come.split("、");
            String[] name= {"パソコン", "冷蔵庫", "扇風機","洗濯機","加湿器","テレビ","ディスプレイ","その他"};
            for (String str : name){ 
            int RC = (int)(Math.random() * 10) + 1;
            str = str.trim();
            switch(str) {
            case "パソコン":
         	   System.out.println(str + "は" + RC + "個あります");
         	   System.out.println();
            break;
            case "冷蔵庫" :
         	   System.out.println(str + "は" + RC + "個あります");
         	   System.out.println();
         	   break;
            case "扇風機":
         	   System.out.println(str + "は" + RC + "個あります");
         	   System.out.println();
            break;
            case "洗濯機":
         	   System.out.println(str + "は" + RC + "個あります");
         	   System.out.println();
            break;
            case "加湿器":
         	   System.out.println(str + "は" + RC + "個あります");
         	   System.out.println();
            break;
            case "テレビ":
         	   System.out.println(str + "は" + RC + "個あります");
         	   System.out.println();
            break;
            case "ディスプレイ":
                System.out.println(str + "は" + RC + "個あります");
                System.out.println();
            break;
            case "その他":
                System.out.println(str + "は対応していない商品です");
                System.out.println();
            break;
            default :
            break;
         	   
            }
            }
            }
}
}

/*説明が難しいが、修正前の文と比べFor文の中で指定していないため、String指定のものが再度読み込まれてしまう事態が発生している*/
/*Breakをしても残った変数を呼び出し処理されてしまうため、Forの中でStringの指定及び変数の変更を行う必要があるようだ*/