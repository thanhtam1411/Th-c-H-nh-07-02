import java.util.Scanner;

public class Hinhtrutron {
    final float PI = 3.14f;
    float r;
    float h;
    float cv;
    float dt;
    float tt;

    public void Nhapsolieu(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap vao ban kinh: ");
    r = sc.nextFloat();
    System.out.println("Nhap vao chieu cao: ");
    h = sc.nextFloat();

    sc.close();
    }
    
    public void Tinhsolieu(){
        cv = 2 * PI * r * h;
        dt = 2 * PI * r * (r + h);
        tt = PI * r * r * h;
    }
    
    public void Inthongtin(){
        System.out.printf("Chu vi hinh tru tron %f = %f", cv);
        System.out.printf("Dien tich hinh tru tron %f = %f", dt);
        System.out.printf("The tich hinh tru tron %f = %f",  tt);
        }
    }






