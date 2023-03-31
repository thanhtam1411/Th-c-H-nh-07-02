import  java.util.Scanner;

public class Hinhtron {
//Nhap cac thuoc tinh 
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
    
//Nhap cac phuong thuc
    public void Nhapbankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ban kinh: ");
            r = sc.nextFloat(); 
            sc.close();
}
    
    public void Tinhchuvi(){
        cv = 2 * r * PI;
    }
    
    public void Tinhdientich(){
        dt = r * r * PI;
    }
    public void Inraketqua(){
        System.out.printf("Chu vi hinh tron ban kinh %f = %f", r, cv);
        System.out.printf("Dien tich hinh tron ban kinh %f = %f", r, dt);
    }
}       





     

 