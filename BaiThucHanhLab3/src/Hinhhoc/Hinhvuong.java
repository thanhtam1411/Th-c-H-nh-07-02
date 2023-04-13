package Hinhhoc;

import java.util.Scanner;

public class Hinhvuong extends Hinhchunhat{

            public void Hinhhvuong() {
                ten = "Hinh vuong";
            }

            public void nhapcanh(){
                System.out.println("Canh = ");
                Scanner sc = new Scanner (System.in);
                dai = rong = sc.nextFloat();
                sc.close();
            }
        }

