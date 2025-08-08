package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Object.Animal;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("動物情報を入力してください（例）");
        System.out.println("ライオン:2.1:80");

        /*ここでは、コンソールにユーザー入力した情報を処理している
         * それぞれからのリストを作成し、インターフェイスの作成も行っている*/
        
        /*動物名以外は同じ処理でtryでレンジとスピードの入力をifで動物の名前を入力させている
         * catchやifを用いて、対応する値が入力されなければ、エラー文を表示、対応するならばリストを作成とデータ呼び出し
         * 既存のデータから上書きする形を取っているpriveteにデータを保存させ最後に呼び出している*/
        String input = sc.nextLine();
        String[] animalInfos = input.split(",");
        List<Animal> animals = new ArrayList<>();

        for (String info : animalInfos) {
            String[] parts = info.split(":");
            if (parts.length != 3) {
                System.out.println("フォーマットエラー: " + info);
                continue;
            }

            String name = parts[0].trim();
            double length;
            int speed;

            try {
                length = Double.parseDouble(parts[1].trim());
                speed = Integer.parseInt(parts[2].trim());
            } catch (NumberFormatException e) {
                System.out.println("数値変換エラー: " + info);
                continue;
            }

            Animal animal = Animal.fName(name);
            if (animal == null) {
                System.out.println(name + " は登録されていません。");
                continue;
            }

            // ユーザー入力で体長と速度を上書き
            animal.setLength(length);
            animal.setSpeed(speed);

            animals.add(animal);
        }

        /*コンソールに入力とものになるデータを表示するためのもの*/
        System.out.println("\n動物情報 ");
        for (Animal a : animals) {
            System.out.println("動物名：" + a.getName());
            System.out.println("体長：" + a.getLength() + "m");
            System.out.println("速度：" + a.getSpeed() + "km/h");
            System.out.println("学名：" + a.getScientificName());
            System.out.println();
        }

        sc.close();
    }
}
