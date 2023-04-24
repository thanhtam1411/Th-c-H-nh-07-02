package Hinhhoc;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat {
    public Hinhvuong(){
        super.setTen("Hinh vuong");
    }

    public void Nhapcanh(Scanner sc ) {
        System.out.print("Nhap canh: ");
        super.setdai(sc.nextFloat());
        super.setrong(sc.nextFloat());
    }
}
