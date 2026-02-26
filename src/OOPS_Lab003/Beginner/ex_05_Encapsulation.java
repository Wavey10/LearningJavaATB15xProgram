package OOPS_Lab003.Beginner;

public class ex_05_Encapsulation {

   public static void main(String[] args) {

       loginpage l1 = new loginpage();
       l1.setUsername("Vanas");
       l1.setPassword("Qwert123#");
       System.out.println("Username is: " + l1.getUsername());
       //System.out.println("Password is: "+ l1.getPassword());

    }
}

class loginpage
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
