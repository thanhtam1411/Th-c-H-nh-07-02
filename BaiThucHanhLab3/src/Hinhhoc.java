import Hinhhoc.Hinhchunhat;
import Hinhhoc.Hinhtron;
import Hinhhoc.Hinhtru;
import Hinhhoc.Hinhvuong;

public class Hinhhoc {

    public static void main(String[] args) {
        // Thử nghiệm với lớp hình tròn 
        Hinhtron Hinhtron = new Hinhtron();
        Hinhtron.xuatten();
        Hinhtron.nhapbankinh();
        Hinhtron.tinhchuvi();
        Hinhtron.tinhdientich();
        Hinhtron.inchuvi();
        Hinhtron.indientich();

        // Thử nghiệm với lớp hình chữ nhật 
        Hinhchunhat Hinhchunhat = new Hinhchunhat();
        Hinhchunhat.xuatten();
        Hinhchunhat.nhapchieudai();
        Hinhchunhat.nhapchieurong();
        Hinhchunhat.tinhchuvi();
        Hinhchunhat.tinhdientich();
        Hinhchunhat.inchuvi();
        Hinhchunhat.indientich();

        // Thử nghiệm với lớp hình trụ 
        Hinhtru Hinhtru = new Hinhtru();
        Hinhtru.xuatten();
        Hinhtru.nhapchieucao();
        Hinhtru.tinhthetich();
        Hinhtru.inthetich();

        // Thử nghiệm với lớp hình vuông
        Hinhvuong Hinhvuong = new Hinhvuong();
        Hinhvuong.xuatten();
        Hinhvuong.nhapcanh();
        Hinhvuong.tinhdientich();
        Hinhvuong.tinhchuvi();
        Hinhvuong.inchuvi();
        Hinhvuong.indientich();

    }
}




