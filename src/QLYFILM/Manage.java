package QLYFILM;

import java.util.Scanner;

public class Manage extends Person {
    private String idManage;

    public Manage() {
    }

    public Manage(String name, int age, String address, String idManage) {
        super(name, age, address);
        this.idManage = idManage;
    }

    public String getidManage() {
        return idManage;
    }

    public void setidManage(String idManage) {
        this.idManage = idManage;
    }

    public void InputManage(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        idManage = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Manage{" + super.toString() +
                "idManage='" + idManage + '\'' +
                '}';
    }
}
