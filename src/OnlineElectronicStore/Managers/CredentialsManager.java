package OnlineElectronicStore.Managers;
import OnlineElectronicStore.Models.*;
import OnlineElectronicStore.classes.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CredentialsManager {
    public static final int NOT_DEFINED =-1;
    public static final int USER =0;
    List<Person> people = null;
    Person loggedIn = null;
    int typeOfPersonLoggedIn =-1;
    private static CredentialsManager instance =null;
    private CredentialsManager(){
        this.people=new ArrayList<Person>();
    }
    public static CredentialsManager getInstance(){
        if(instance == null)
            instance = new CredentialsManager();
        return instance;
    }
    public boolean signUp(Person person){
        if(!areAllFieldsFilledRight(person)){
            System.out.println("Please fill all fields before add new user!");
            return false;
        }
        if(hasSomeUserSameUserName(person.getCredentials().getUsername())){
            System.out.println("This username alredy exists.. please choose another one!");
            return false;
        }
        this.people.add(person);
        return true;
    }
    private boolean areAllFieldsFilledRight(Person person) {
        return person.getName()!=null && person.getLastName()!=null
                &&person.getCredentials().getUsername()!=null
                &&person.getCredentials().getPassword()!=null;
    }
    private boolean hasSomeUserSameUserName(String username){
        for(Person p:this.people)
            if(p.getCredentials().getUsername().equals(username))
                return true;
        return false;
    }
    public boolean logIn() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("******* Log in *******");
            System.out.println("Insert username...");
            String username = scanner.nextLine();

            System.out.println("Insert password...");
            String password = scanner.nextLine();

            if(isThisCredentialsExist(new Credentials(username, password))) {
                Person person = getPersonFromUsername(username);
                if(person == null) {
                    throw new Exception("Something went wrong...");
                }
                this.loggedIn = person;
                changeTypeOfPersonLoggedIn();
                Operations.printOperationThatUserCanDo(this.typeOfPersonLoggedIn);
                System.out.println("Welcome " + username + " [type of user : " + getTypeOfUser() + "]");
                return true;
            }
            throw new Exception("Credentials not found.. Please retry!");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    private boolean isThisCredentialsExist(Credentials credentials) {
        for(Person p: this.people)
            if(p.getCredentials().equals(credentials))
                return true;
        return false;
    }
    private Person getPersonFromUsername(String username) {
        for(Person p: this.people)
            if(p.getCredentials().getUsername().equals(username))
                return p;
        return null;
    }
    private void changeTypeOfPersonLoggedIn() {
        if(this.loggedIn == null)
            this.typeOfPersonLoggedIn = NOT_DEFINED;

        if(this.loggedIn instanceof User)
            this.typeOfPersonLoggedIn = USER;
    }
    public String getTypeOfUser() {
        switch(this.typeOfPersonLoggedIn) {
            case USER:
                return "Customer";
            default:
                return null;
        }
    }
    public void logout() {
        this.loggedIn = null;
        changeTypeOfPersonLoggedIn();
    }
    public int getTypeOfPersonLoggedIn() {
        return 0;
    }
}

