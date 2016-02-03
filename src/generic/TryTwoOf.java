package generic;

import java.time.LocalDate;

public class TryTwoOf {
    public static void main(String [] args) {
        Pair<String> t1 = new Pair<>("One", "Two");
        System.out.println("> " + t1);
        String s = t1.getLeft();
        
        Pair<LocalDate> t2 = new Pair<>(LocalDate.now(), LocalDate.of(2016, 2, 14));
        System.out.println("> " + t2);
        LocalDate l = t2.getLeft();
    
//        TwoOf<LocalDate> t3 = new TwoOf<>("One", LocalDate.now());
//        System.out.println("> " + t3);

    }
}
