package Object;

import java.util.HashMap;
import java.util.Map; /*これら２つはデータを引っ張るのを早くする辞書を作るためのもの*/

public class Animal {
    private String na;  /*動物名*/
    private double oo;  /*体長*/
    private int spd;    /*速さ*/
    private String sna; /*学名*/

    /*名前が入力されると、詳細情報を表示するもの*/
    private static final Map<String, Animal> ANIMAL_DATA = new HashMap<>();
    /*ここでライブラリを作成している。解説は下まで*/
    static {
        ANIMAL_DATA.put("ライオン", new Animal("ライオン", 2.1, 80, "パンテラ レオ"));
        ANIMAL_DATA.put("ゾウ", new Animal("ゾウ", 3.2, 40, "ロキソドンタ・サイクロティス"));
        ANIMAL_DATA.put("パンダ", new Animal("パンダ", 1.9, 30, "アイルロポダ・メラノレウカ"));
        ANIMAL_DATA.put("チンパンジー", new Animal("チンパンジー", 0.94, 25, "パン・トゥログロディテス"));
        ANIMAL_DATA.put("シマウマ", new Animal("シマウマ", 2.4, 65, "チャップマンシマウマ"));
        ANIMAL_DATA.put("インコ", new Animal("インコ", 0.1, 50, "不明"));
        /*この型を使わないとForを何回も回すことになり、最初の課題同様でループのもとになるから使っている
         * Animalデータ.putは例えばライオンと入力されたら、詳細情報をアクティブにするもの
         * キーがStringで値をAnimlにしているつまりStringで入力されると、下のAnimalclassにnew animalが飛んでいく*/
    }

    /*今まで個々にやってものを一括にしたコンストラクタ*/
    public Animal(String na, double oo, int spd, String sna) {
        this.na = na;
        this.oo = oo;
        this.spd = spd;
        this.sna = sna;
    }

    /*名前から情報を習得するためのメソット*/
    public static Animal fName(String name) {
        return ANIMAL_DATA.get(name); /*fnameのStringを送るためのもの*/
    }

    /*コンソールにそれぞれ出力するためのもの*/
    public void Info() { /*mainでanimal.infoを入力すると結果がでる*/
        System.out.println("動物名：" + na);
        System.out.println("体長：" + oo + "m");
        System.out.println("速度：" + spd + "km/h");
        System.out.println("学名：" + sna);
        System.out.println();
    }
}
