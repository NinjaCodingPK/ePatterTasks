package salat;

import salat.menu.IngeridientStock;
import salat.menu.Menu;
import salat.menu.MenuBuilder;

/**
 * Created by wookie on 12/13/16.
 */
public class Main {
    public static void main(String[] args) {
        IngeridientStock stock = new IngeridientStock();
        MenuBuilder menuBuilder = new MenuBuilder(stock);

        System.out.println(menuBuilder.buildCaesar());
        System.out.println(menuBuilder.toString());
        System.out.println(menuBuilder.buildCaesar());
        System.out.println(menuBuilder.toString());
    }
}
