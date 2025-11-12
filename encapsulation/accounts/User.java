package accounts;


public class User{
    public String name;
    private String pass;

    public User( String name , String pass){
        this.name = name;
        this. pass = pass;

    }

    public String getPass(){
        return this.pass;

    }

    public void setPass(String newpass){
        this.pass = newpass;
    }


}