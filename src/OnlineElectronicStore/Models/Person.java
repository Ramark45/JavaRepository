package OnlineElectronicStore.Models;
public class Person {
    String name, lastName;
    Credentials credentials;
    public Person(String name, String lastName, Credentials credentials) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.credentials = credentials;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Credentials getCredentials() {
        return credentials;
    }
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", lastName=" + lastName + ", credentials=" + credentials + "]";
    }
}

