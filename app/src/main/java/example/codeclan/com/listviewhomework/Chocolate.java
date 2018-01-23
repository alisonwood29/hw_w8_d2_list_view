package example.codeclan.com.listviewhomework;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by alisonwood29 on 23/01/2018.
 */

public class Chocolate {

    private ArrayList<String> chocolate;

    public Chocolate(){
        chocolate = new ArrayList<>();
        chocolate.add("Lindt Dark Chocolate Sea Salt");
        chocolate.add("Malteasers");
        chocolate.add("Minstrels");
        chocolate.add("Creme Egg");
        chocolate.add("Caramel Nibbles");
    }

    public ArrayList<String> getList() {
        return new ArrayList<String>(chocolate);
    }
}
