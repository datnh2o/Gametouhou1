public class Employee extends Human {
    @Override
    public void eat() {
        super.eat();
        System.out.println(name + " eating done!");
    }
}
