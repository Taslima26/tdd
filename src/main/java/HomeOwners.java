public class HomeOwners {
    private String title;
    private String firstName;
    private String initial;

    public HomeOwners(String title, String firstName, String initial, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.initial = initial;
        this.lastName = lastName;
    }

    private String lastName;

    public HomeOwners(String title, String firstName, String lastName) {
        this.title=title;
        this.firstName=firstName;
        this.lastName=lastName;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override public String toString()
    {
        return "HomeOwner [title =" + title +",first-name=" + firstName + ", last-name=" + lastName + ", initial=" + initial + "]";
    }





}
