public class Dinglemouse {
    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName.length() == 0 ? lastName : lastName.length() == 0 ? firstName : firstName + " " + lastName;
    }
}
