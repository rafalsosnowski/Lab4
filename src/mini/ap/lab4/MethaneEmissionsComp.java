package mini.ap.lab4;

import java.util.Comparator;

public class MethaneEmissionsComp implements Comparator<Country> {




    @Override
    public int compare(Country o1, Country o2) {
        return Double.compare(o1.CardiovascularDeaths,o2.CardiovascularDeaths);
    }

}
