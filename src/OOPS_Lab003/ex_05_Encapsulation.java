package OOPS_Lab003;

public class ex_05_Encapsulation {

   public static void main(String[] args) {

       Loginpage l1 = new Loginpage();
       l1.setUsername("Vanas");
       l1.setPassword("Qwert123#");
       System.out.println("Username is: " + l1.getUsername());
       //System.out.println("Password is: "+ l1.getPassword());

    }
}

class Loginpage
{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getPassword() {
//        return password;
//    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
    }
}
