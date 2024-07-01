public class Country {
    String id;
    String code;
    String name;

    public Country(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Country{" + "id=" + id + " code=" + code  + " name=" + name+ '}';
    }
}
