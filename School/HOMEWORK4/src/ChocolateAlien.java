public class ChocolateAlien extends Alien {
    public ChocolateAlien(int health, String name){
        super(health, name);
    }
    @Override
    public int getDamage(){
        return 1;
    }
}