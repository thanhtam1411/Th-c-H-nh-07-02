package Sets;
import java.util.HashSet;
import java.util.Scanner;

import Person.Student;

public class HashsetDemo {
    HashSet<Student> std = new HashSet<Student>();
    Scanner sc = new Scanner(System.in);
    Person.Student st = new Student();

    do{
        System.out.println("===Quan ly sinh vien===");
        System.out.println("1. Tao n sinh vien");
        System.out.println("2. Sua thong sinh vien");
        System.out.println("3. Xoa mot sinh vien");
        System.out.println("4. In thong tin toan bo sinh vien");
        System.out.println("0. Thoat");
        System.out.print("Moi ban lua chon: ");
        String chon = sc.nextLine();
        switch (chon) {
            case "1":
                System.out.println("=======Nhap thong tin=======");
                System.out.print("Nhap so luong sinh vien: ");
                int n = Integer.parseInt(sc.nextLine());
                st.NhapThongTin(std, n, sc);
                break;
            case "2":
                st.SuaThongTin(std, sc);
                break;
            case "3":
                st.XoaSinhVien(std, sc);
                break;
            case "4":
                st.HienThiThongTin(std);
                break;
            default:
                System.out.println("Khong co chuc nang nay, vui long nhap lai!");
                System.out.println("");
                break;

        }
        if (chon.equals("0")) {
            System.exit(0);
        }
    } while (true);

}
}
