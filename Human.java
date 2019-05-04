public class Human {
    //thuoc tinh
    String name;
    int age;
    String gender;

    //ham tao
    public Human() {
        name = "WeeZys";
        age = 19;
        gender = "male";
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //phuong thuc
    public void eat() {
        System.out.println(name + " eating");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }
}
