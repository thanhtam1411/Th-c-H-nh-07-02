package Hinhhoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public float dai ;
    public float rong;

    //Constructor
    public void HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }
    
    public void nhapchieudai() {
        System.out.println("Chiểu dài = ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        sc.close();
    }

    public void nhapchieurong() {
        System.out.println("Chiều rộng = ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
        sc.close();
    }

    public void tinhchuvi() {
        chuvi = 2 * (dai + rong);
    }

    public void tinhdientich() {
        dientich = dai * rong;
    }
        }
        



