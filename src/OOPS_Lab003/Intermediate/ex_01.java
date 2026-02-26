package OOPS_Lab003.Intermediate;

public class ex_01 {

    public static void main(String[] args) {

        UserAccount user1 = new UserAccount();
        user1.setUsername("Shree");
        user1.setPassword("Zxcvbnm1234#");
        user1.login();

        UserAccount user2 = new UserAccount();
        user2.setUsername("Shamira");
        user2.setPassword("");
        user2.login();

    }
}

class UserAccount
{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    void login()
    {
        if((this.username.isEmpty() || this.password.isEmpty()))
        {
            System.out.println("Login isn't successful for:"+this.username);
        }
        else
        {
            System.out.println("Login is successful for:"+this.username);
        }
    }
}
