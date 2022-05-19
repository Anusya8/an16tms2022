package model;

public class Person {

    // характеристики (свойстваб поля) глобальная переменная
    public int age;
    public String name;
    public int height;
    public Address address;

    public Person(int age, String name, int height) {
       this(age,name,180);
        this.age = age;
        this.name = name;
        this.height = height;
        this.address = address;

    }

    public Person(){ // конструктор о умолчанию
        // тело
        System.out.println("конструктор для Person");

    }
 public void test() {

        age =12;
         int age =34; // локальная переменная метода
        this.test();
        System.out.println(value+str+age + this.age);
 }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", address=" + address +
                '}';
    }
}
