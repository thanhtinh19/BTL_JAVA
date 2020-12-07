package QLYFILM;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
        public static void Staff(List<Film> list){
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Input number of film: ");
            n=sc.nextInt();

            for(int i=0;i<n;i++){
                int id;
                boolean checkId = false;
                do{
                    System.out.print("Nhap id: ");
                    id = sc.nextInt();
                    checkId = CheckId(list, id);
                    if(checkId){
                        System.out.println("id da ton tai");
                    } else {
                        System.out.println("ID chua co");
                    }
                }while(checkId);
                Film phim = new Film();
                phim.InputFilm();
                list.add(phim);
            }
            try {
                FileWriter filewriter = new FileWriter("dataFilm.txt",true);
                BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
                bufferedWriter.write(" " + list);
                bufferedWriter.close();
                filewriter.close();
            } catch (Exception e){
                e.getMessage();
            }
        }
    public static boolean CheckId(List<Film> list, int id){
        try {
            File file = new File("dataFilm.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String content = sc.nextLine();
            }
        } catch (Exception e){
            e.getMessage();
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getIdFilm() == id){
                return true;
            }
        }
        return false;
    }
        public static void client(List<Film>list){
            try {
                File file = new File("dataFilm.txt");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()){
                    String content = sc.nextLine();
                    System.out.println(content);
                }
            } catch (Exception e){
                e.getMessage();
            }
        }
        public static void menuStaff(List<Film>list){
            Scanner sc = new Scanner(System.in);
            System.out.println("You Want: ");
            System.out.println("1.Show Film");
            System.out.println("2.Add Film");
            System.out.println("3.Delete Film");
            System.out.println("4.Exit");
            int n1 = sc.nextInt();
            switch(n1){
                case 1:{
                    client(list);
                    menuStaff(list);
                    break;
                }
                case 2:{
                    Staff(list);
                    menuStaff(list);
                    break;
                }
                case 3:{
                    System.out.println("delete");
                    menuStaff(list);
                    break;
                }
                case 4:{
                    menuMain(list);
                }
            }
        }
        public static void menuMain(List<Film>list){
            Scanner sc = new Scanner(System.in);
            System.out.println("**MENU**********");
            System.out.println("1.Manage Film");
            System.out.println("2.Buy Ticket");
            System.out.println("You want: ");
            int n=sc.nextInt();
            switch(n){
                case 1:{
                    menuStaff(list);
                    menuMain(list);
                    break;
                }
                case 2:{
                    client(list);
                    menuMain(list);
                    break;
                }
                default:{
                    System.out.println("Error Option !");
                    System.exit(0);
                }
            }
        }
        public static void main(String[] args) {
            List<Film> list = new ArrayList<>();
            menuMain(list);
        }
}
