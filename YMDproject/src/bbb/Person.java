package bbb;

/*変数宣言*/
public class Person {
    String name;
    int age;
    double height;
    double weight;
 /*カウント用*/
    static int count = 0;

    /*コンストラクタ*/
    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count = 1;
    }

    /*BMIの計算用*/
    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    /*コンソールに表示するためのもの*/
    public void print() {
    	double bmicc = Math.floor(this.bmi());/*これはprint()かコンストラクタ内でやることNaNになる*/
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(bmicc);
        System.out.println();
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + bmicc + "です");
        System.out.println();
        }

    public static void printTotal() {
        System.out.println("合計 " + count + " 人です");
    }
}
