package User;

public abstract class User {
    String number;
    String password;


    public User(String number, String password) {
        this.number = number;
        this.password = password;
    }

    abstract String getType();

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPassword(){
        return password;
    }
	
    public void setPassword(String password){
        this.password = password;
    }

}