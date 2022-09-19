public class CombatHelicopter extends AircraftEntity{
    private double minFlyingAltitude;
    private int stealthIndex;

    public CombatHelicopter(String entityName, int ammo, double range, double minFlyingAltitude) {
        super(entityName, ammo, range);
        minFlyingAltitude = this.minFlyingAltitude;
        if (minFlyingAltitude < 5) {
            stealthIndex = 10;
        }
        else { 
            stealthIndex = 7;
        }
    }

    public void computeAttackPower(){
        attackPower = (int)((minFlyingAltitude + ammo + range) * (stealthIndex));
    }

    public String toString() {
        return "Combat Helicopter\n" + super.toString() + "Stealth Index:\t" + stealthIndex + "\n";
    }
}
