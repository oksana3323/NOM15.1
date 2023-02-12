package Person;

public class Fuilder extends Person{
    public Fuilder(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Kut stroy");
    }

}
