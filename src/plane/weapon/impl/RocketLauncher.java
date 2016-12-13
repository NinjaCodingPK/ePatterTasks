package plane.weapon.impl;

import plane.weapon.Weapon;

/**
 * Created by wookie on 12/13/16.
 */
public class RocketLauncher extends Weapon {
    public static final int AMMO_PER_SHOOT = 1;

    public RocketLauncher(int ammo) {
        super(ammo);
        super.ammoPerShoot = AMMO_PER_SHOOT;
    }

    @Override
    public boolean shoot() {
        if(ammo - ammoPerShoot >= 0) {
            System.out.println("Rocket launcher shoots");
            ammo -= ammoPerShoot;

            return true;
        } else {
            return false;
        }
    }

}
