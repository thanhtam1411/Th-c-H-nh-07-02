import java.util.Scanner;

public class Nhanvien {
    String mnv;
    String ten;
    int namsinh, tuoi;
    float hssl;
    float luong;
    final float luongcoban = 1490000f;

    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten nhan vien: ");
        ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap vao nam sinh: ");
        namsinh = sc.nextInt();
        System.out.println("Nhap vao ma nhan vien: ");
        mnv = sc.nextLine();

        sc.close();
 }
        public void Tinhluong() {
            luong = hssl * luongcoban;
        }

                public void Inthongtin() {
                    System.out.printf("\nThong tin cua nhan vien la : \nMa nhan vien: %d\nHo ten nhan vien: %s\nTuoi : %d\nHe so luong: %f\nLuong: %f", mnv, ten, hssl, tuoi, luong);

                }
            }

            





