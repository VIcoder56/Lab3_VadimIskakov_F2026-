public class Person {
    private int personId;
    private String name;
    private int age;

    public Person (int personId, String name, int age){
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public void performDuties() {
        System.out.println(name + " is performing their duties");
    }

    public String getName() {
        return name;
    }
}
