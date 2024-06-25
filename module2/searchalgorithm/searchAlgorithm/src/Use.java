public class Use {
    private final String email;
    private final String name;
    private final int  role;

    public Use(String email, String name, int role){
    this. name= name;
    this. email= email;
    this. role= role;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Use{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
