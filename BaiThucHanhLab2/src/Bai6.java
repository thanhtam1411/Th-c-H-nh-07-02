import java.util.Scanner;

public class Bai6 {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n , giaithua = 1 ;
    String daygiaithua = "";
    do {
        System.out.print("Nhap vao mot so nguyen duong: ");
        n = sc.nextInt();
    }while(n < 0);
    for(int i = 1; i <= n; i++){
        giaithua *= 1;  
        daygiaithua +=i + " * ";
    }
    daygiaithua = daygiaithua.substring(0, daygiaithua.length()-2);
    System.out.printf("Giai thua cua so %d la %s = %d", n, daygiaithua,giaithua);
    sc.close();
    }

}    


    



