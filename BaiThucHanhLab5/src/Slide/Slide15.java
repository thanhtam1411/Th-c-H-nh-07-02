package Slide;

import java.io.IOException;

public class Slide15 {
    void m() throws IOException{
        throw new IOException("loi thiet bi");//chekced exception
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Ngoai le duoc xu ly");
        }
    }

    public static void main(String[] args){
        Slide15 obj= new Slide15();
        obj.p();
        System.out.println("luong binh thuong....");
    }
}










    

