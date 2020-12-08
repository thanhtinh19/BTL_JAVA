package QLYFILM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static DataCustomer dataCustomer = new DataCustomer();
    static DataFilm dataFilm = new DataFilm();
    static String filmFileName = "FILM.DAT";
    static String ctmFileName = "CUSTOMER.DAT";
    public static void menuMain(List<Film> list){
        do{
            System.out.println("**MENU**********");
            System.out.println("1.Manage Film");
            System.out.println("2.Buy Ticket");
            System.out.println("You want: ");
            int n=sc.nextInt();
            switch(n){
                case 1:{
                    break;
                }
                case 2:{
                    client(list);
                    break;
                }
                default:{
                    System.out.println("Error Option !");
                    System.exit(0);
                }
            }
        } while(true);
    }
    public static void client(List<Film> list){
        List<Customer> list1 = new ArrayList<>();
        do{
            System.out.println("You want: ");
            System.out.println("1.Search Film");
            System.out.println("2.Choice Film");
            System.out.println("3.Show Film");
            System.out.println("4.Exit");
            int n2 = sc.nextInt();
            switch(n2){
                case 2:{
                    break;
                }
                case 1:{

                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    return;
                }
                default:{
                    System.out.println("Error Option !");
                    System.exit(0);
                }
            }
        } while(true);
    }
    
    public static void Bill(Customer ctm, Film film){
        double sum = 0;
        for(int i = 0; i < ctm.getIdAccount().length(); i++){
            if(ctm.getIdAccount().charAt(0) == 'V' || ctm.getIdAccount().charAt(0) == 'v'){
                sum = film.getPrice() - film.getPrice() * 0.1;
            }
            else sum = film.getPrice();
        }
        System.out.println("Id tài khoản: " + ctm.getIdAccount());
        System.out.println("Id phim: " +film.getIdFilm());
        System.out.println("Thành tiền: " + sum);
    }

    public static void main(String[] args){
        List<Film> list = new ArrayList<>();
        menuMain(list);
    }

}
