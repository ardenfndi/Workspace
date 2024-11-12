public class AlienPack {
    private Alien[] alienArray;

    public AlienPack(int alienCount) {
        alienArray = new Alien[alienCount];
    }

    public void addAlien(Alien alien, int index) {
        alienArray[index] = alien;
    }
    public Alien[] getAliens() {
        return alienArray;
    }
    public int calculateTotalDamage() {
        int totalDamage = 0;
        for (Alien alien : alienArray) {
            totalDamage += alien.getDamage();
        }
        return totalDamage;
    }
}