import java.util.ArrayList;
import java.util.Scanner;

public class arrrangeArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<> ();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("nhap vaokich thuoc mang: ");
        int n = sc.nextInt();

        for (int i = 0; i < n;i ++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);  
               number = sc.nextInt();
        arr.add(number);
    }
    System.out.print("phan tu trong mang la: ");
    for (Integer integer : arr) {
        System.out.print(integer + "\t");
    }

    System.out.println("");
    arr.sort((o1, o2) -> o1 - o2);
    System.out.print("sap xep theo tang dan: ");
    for (Integer integer : arr) {
        System.out.print(integer + "\t");
    }

    System.out.println("");
    arr.sort((o1, o2) -> o2 - o1);
    System.out.print("Sap xep theo giam dan:");
    for (Integer integer : arr) {
        System.out.print(integer + "\t");
    }

    System.out.println("");
    System.out.print("phan tu lon nhat cua mang la:" + arr.get(0));
}
}
