package ex_switch_case;

import java.util.Scanner;

public class Ex05Menurestaurant {

    static void main() {

        int idli_quantity=20;
        int dosa_quantity=20;
        int poori_quantity=20;
        int number;
        Scanner scanner=new Scanner(System.in);
        do{

            System.out.println("Please select the options from the Menu:");
            System.out.println("1.Idli " +(idli_quantity>0 ? "(Available:" +idli_quantity+")":"Out of Stock"));
            System.out.println("2.Dosa " +(dosa_quantity>0 ? "(Available:" +dosa_quantity+")":"Out of Stock"));
            System.out.println("3.Poori " +(poori_quantity>0? "(Available:" +poori_quantity+")":"Out of Stock"));
            System.out.println("4.Exit");
            number=scanner.nextInt();

            switch (number)
            {
                case 1 :
                    System.out.println("Please enter the no.of quantity:");
                    int no_of_idli=scanner.nextInt();

                    if(no_of_idli==0)
                    {
                        System.out.println("Sorry,Idli is out of stock");
                    }
                    else if(no_of_idli<0)
                    {
                        System.out.println("Invalid quantity");
                    }
                    else if(no_of_idli>idli_quantity)
                    {
                        System.out.println("Only" +idli_quantity + "Idli available");

                    }
                    else {
                        System.out.printf("%d idlis is served with sambar and chutney",no_of_idli);
                        idli_quantity-=no_of_idli;
                    }
                    break;

                case 2 :

                    System.out.println("Please enter the no.of quantity:");
                    int no_of_dosa=scanner.nextInt();

                    if(no_of_dosa==0)
                {
                    System.out.println("Sorry,Dosa is out of stock");
                }
                    else if(no_of_dosa<0)
                    {
                        System.out.println("Invalid quantity");
                    }
                    else if(no_of_dosa>dosa_quantity)
                    {
                        System.out.println("Only"+dosa_quantity+"dosa available");
                        //System.out.println("Please enter a lesser amount:");
                    }
                    else {
                        System.out.printf("%d dosa's is served with sambar and chutney",no_of_dosa);
                        dosa_quantity-=no_of_dosa;
                    }
                    break;

                case 3 :
                    System.out.println("Please enter the no.of quantity:");
                    int no_of_poori=scanner.nextInt();

                    if(no_of_poori==0)
                    {
                        System.out.println("Sorry,Poori is out of stock");
                    }
                    else if(no_of_poori<0)
                    {
                        System.out.println("Invalid quantity");
                    }
                    else if(no_of_poori>poori_quantity)
                    {
                        System.out.println("Only"+poori_quantity+"poori available");
                    }
                    else {
                        System.out.printf("%d poori's is served with potato masala and chutney",no_of_poori);
                        poori_quantity-=no_of_poori;
                    }
                    break;

                case 4:
                    System.out.println("Thank you for enjoying our food");
                    System.out.println("Welcome again!");
                    break;
                default :
                    System.out.println("Invalid choice.");
                    break;
                }
        }while (number!=4);
        scanner.close();
        System.out.println("Restaurant closed");
    }
}
