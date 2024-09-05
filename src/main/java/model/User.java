package model;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String howDidYouHear;
    private boolean receiveAnnouncements;
    private String contactMethod;

    // Constructor
    public User(String firstName, String lastName, String email, String dateOfBirth, String howDidYouHear, boolean receiveAnnouncements, String contactMethod) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.howDidYouHear = howDidYouHear;
        this.receiveAnnouncements = receiveAnnouncements;
        this.contactMethod = contactMethod;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getHowDidYouHear() {
        return howDidYouHear;
    }

    public boolean isReceiveAnnouncements() {
        return receiveAnnouncements;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHowDidYouHear(String howDidYouHear) {
        this.howDidYouHear = howDidYouHear;
    }

    public void setReceiveAnnouncements(boolean receiveAnnouncements) {
        this.receiveAnnouncements = receiveAnnouncements;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }
}
