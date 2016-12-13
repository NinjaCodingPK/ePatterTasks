package salat.salat;

import salat.ingridient.Ingridient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wookie on 12/13/16.
 */
public class SalatBuilder {
    private Salat instance = new Salat();

    public SalatBuilder addIngridient(Ingridient ingridient) {
        instance.getIngridients().add(ingridient);
        return this;
    }

    public Salat build() {
        return instance;
    }
}
