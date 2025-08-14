package main;

import vehicle.Bicycle;
import vehicle.Car;

public class Main {
    public static void main(String[] args) {
    	/*指定した情報、インスタンス作成それぞれバイクと車用*/
    	Car person1 = new Car("鈴木", "太郎", 20, 1.7, 60);
        Bicycle person2 = new Bicycle("山田", "花子", 22, 1.5, 40);

        /*オーナーの名前を呼ぶ出すためのインスタンス*/
        Car car = new Car("鈴木", "太郎", 20, 1.7, 60);
        Bicycle bicycle = new Bicycle("山田", "花子", 22, 1.5, 40);

       /*上下含めこれらはmainメソット内で行うこと、文字の大小に注意し型も問題ないか確認*/
        
        /*それぞれオーナーの名前を各setter getterから習得今回はfullNameを参照*/
        car.setOwner(person1.fullName());
        bicycle.setOwner(person2.fullName());

        /*上でセットしたオーナーのFirstとlastのNameは別クラスでつなげているため普通に表示*/
        System.out.println(car.getOwner());
        System.out.println(bicycle.getOwner());
        
        /*別クラスでprintoutした結果を表示*/
        person1.buy(car);
        person2.buy(bicycle);
    }
}

