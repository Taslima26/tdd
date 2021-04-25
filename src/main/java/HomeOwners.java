public class HomeOwners {
    private String title1;
    private String firstName1;
    private String initial1;
    private String lastName1;
    private String title2;

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getInitial1() {
        return initial1;
    }

    public void setInitial1(String initial1) {
        this.initial1 = initial1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getInitial2() {
        return initial2;
    }

    public void setInitial2(String initial2) {
        this.initial2 = initial2;
    }

    private String firstName2;
    private String  lastName2;
    private String initial2;


   public HomeOwners(String title1,String  firstName1,String lastName1,String initial1){
       this.title1 = title1;
       this.firstName1 = firstName1;
       this.initial1 = initial1;
       this.lastName1 = lastName1;
   }
    public HomeOwners(String title1, String firstName1, String lastName1, String initial1, String title2, String firstName2, String lastName2, String initial2) {
        this.title1 = title1;
        this.firstName1 = firstName1;
        this.initial1 = initial1;
        this.lastName1 = lastName1;
        this.title2 = title2;
        this.firstName2 = firstName2;
        this.lastName2 = lastName2;
        this.initial2 = initial2;
    }

    @Override public String toString()
    {
        if(title2==null) {
            return "HomeOwner [title = " + title1 + ",first-name = " + firstName1 + ", last-name = " + lastName1 + ", initial= " + initial1 + "]";
        }
        else{
            return "HomeOwner [title1 = " + title1 + "title2 = "+ title2+ " last-name = " + lastName1 +"]";
        }
    }







}
