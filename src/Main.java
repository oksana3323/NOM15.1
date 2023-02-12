import Person.Driver;
import Person.Fuilder;
import Person.Progrommer;

public class Main {
    public static void main(String[] args){
        Progrommer progrommer= new Progrommer("Chyngyz",40);
       Driver driver=new Driver("Ruslan",25);
        Fuilder fuilder=new Fuilder("Amir",24);
        progrommer.working();
         driver.working();
   fuilder.working();
        System.out.println(progrommer.toString());
        System.out.println(driver.toString());
        System.out.println(fuilder.toString());


    }

}