package curriculum_B;

public class Qes4 {
          public static void main(String...args) {
          for (int i = 1; i <= 9; i ++) { /*指定した回数処理を行う＋上下にどのように表示するかが記載される*/
          for (int j = 1; j <= 9 ; j ++) {
           System.out.print( "|" + ( 
        		   String.format("%02d", i)) +  "＊"  +   ( 
        				   /*%02dで小数点を切り上げている、切り上げ前の数値は処理は控除されないので注意*/
        		   String.format("%02d",j )  ) + "=" +  
        		   String.format("%02d", i * j)  + "|");
      }
      System.out.println();
    }	  
  }
}
