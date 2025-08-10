package bbb;

public class Person {
    String name;
    int age;
    double height;
    double weight;

    static int count = 0;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++;
    }

    public double bmi() {
        return this.weight / (this.height * this.height);
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.bmi());
        System.out.println();
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
        System.out.println();
        }

    public static void printTotal() {
        System.out.println("合計 " + count + " 人です");
    }
}
