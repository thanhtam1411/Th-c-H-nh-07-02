import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;


public class Slide112 {
    public String name;
    public double diem;
    public void Nhap(List<Slide112> ls,Scanner sc) {
        while(true) {
            Slide112 sv = new Slide112();
            System.out.print("Nhap ten sinh vien :");
            sv.name = sc.nextLine();
            if (sv.name.equals("")){
                break;
            }
            System.out.print("nhap diem sinh vien:");
            sv.diem = Double.parseDouble(sc.nextLine());
            ls.add(sv);
        }
    }
    public void xuat(){
        System.out.println("" + this.name + "\t" + this.diem);
    }

    public void Kiemtra(List<Slide112> ls,Scanner sc){
        int count =0;
        System.out.println("=================");
        System.out.println("Sinh vien co diem <=5 la :");
        for (Slide112 sinhvien : ls ){
            if (sinhvien.diem <= 5){
                sinhvien.xuat();
                count++;
            }
        }
        System.out.println("Co tong cong" + count + "sinh vien truot");
    }

    public void Diemcao(List<Slide112> ls, Scanner sc){
        ls.sort((o1, o2) -> (int) (o2.diem - o1.diem));
        double max =ls.get(0).diem;
        System.out.println("===========");
        System.out.println("Sinh vien co diem cao nhat la:");
        for (Slide112 sinhvien : ls ){
            if (sinhvien.diem == max){
                sinhvien.xuat();
            }
        }

    }


    public void Timkiem(List<Slide112> ls ,Scanner sc ){
        System.out.println("=========");
        System.out.println("Nhap ten sinh vien can tim la :");
        String tim = sc.nextLine();
        Slide112 svTim = null;
        for(Slide112 sinhvien : ls){
            if (sinhvien.name.contains(tim)){
                svTim = sinhvien;
                break;
            }
        }
        if (svTim != null) {
            System.out.println("Sinhvien can tim la:");
            svTim.xuat();
        }else{
            System.out.println("Khong tim thay sinh vien can tim!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Slide112> ls = new LinkedList<>();
        Slide112 sv = new Slide112();
        sv.Nhap(ls ,sc);
        sv.Kiemtra(ls , sc);
        sv.Diemcao(ls, sc);
        sv.Timkiem(ls , sc);
    }


}

