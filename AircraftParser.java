public class AircraftParser {
    public static AircraftEntity parseNewAircraft(String lineToParse){
        String[] words = lineToParse.split(",");
        if (words[0].equalsIgnoreCase("Bomber")) {
            String entityName = words[1];
            Integer ammo = Integer.parseInt(words[2]);
            Double range = Double.parseDouble(words[3]);
            Boolean isJet = Boolean.parseBoolean(words[4]);
            return Bomber(entityName, ammo, range, isJet);
        }
        else if (words[0].equalsIgnoreCase("FighterJet")) {
            String entityName = words[1];
            Integer ammo = Integer.parseInt(words[2]);
            Double range = Double.parseDouble(words[3]);
            Double maxSpeed = Double.parseDouble(words[4]);
            return FighterJet(entityName, ammo, range, maxSpeed);
        }
        else {
            String entityName = words[1];
            Integer ammo = Integer.parseInt(words[2]);
            Double range = Double.parseDouble(words[3]);
            Double minFlyingAltitude = Double.parseDouble(words[4]);
            return CombatHelicopter(entityName, ammo, range, minFlyingAltitude);

        }
    }
}
