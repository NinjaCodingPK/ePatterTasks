package plane;

import plane.aircraft.Plane;
import plane.weapon.impl.MachineGun;
import plane.weapon.impl.RocketLauncher;

/**
 * Created by wookie on 12/13/16.
 */
public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane();

        plane.addWeapon(new RocketLauncher(10))
                .addWeapon(new MachineGun(500))
                .addWeapon(new MachineGun(500));

        plane.makeFly();

        plane.shoot();
    }
}
