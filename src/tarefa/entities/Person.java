package tarefa.entities;

public class Person implements IPerson {
    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = resolveGender(gender);
    }

    private Person() {};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = resolveGender(gender);
    }

    private String resolveGender(String prefix) {
        switch (prefix) {
            case "M":
                return "Male";
            case "F":
                return "Female";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
