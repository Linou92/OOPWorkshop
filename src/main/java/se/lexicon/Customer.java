package se.lexicon;

public class Customer {

    private String name;
    private String email;

    Customer (String name, String email) {
        if(name == null || name.isBlank() || email == null || email.isBlank()){
            throw new IllegalArgumentException("Name and/or email cannot be null or blank");
        }
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void printInfo() {
        IO.println("Customer name is " + name + " and his email is " + email);
    }
}
