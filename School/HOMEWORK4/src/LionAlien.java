public class LionAlien extends Alien {
    public LionAlien(int health, String name){
        super(health, name);
    }
    @Override
    public int getDamage(){
        return 10;
    }
}