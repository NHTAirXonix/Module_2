package casestudy.models.person;

public abstract class Person {
    private int identityNumber;
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(int identityNumber, String name, int age, String address) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return identityNumber;
    }

    public void setId(int id) {
        this.identityNumber = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "identityNumber=" + identityNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
