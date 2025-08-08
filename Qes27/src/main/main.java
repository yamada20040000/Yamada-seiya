package main;

import java.util.Scanner; /*もじを入力認識するもの*/

import Object.Animal; /*スーパークラスにデータを持ってくるためのもの*/

public class main {
	public static void main(String[] args) { /*このエラー（？）はclassメインと名前かぶっている為起きている。*/
		/*大規模なスクリプトではないので無視します=クラス名を変更するだけ*/
		Scanner sc = new Scanner(System.in); /*インスタンス作成*/
		System.out.println("動物名を入力してください");
		String input = sc.nextLine(); /*お馴染みのinputで入力できるやつ*/
		sc.close();

		for (String name : input.split("、")) { /*ここで区切り「、」を入力したら区切られる*/
			Animal animal = Animal.fName(name.trim()); /*Amimalのgetから情報がここに送られてる*/
			if (animal != null) {
				animal.Info(); /*Animalclassから引っ張ってきている*/
			} else {
				System.out.println(name + " の情報は登録されていません。\n");
			}
		}
	}
}
