package OOPS_Lab003.Beginner;

public class ex_10_MOverriding {

    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        n1.sendMessage();
        n1 = new SMSNotification();
        n1.sendMessage();


    }
}

class Notification
{
    void sendMessage()
    {
        System.out.println("Messages are sent");
    }

}

class EmailNotification extends  Notification
{
    void sendMessage()
    {
        System.out.println("Email sent");
    }
}

class SMSNotification extends  Notification
{
    void sendMessage()
    {
        System.out.println("Msg sent");
    }
}