package plane.aircraft;

import plane.enums.PlaneState;
import plane.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;

/**
 * The aircraft may have few states.
 * 1) Plane is on the ground - it can't shoot.
 * 2) Plane is on air but it has no ammo or it has no weapon - it can't shoot.
 * 3) Plane is on air and it has ammo and weapon - it can shoot (only with weapon that has ammo).
 *
 * Created by wookie on 12/13/16.
 */
public class Plane {
    private PlaneState planeState = PlaneState.GROUND;
    private List<Weapon> weapons = new ArrayList<>();

    public void shoot() {
        if(planeState.equals(PlaneState.AIR))
            for(Weapon weapon : weapons)
                weapon.shoot();
    }

    public Plane addWeapon(Weapon weapon) {
        if(planeState.equals(PlaneState.GROUND))
            weapons.add(weapon);

        return this;
    }

    public void removeWeapon(int weaponId) {
        if(planeState.equals(PlaneState.GROUND))
            weapons.remove(weaponId);
    }

    public void addAmmo(int weaponId, int count) {
        if(planeState.equals(PlaneState.GROUND))
            weapons.get(weaponId).addAmmo(count);
    }

    public void makeFly() {
        planeState = PlaneState.AIR;
    }

    public void makeGround() {
        planeState = PlaneState.GROUND;
    }
}
