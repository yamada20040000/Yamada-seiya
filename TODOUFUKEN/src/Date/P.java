package Date;

import java.util.HashMap;
import java.util.Map;
/*前回と同じライブラリを作成するためのものライブラリの設計図と動かすためのガイド*/

public class P {
    private String name;      /*都道府県名*/
    private String capital;   /*市区町村*/
    private double area;      /*大きさ*/

    /*コンストラクタそれぞれ変数の名前を指定自動で行う*/
    public P(String name, String capital, double area) {
        this.name = name;
        this.capital = capital;
        this.area = area;
    }

    /*getteでプライベートからの読み取りを可能にしているr*/
    public String getName() { return name; } /*リターンで文字や数値を戻している*/
    public String getCapital() { return capital; }
    public double getArea() { return area; }

    /*表示用のメソット初心者お馴染みのSysoutpln*/
    public void display() {
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2");
        System.out.println();
    }

    private static final Map<Integer, P> PREF_MAP = new HashMap<>();
    static {
        PREF_MAP.put(0, new P("北海道", "札幌市", 83424));
        PREF_MAP.put(1, new P("青森県", "青森市", 9646));
        PREF_MAP.put(2, new P("岩手県", "盛岡市", 15275));
        PREF_MAP.put(3, new P("宮城県", "仙台市", 7282));
        PREF_MAP.put(4, new P("秋田県", "秋田市", 11638));
        PREF_MAP.put(5, new P("山形県", "山形市", 9323));
        PREF_MAP.put(6, new P("福島県", "福島市", 13784));
        PREF_MAP.put(7, new P("茨城県", "水戸市", 6097));
        PREF_MAP.put(8, new P("栃木県", "宇都宮市", 6408));
        PREF_MAP.put(9, new P("群馬県", "前橋市", 6362));
        PREF_MAP.put(10, new P("埼玉県", "さいたま市", 3798));
       /*前回の課題同様で、ライブラリを作成してデータの表示を行うため今回はPを指定して情報の指定を行う
        *都道府県のデータを数値でおこなうため""はいらない、いつも通りPのインスタンス作成 している*/
    }

    /*idからPのデータを習得してる*/
    public static P getById(int id) {
        return PREF_MAP.get(id);
    }
}
