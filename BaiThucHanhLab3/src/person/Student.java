package person;
import java.util.Scanner;

public class Student {
    String ten;
    int namsinh , tuoi;
    String masinhvien;

    public void NhapthongtinST(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten student: ");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap vao namsinh: ");
        namsinh = sc.nextInt();
        System.out.println("Nhap vao ma sinh vien: ");
        masinhvien = sc.next();
        
        sc.close();
    }
    
    public void Tinhtuoi(){
        tuoi = 2023 - namsinh;
        
    }
    public void Inthongtin(){
        System.out.printf("\nStudent vua nhap co thong tin la:\nTen: %s\nNamsinh:  %d\nTuoi: %d\nMasinhvien: %s", ten, namsinh,  tuoi, masinhvien);
        }
    }



    

   


