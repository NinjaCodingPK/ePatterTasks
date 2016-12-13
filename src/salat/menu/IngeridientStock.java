package salat.menu;

import salat.ingridient.Ingridient;
import salat.salat.Salat;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wookie on 12/13/16.
 */
public class IngeridientStock {
    Map<Ingridient, Integer> stock = new HashMap<>();
    {
        stock.put(Ingridient.CHEESE, 10);
        stock.put(Ingridient.CUCUMBER, 10);
        stock.put(Ingridient.OLIVES, 10);
        stock.put(Ingridient.ONION, 10);
        stock.put(Ingridient.SALAT, 10);
        stock.put(Ingridient.TOMATO, 10);
    }

    public Salat getSalatFromStock(Salat salat) {
        for(Ingridient ing : salat.getIngridients()) {
            if(stock.get(ing) == 0)
                return null;
        }

        return salatFromStock(salat);
    }

    private Salat salatFromStock(Salat salat) {
        for(Ingridient ing : salat.getIngridients()) {
            stock.replace(ing, stock.get(ing), stock.get(ing) - 1);
        }

        return salat;
    }

    public Map<Ingridient, Integer> getStock() {
        return stock;
    }
}
