package curriculum_B;

import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーが商品名を入力できるようにしている
        System.out.println("商品名を『、（読点）』で区切って入力してください：");
        String input = scanner.nextLine();

        // 「、」で分割してそれぞれの変数宣言に対応させている
        String[] items = input.split("、");

        // 各商品ごとに数値が変化するために使用している
        for (String item : items) {
            item = item.trim();  // 前後の空白を削除
            int stock = (int)(Math.random() * 10) + 1; // 1〜10のランダム数を宣言したstock（在庫）に表示する

            // 商品名に応じて処理を分ける
            switch (item) { /*Forで宣言を行うとループして、入力関係なく全表示してしまうため宣言をせずスイッチで完結させた*/
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                case "テレビ":
                case "ディスプレイ":
                    System.out.println(item + "の残り台数は" + stock + "台です");
                    break;

                case "その他商品":
                    System.out.println("『 " + item + " 』は指定の商品ではありません");
                    break;

                default:
                    // 登録されていない商品は表示しないようにしている（処理をわざとついかしていない
                    break;
            }
        }

        scanner.close();
    }
}
