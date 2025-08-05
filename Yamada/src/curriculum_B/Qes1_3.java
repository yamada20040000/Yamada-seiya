package curriculum_B;

import java.util.Scanner;

public class Qes1_3 {
		
		@SuppressWarnings("unused")
	    
		public static void main(String...args) {
			
		 System.out.println("ユーザー名を入力してください");	
	     Scanner scn = new Scanner(System.in);	 /*スキャナーで文字を認識させ入力できるようにしている*/
		
	     String DEV; /*変数を指定し、その変数に文字を入力できるようにしている*/
		 DEV = scn.nextLine(); 
		
		  if(DEV.length() > 10){
		   System.out.println("10文字以内で入力してください");
		 return; /*もし変数が対応してないもしくは記載ミスがあった場合、再度入力できるようにしている*/
		 }
		  else if (DEV.trim().isEmpty()){
		   System.out.println("名前を入力してください");
		 return;
		 }
		  else if (!DEV.matches("[a-zA-Z0-9]+")){ 
			  /*半角英数字を認識できるようにしている　DEVの前の！は反転を意味し半角英数ではないものを認識させる*/
		   System.out.println("半角英数字で入力してください");
		 return;
		 }
		  else if (DEV == null){
		   System.out.println("その名前は使用できません");
		 return;
		 }
		  else {
		     System.out.println("ユーザー情報「"+ DEV + "」を登録しました");
		 }
		 Janken jkn = new Janken();/*先の話になるが継承であり、指定した変数へここで処理を継承させている*/
		 jkn.janken();
		 }
	}
