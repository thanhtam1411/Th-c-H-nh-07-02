import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float m, n;
        System.out.println("Nhap vao so thu m: ");
        m = sc.nextFloat();
        System.out.println("Nhap vao so thu m: ");
        n = sc.nextFloat();
        System.out.printf("Tong cua 2 so la:%f.2f + %f.2f = %f.2f" , m, n, m+n);
         System.out.printf("Hieu cua 2 so la:%f.2f - %f.2f = %f.2f" , m, n, m-n);
    
        System.out.printf("Tich cua 2 so la:%f.2f * %f.2f = %f.2f" , m, n, m*n);
        System.out.printf("Thuong cua 2 so la:%f.2f / %f.2f = %f.2f" , m, n, m/n);
        if (m > n) {
            System.out.printf("\nSo %f.2f lon hon so %f.2f" ,m,n);
            }
            else if( m < n) {
                System.out.printf("\nSo %f.2f nho hon so %f.2f" ,m,n);
                 }
                 else{
                    System.out.printf("\nSo %f.2f bang so %f.2f" ,m,n);
                }
                sc.close();
                
                }
            }    


       

