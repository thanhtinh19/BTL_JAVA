package QLYFILM;

import java.util.Scanner;

public class Film {
    private int idFilm;
    private String filmName;
    private String category;
    private String filmType;
    private String nationalProduct;
    private String showDate;
    private int time;
    private String language;
    private long price;
    private String filmStatus;

    public Film() {
    }

    public Film(int idFilm, String filmName, String category, String filmType, String nationalProduct, String showDate, int time, String language, long price, String filmStatus) {
        this.idFilm = idFilm;
        this.filmName = filmName;
        this.category = category;
        this.filmType = filmType;
        this.nationalProduct = nationalProduct;
        this.showDate = showDate;
        this.time = time;
        this.language = language;
        this.price = price;
        this.filmStatus = filmStatus;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getCategory() {
        return category;
    }

    public String getFilmType() {
        return filmType;
    }

    public String getNationalProduct() {
        return nationalProduct;
    }

    public String getShowDate() {
        return showDate;
    }

    public int getTime() {
        return time;
    }

    public String getLanguage() {
        return language;
    }

    public long getPrice() {
        return price;
    }

    public String getFilmStatus() {
        return filmStatus;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public void setNationalProduct(String nationalProduct) {
        this.nationalProduct = nationalProduct;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setFilmStatus(String filmStatus) {
        this.filmStatus = filmStatus;
    }

    public void InputFilm(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID phim: ");
        idFilm = sc.nextInt();
        System.out.print("Nhập tên phim: ");
        sc.nextLine();
        filmName = sc.nextLine();
        System.out.print("Nhập thể loại: ");
        category = sc.nextLine();
        System.out.print("Nhập loại phim: ");
        filmType = sc.nextLine();
        System.out.print("Nhập quốc gia sản xuất: ");
        nationalProduct = sc.nextLine();
        System.out.print("Nhập ngày chiếu: ");
        showDate = sc.nextLine();
        System.out.print("Nhập thời lượng phim: ");
        time = sc.nextInt();
        System.out.print("Nhập ngôn ngữ: ");
        sc.nextLine();
        language = sc.nextLine();
        System.out.print("Nhập giá tiền: ");
        price = sc.nextLong();
        System.out.print("Nhập tình trạng phim: ");
        sc.nextLine();
        filmStatus = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + idFilm +
                ", filmName='" + filmName + '\'' +
                ", category='" + category + '\'' +
                ", filmType='" + filmType + '\'' +
                ", nationalProduct='" + nationalProduct + '\'' +
                ", showDate='" + showDate + '\'' +
                ", time=" + time +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", filmStatus='" + filmStatus + '\'' +
                '}';
    }
}
