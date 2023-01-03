public class Wilder {

    // attributes
    private String firstname;
    private boolean aware;

    // constructors
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

     // getters
     public String getFirstname() {
        return this.firstname;
    }
    
    public boolean getAware() {
        return this.aware;
    }

    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(Boolean aware) {
        this.aware = aware;
    }


    public String whoAmI() {
        if(this.getAware()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }  
    } 
}
