abstract class AircraftEntity {
    protected String entityName;
    protected int ammo;
    protected double range;
    protected int attackPower;

    public AircraftEntity(String entityName, int ammo, double range){
        entityName = this.entityName;
        ammo = this.ammo;
        range = this.range;
        attackPower = 0;
    }
    public int getAttackPower(){
        return attackPower;
    }
    public abstract void computeAttackPower();
    
    public String toString(){
        return "Aircraft name:\t" + entityName + "\nCurrent Ammo:\t" + ammo + "\nRange:\t" + range + "\nCurrent Attack Power:\t" + attackPower + "\n";
    }
}
