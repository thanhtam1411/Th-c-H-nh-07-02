import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import java.util.Iterator;


public class Slide113 {
    Set <String> traicay = new HashSet<>();

    public void Nhaptraicay(Scanner sc) {
        while (true){
            System.out.print("NHap ten trai cay:");
            String name = sc.nextLine();
            traicay.add(name);
            System.out.print("trai cay hien co:");
            System.out.println("traicay");
            if (name.equalsIgnoreCase("")) {
                break;
            }
        }
    }


    public void Timkiemtraicay(Scanner sc){
        System.out.println("Tim kiem trai cay===");
        System.out.print("Nhap vao trai cay can tim: ");
        String timtraicay = sc.nextLine();
        if (traicay.contains(timtraicay)) {
            System.out.println("trai cay ban can tim da co trong danh sach");
        }else {
            System.out.println("Khong tim thay trai cay trong danh sach ");
        }
        System.out.print("Trai cay hien co:");
        System.out.println(traicay);
    }

    public void Xoatraicay(Scanner sc) {
    System.out.println("=====Xoa trai cay=====");
    System.out.print("Nhap trai cay can xoa :");

    String xoatraicay = sc.nextLine();
    if (traicay.contains(xoatraicay)) {
        traicay.remove(xoatraicay);
        System.out.println("Da xoa thanh cong trai cay");
    } else {
        System.out.println("Khong tim thay trai cay can xoa");
    }
    System.out.print("trai cay hien co");
    System.out.print(traicay);

}

List<String> listHoaQua = new ArrayList<>();

public void fakedata() {
    listHoaQua.add("Qua xoai");
    listHoaQua.add("Qua dao");
    listHoaQua.add("Qua nho");
    listHoaQua.add("Qua bao");
}

public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    Slide113 hoaqua = new Slide113();
    hoaqua.Nhaptraicay(sc);
    hoaqua.Timkiemtraicay(sc);
    hoaqua.Xoatraicay(sc);
    System.out.println("Cac phan tu trong list da them vao hashset va phan tu co san la: ");
    hoaqua.fakedata();
    hoaqua.traicay.addAll(hoaqua.listHoaQua);

    Iterator<String> itr = hoaqua.traicay.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    System.out.println("Cac phan tu cua hashset sau khi xoa phan tu cua list trong hashset la: ");
    hoaqua.traicay.removeAll(hoaqua.listHoaQua);
    for (String fruit : hoaqua.traicay) {
        System.out.println(fruit);
    }
}
}