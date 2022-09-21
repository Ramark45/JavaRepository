public class NameMe {
    String firstName;
    String lastName;
    String name;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        name = this.firstName + " " + this.lastName;
    }
}
