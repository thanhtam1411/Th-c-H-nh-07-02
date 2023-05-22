import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

 public class Slide110 {
    public static void main (String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int number;
        
            System.out.print("Nhap kich thuoc cua mang:");
            int n = sc.nextInt();

            for(int i= 0; i <n ; i ++){
            System.out.printf("Nhap vao so phan tu a[%d]:" ,i);
            number = sc.nextInt();
            arrList.add(number);
    }
    System.out.print("Phan tu trong mang la: ");
    for (Integer integer : arrList) {
        System.out.print(integer + "\t");
    }

    int max = arrList.get(0);
    for (int i =0 ; i <arrList.size();i++){
        if ( arrList.get(i).compareTo(max)>0){
            max = arrList.get(i);
        }
    }
        System.out.println("Phan tu lon nhat trong mang la:" + max);

        System.out.println("");
        arrList.sort((o1 ,o2) -> o2 -o1);
        System.out.print("Sap xep giam dan:");
        for (Integer integer : arrList){
            System.out.print(integer +"\t");
        }

        System.out.print("\nNHap so nguyen can xoa:");
        int tim = sc.nextInt();
        for(int i = arrList.size(); i>=0; i--) {
            if (arrList.get(i) ==tim) {
                arrList.remove(i);
            } else{
                System.out.println("So vua nhap khong co trong danh sach");
            }
            sc.close();
        }
    }
}





        
            

    



       



    
