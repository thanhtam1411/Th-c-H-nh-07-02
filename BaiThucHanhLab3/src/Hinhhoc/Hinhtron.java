package Hinhhoc;


import  java.util.Scanner;

public class Hinhtron extends Hinhhoc {
    public float bankinh;
    
    // constuctor
    public Hinhtron() {
        ten = "Hình Tròn" ;
    }

    public void nhapbankinh() {
        System.out.println("Bán kinh = ");
        Scanner sc = new Scanner(System.in);
        bankinh = sc.nextFloat();
        sc.close();
    }
    
    public void tinhchuvi() {
        chuvi = 2 * PI * bankinh;
    }

    public void tinhdientich() {
        dientich = PI * bankinh * bankinh;
    }
}       





     

 