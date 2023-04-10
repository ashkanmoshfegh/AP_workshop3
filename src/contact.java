public class contact {
    private String group=new String();
    private String email=new String();
    private String firstname=new String();
    private String lastname=new String();
    private String phonenummber=new String();

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhonenummber(String phonenummber) {
        this.phonenummber = phonenummber;
    }

    public void Contact(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getGroup() {
        return group;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenummber() {
        return phonenummber;
    }
}
