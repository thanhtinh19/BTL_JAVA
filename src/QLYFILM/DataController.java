package QLYFILM;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;
    public void OpenFileToWrite(String fileName){
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void CloseFileAfterWrite(){
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void OpenFileToRead(String fileName){
        try {
            File file = new File(fileName);
            if (!file.exists()){
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void CloseFileAfterRead(){
        try {
            scanner.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void WriteCustomerToFile(String fileName, Customer ctm){
        OpenFileToWrite(fileName);
        printWriter.println(ctm.getIdAccount() + "|" + ctm.getNameAccount() + "|" +ctm.getName() + "|"+
                ctm.getAge() + "|" + ctm.getAddress());
        CloseFileAfterWrite();
    }
    public ArrayList<Customer> ReadCustomerFromFile(String fileName){
        OpenFileToRead(fileName);
        ArrayList<Customer> customers = new ArrayList<>();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            Customer customer = createCustomerFromData(data);
            customers.add(customer);
        }
        CloseFileAfterRead();
        return customers;
    }

    private Customer createCustomerFromData(String data) {
        String[] datas = data.split("\\|");
        Customer customer = new Customer(datas[0], Integer.parseInt(datas[1]), datas[2], datas[3], datas[4]);
        return customer;
    }

    public void WriteFilmToFile(String fileName, Film film){
        OpenFileToWrite(fileName);
        printWriter.println(film.getIdFilm() + "|" + film.getFilmName() + "|" + film.getCategory() + "|" +
                film.getNationalProduct() + "|" + film.getShowDate() + "|" + film.getTime() + "|" +
                film.getLanguage() + "|" + film.getPrice() + "|" + film.getFilmStatus());
        CloseFileAfterWrite();
    }
    public ArrayList<Film> ReadFilmsFromFile(String fileName){
        OpenFileToRead(fileName);
        ArrayList<Film> films = new ArrayList<>();
        while (scanner.hasNext()){
            String data = scanner.nextLine();
            Film film = createFilmFromData(data);
            films.add(film);
        }
        CloseFileAfterRead();
        return films;
    }

    private Film createFilmFromData(String data) {
        String[] datas = data.split("\\|");
        Film film = new Film(Integer.parseInt(datas[0]), datas[1], datas[2], datas[3], datas[4], datas[5],
                Integer.parseInt(datas[6]), datas[7], Long.parseLong(datas[8]), datas[9]);
        return film;
    }
}
