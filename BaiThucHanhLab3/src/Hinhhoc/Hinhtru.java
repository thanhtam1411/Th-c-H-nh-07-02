package Hinhhoc;

import java.util.Scanner;

public class Hinhtru extends Hinhtron{
   public float chieucao;
   
   public void  Hỉnhtru() {
    ten = "Hinh tru";
   }
   public void nhapchieucao() {
    nhapbankinh();
    System.out.print("Nhap chieu cao: ");
    Scanner scanner = new Scanner(System.in);
    chieucao = scanner.nextFloat();
    scanner.close();
   }

   public void tinhthetich(){
    tinhdientich();
    thetich = dientich * chieucao;
   }
}




    


    

