package aaa;

import bbb.Person;

public class Main {
    public static void main(String... args) {
    	/*新しいperson1のインスタンス作成*/
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

        person1.print();
       /*合計人数表示用*/
        Person.printTotal();
    }
}

