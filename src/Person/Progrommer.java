package Person;

public class Progrommer extends Person{
    public Progrommer(String name, int age) {
        super(name, age);
    }

    @Override
    public void working() {
        System.out.println("Peaksoft java instructor");
    }

}
