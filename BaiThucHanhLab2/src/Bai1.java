import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m, n;
        System.out.println("Nhap vao so thu m: ");
        m = sc.nextFloat();
        System.out.println("Nhap vao so thu m: ");
        n = sc.nextFloat();

        float a = m + n;
        System.out.printf("Tong cua 2 so la:%f.2f + %f.2f = %f.2f" , m, n, m+n);
        float a = m - n;
        System.out.printf("Hieu cua 2 so la:%f.2f - %f.2f = %f.2f" , m, n, m-n);
        float a = m * n;
        System.out.printf("Tich cua 2 so la:%f.2f * %f.2f = %f.2f" , m, n, m*n);
        float a = m / n;
        System.out.printf("Thuong cua 2 so la:%f.2f / %f.2f = %f.2f" , m, n, m/n);

        if( m < n);
        System.out.prinln("M ")

