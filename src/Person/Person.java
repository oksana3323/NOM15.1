


package Person;

    public class Person {
        private final String name;
        private static int age;
public void working(){

        }
        public Person(String name,int age) {
            this.name = name;
         this.age=age;
        }

        public static void setAge(int age) {
            Person.age = age;

        }

        public String getName() {
            return name;
        }

        public static int getAge() {
            return age;
        }

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


