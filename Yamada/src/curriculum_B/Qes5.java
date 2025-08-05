package curriculum_B;

public class Qes5 {
	public static void main(String...args) {
        for (int i = 1; i <= 9; i ++) { /*Qes4と同じ処理、配置を変え縦９横２０に伸ばしている*/
        for (int j = 9;  j <= 20 ; j ++) {
         System.out.print( "|" + ( 
      		   String.format("%03d", i)) +  "＊"  +   (
      		   String.format("%03d",j )  ) + "=" +  
      		   String.format("%03d", i * j)  + "|");
}
         System.out.println();
}	  
}
}
