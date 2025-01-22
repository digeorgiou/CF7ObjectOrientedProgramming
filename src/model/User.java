package model;

public class User {
    long id;
    String firstname;
    String lastname;

    User(){

    }

    User(long id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void print(){
        System.out.println("{" + this.id + ", " + this.firstname + ", "
        + this.lastname + "}");
    }
}
