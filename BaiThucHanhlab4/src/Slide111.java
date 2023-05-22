import java.util.LinkedList;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Slide111 {
   
    public static void main(String[] args) {
    LinkedList<Integer> arrList = new LinkedList<>();
    Scanner sc =new Scanner(System.in);
    DecimalFormat dcf= new DecimalFormat(" #. ##");
    int number;
    int sum = 0;
    int count = 0;
    double tbc;
    

    System.out.print("Nhap vao so phan tu cua danh sach: ");
    number= sc.nextInt();

    for (int i =0 ; i < number ;i++) {
    System.out.printf("Nhap vao so phan tu thu:" + i + " :");
    number = sc.nextInt();
    arrList.addFirst(number);
    }

    System.out.print("phan tu trong mang la: ");
    for (Integer integer : arrList) {
        System.out.print(integer + "\t");
    }

    for(int i =0 ; i< number; i ++){
        if(arrList.get(i) % 2 ==0) {
            sum += arrList.get(i);
            count++;
        }


tbc = (double)sum / count;
System.out.println("Trung binh cong cac so chan trong danh sach =" + dcf.format(tbc));
}
    }
}
