package e03AircraftCarrier;

public class Aircraft {
    private String type;
    private int ammo;
    private int maxAmmo;
    private int baseDmg;

    public Aircraft (String type, int ammo, int maxAmmo, int baseDmg) {
        this.type = type;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;
    }

    public int fight() {
        int dmg = ammo * baseDmg;
        ammo = 0;
        return dmg;
    }

    public int refill(int ammoToLoad) {
        while ((ammo < maxAmmo) && (ammoToLoad > 0)) {
            ammo++;
            ammoToLoad--;
        }
//        System.out.println(ammo);
        return ammoToLoad;
    }

    public void getType() {
        System.out.println(type);
    }

    public String getStatus() {
        String status = "Type: " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDmg + ", All Damage: " + ammo * baseDmg;
        return  status;
    }

    public boolean isPriority() {
        return type == "F35";
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getMaxAmmo() {
        return maxAmmo;
    }

    public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
    }

    public int getBaseDmg() {
        return baseDmg;
    }

    public void setBaseDmg(int baseDmg) {
        this.baseDmg = baseDmg;
    }
}
