package Hinhhoc;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc{
    public float dai ;
    public float rong;

    public float getrong() {
        return rong;
    }

    public void setrong(float rong) {
        this.rong = rong;
    }

    public float getdai() {
        return dai;
    }

    public void setdai(float dai){
        this.dai = dai;
    }

    public Hinhchunhat() {
        super.setTen("Hinh Chu Nhat");
    }

    public void Nhapchieudai(Scanner sc) {
        System.out.print(" Nhap chieu dai: ");
        setdai(sc.nextFloat());
    }

    public void Nhapchieurong(Scanner sc) {
        System.out.print("Nhap chieu rong: ");
        setrong(sc.nextFloat());
    }

    public void Tinhchuvi() {
        float chuvi = 2 * (dai + rong);
        setchuvi(chuvi);
    }

    public void Tinhdientich() {
        float dientich = dai * rong;
        setdientich(dientich);
    }
}

        



