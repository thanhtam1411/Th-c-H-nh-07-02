package Hinhhoc;

import java.util.Scanner;

public class Hinhtru extends Hinhhoc {
   private float chieucao;
   private float nhapbankinh;
   public float getnhapbankinh() {
      return nhapbankinh;
   }

   public void setnhapbankinh(float nhapbankinh) {
      this.nhapbankinh = nhapbankinh;
   }

   public float getchieucao() {
      return chieucao;
   }

   public void setchieucao(float chieucao) {
      this.chieucao = chieucao;
   }

   public Hinhtru() {
      super.setTen("Hinh Tru");
   }

   public void Nhapchieucao(Scanner sc) {
      System.out.print("Nhap chieu cao: ");
      setchieucao(sc.nextFloat());
   }


   public void Tinhthetich() {
      float thetich = super.getPi() * (float) Math.pow(super.getbankinh(), 2) * chieucao;
      super.setthetich(thetich);
   }
}









    


    

