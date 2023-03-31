public class App {
    public static void main(String[] args) throws Exception {
    Nhanvien nv = new Nhanvien();
        nv.Nhapthongtin();
        nv.Tinhluong();
        nv.Inthongtin();

    Hinhtron ht = new Hinhtron();  
        ht.Nhapbankinh();
        ht.Tinhchuvi();
        ht.Tinhdientich();
        ht.Inraketqua();
 
    Student st = new Student();
         st.NhapthongtinST();
         st.Tinhtuoi();
         st.Inthongtin();
         
     Hinhtrutron htt = new Hinhtrutron();    
         htt.Nhapsolieu();
         htt.Tinhsolieu();
         htt.Inthongtin();
         
 
 
    }
}
        