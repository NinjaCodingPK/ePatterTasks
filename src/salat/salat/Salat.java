package salat.salat;

import salat.ingridient.Ingridient;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wookie on 12/13/16.
 */
public class Salat {
    Set<Ingridient> ingridients = new HashSet<>();

    public Set<Ingridient> getIngridients() {
        return ingridients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salat salat = (Salat) o;

        return getIngridients().equals(salat.getIngridients());

    }

    @Override
    public int hashCode() {
        return getIngridients().hashCode();
    }

    @Override
    public String toString() {
        return "Salat{" +
                "ingridients=" + ingridients.toString() +
                '}';
    }
}
