import java.util.LinkedList;
import java.util.Scanner;


public class SLide4142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> lklist = new LinkedList<String>();
        lklist.add("Thang 1");
        lklist.add("Thang 2");
        lklist.add("Thang 3");
        lklist.add("Thang 4");
        lklist.add("Thang 5");
        lklist.add("Thang 6");
        lklist.add("Thang 7");
        lklist.add("Thang 8");
        lklist.add("Thang 9");
        lklist.add("Thang 10");
        lklist.add("Thang 11");
        lklist.add("Thang 12");

        System.out.print("nhap vao chi so phan tu can lay: ");
        int index = sc.nextInt();
        if ((index < 0) || (index > (lklist.size() - 1))) {
            System.out.pritnln("Chi so can lay phai lon hon 0 va nho hon" + (lklist.size() -1));
            } else {
                String node = lklist.get(index);
                System.out.println("phan tu co chi so = " + index + " trong linhkedlist la" + node);
            }

            String firstNode = lklist.getFirst();

            String lastNode = lklist.getLast();

            System.out.println("\nphan tu dau tien trong danh sach la " + firstNode + " ; phan tu cuoi cung trong danh sach la" + lastNode);
        }
    }
