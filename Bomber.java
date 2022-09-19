public class Bomber extends AircraftEntity {
    private int bombCarryingCapacity;
    private double maxFlyingAltitude;
    private boolean isJet;
    private String bomberType;

    public Bomber(String entityName, int ammo, double range, boolean isJet) {
        super(entityName, ammo, range);
        if (isJet) {
            bombCarryingCapacity = 100;
            maxFlyingAltitude = 45.5;
            bomberType = "Jet Type";
        }
        else {
            bombCarryingCapacity = 75;
            maxFlyingAltitude = 34.0;
            bomberType = "Propeller Type";
        }

    }

    public void computeAttackPower(){
        if (maxFlyingAltitude >= 40.0) {
            attackPower = (int)((maxFlyingAltitude + ammo) * (bombCarryingCapacity / 100));
        }
        else {
            attackPower = (int)((ammo + range) * (bombCarryingCapacity / 100));
        }
    }


    public String toString(){
        return "Bomber:\t" + bomberType + "\n" + super.toString() + "Bomb Carrying Capacity:\t" + bombCarryingCapacity + "\n";
    }

}
