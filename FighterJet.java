public class FighterJet extends AircraftEntity{
    private double maxSpeed; // max speed that this aircraft can achieve

    public FighterJet(String entityName, int ammo, double range, double maxSpeed) {
        super(entityName, ammo, range);
        this.maxSpeed = maxSpeed;
    }

    public void computeAttackPower(){
        super.attackPower = (int)((ammo + range) * (maxSpeed / 10));
    }

    public String toString() {
        return "Fighter Jet:\nAircraft name:\t" + super.entityName + "\n" + super.toString() + "Maximum Speed:\t" + maxSpeed + "\n";
    }
}
