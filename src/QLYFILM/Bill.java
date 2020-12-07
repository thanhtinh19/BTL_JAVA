package QLYFILM;

public class Bill {
    Customer kh1 = new Customer();
    Film f1 = new Film();
    double sum = 0;

    public double IntoMoney(){
        for(int i = 0; i < kh1.getIdAccount().length(); i++){
            if(kh1.getIdAccount().charAt(0) == 'V' || kh1.getIdAccount().charAt(0) == 'v'){
                sum = f1.getPrice() - f1.getPrice() * 0.1;
            }
            else sum = f1.getPrice();
        }
        return sum;
    }

    public void OutputBill(){
        System.out.println("Id tài khoản: " + kh1.getIdAccount());
        System.out.println("Id phim: " + f1.getIdFilm());
        System.out.println("Thành tiền: " + sum);
    }
}
