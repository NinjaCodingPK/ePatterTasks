package salat.menu;

import salat.ingridient.Ingridient;
import salat.salat.Salat;
import salat.salat.SalatBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wookie on 12/13/16.
 */
public class MenuBuilder {
    private IngeridientStock stock;

    public MenuBuilder(IngeridientStock stock) {
        this.stock = stock;
    }

    public Salat buildCaesar() {
        return stock.getSalatFromStock(
                    new SalatBuilder()
                        .addIngridient(Ingridient.CHEESE)
                        .addIngridient(Ingridient.OLIVES)
                        .addIngridient(Ingridient.CUCUMBER)
                        .addIngridient(Ingridient.SALAT)
                        .build()
        );
    }

    public Salat buildSpecial() {
        return stock.getSalatFromStock(
                    new SalatBuilder()
                        .addIngridient(Ingridient.CHEESE)
                        .addIngridient(Ingridient.OLIVES)
                        .addIngridient(Ingridient.CUCUMBER)
                        .addIngridient(Ingridient.SALAT)
                        .addIngridient(Ingridient.ONION)
                        .addIngridient(Ingridient.TOMATO)
                        .build()
        );
    }

    @Override
    public String toString() {
        return "MenuBuilder{" +
                "stock=" + stock.getStock().toString() +
                '}';
    }
}
