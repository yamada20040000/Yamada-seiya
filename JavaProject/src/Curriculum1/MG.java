package Curriculum1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MG { 
	/*他のクラスからは直接アクセスできない。*/
    private String gr;
    private String fc;
    private String ft;
    private String dtm;

    public MG() { /*コンストラクタの昨日、MGのインスタンスがあれば情報を継承する*/
    	/*thisしていはそのままの意味、混合してしまいそうな時に使うとよい*/
        this.gr= "こんにちは！ここは日本です！";
        this.fc= "この寿司はうまい";
        this.ft= "寿司は和食です";

        LocalDateTime now = LocalDateTime.now(); /*ローカルからインポートして、データを習得*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        /*前回同様で、日時の形式を整えるためのもの*/
        String Date = now.format(formatter); /*ストリングにデータフォーマットを変換*/
        this.dtm = "今の現在日時は" + Date + "です";
    }
    
    public void sm() { /*smを指定したメソットのコンソールに表示するために使用*/
        System.out.println(this.gr);
        System.out.println(this.fc);
        System.out.println(this.ft);
        System.out.println(this.dtm);
    }
}