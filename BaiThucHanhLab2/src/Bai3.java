import java.util.Scanner;

public class Bai3 {
    
    public static void main(String[] args) {
    int age, year;
    String name, ageGroup;
     Scanner sc = new Scanner(System.in);

     System.out.println("Nhap vao ten: ");
     name = sc.nextLine();
     System.out.println("Nhap vao nam sinh: ");
     year = sc.nextInt();
     
     age = 2023 - year;
     if (age < 16) {
        ageGroup = "tuoi vi thanh nien ";
       } else if ( age >= 16|| age >18) {
            ageGroup ="tuoi truong thanh ";
            } else {
                ageGroup = "gia roi!";
            }

            System.out.println("Ban" + name +"Thuoc nhom" + ageGroup);
            }
        
     }       
           
