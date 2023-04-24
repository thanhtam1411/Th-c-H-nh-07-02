import java.util.Scanner;

import Hinhhoc.Hinhchunhat;
import Hinhhoc.Hinhtru;
import Hinhhoc.Hinhvuong;
import Hinhhoc.Hinhtron;


public class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hinhtron ht = new Hinhtron();
        ht.Xuatten();
        ht.Nhapbankinh(sc);
        ht.Tinhchuvi();
        ht.Tinhdientich();
        ht.Inchuvi();
        ht.Indientich();

        Hinhtru hTru = new Hinhtru();
        hTru.Xuatten();
        hTru.Nhapchieucao(sc);
        hTru.Tinhthetich();
        hTru.Inthetich();
        hTru.bankinh();

        Hinhchunhat hcn = new Hinhchunhat();
        hcn.Xuatten();
        hcn.Nhapchieudai(sc);
        hcn.Nhapchieurong(sc);
        hcn.Tinhchuvi();
        hcn.Tinhdientich();
        hcn.Inchuvi();
        hcn.Indientich();

        Hinhvuong hv = new Hinhvuong();
        hv.Xuatten();
        hv.Nhapcanh(sc);
        hv.Tinhchuvi();
        hv.Tinhdientich();
        hv.Inchuvi();
        hv.Indientich();
        
    }
}

        

  




