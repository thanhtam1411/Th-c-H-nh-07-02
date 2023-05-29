import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        int number;

        System.out.print("Nhap vao kich thuoc cua mang:");
        int n = sc.nextInt();

        for (int i=0; i < n ; i++){
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            number = sc.nextInt();
            arrList.add(number);
        }
        
        System.out.print("phan tu trong mang la: ");
        for (Integer integer : arrList) {
            System.out.print(integer + "\t");
        }



     

     


    
    }
}
