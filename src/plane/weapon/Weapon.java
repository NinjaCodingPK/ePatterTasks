package plane.weapon;

/**
 * Created by wookie on 12/13/16.
 */
public abstract class Weapon {
    protected int ammoPerShoot;
    protected int ammo;

    public Weapon(int ammo) {
        this.ammo = ammo;
    }

    /**
     * Method performs shooting with a weapon.
     * @return true if weapon can perform more shoots. False if not.
     */
    public abstract boolean shoot();

    public void addAmmo(int count) {
        this.ammo += count;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }
}
