public class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age ;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "tuoi=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
