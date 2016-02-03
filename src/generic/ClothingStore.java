package generic;

import java.awt.Color;

public class ClothingStore {
    public static void main(String [] args) {
        Pair<Sock> socks = new Pair(new Sock(5, Color.RED), new Sock(6, Color.RED));
        
        System.out.println(socks);
        Sock s = socks.getLeft();
        System.out.println(s);
    }
}
