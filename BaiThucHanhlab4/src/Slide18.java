import java.util.ArrayList;
import java.util.Iterator;
public class Slide18 {

    public static void main(String[] args) {
        ArrayList<Float> arrfl = new ArrayList<>();
        arrfl.add(2.1f);
        arrfl.add(2.5f);
        arrfl.add(3.0f);
        arrfl.add(3.5f);
        arrfl.add(4.0f);

        Iterator<Float> it = arrfl.iterator();
        
        System.out.println("Cac phan tu co trong arrfl la: ");
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
    }
}


