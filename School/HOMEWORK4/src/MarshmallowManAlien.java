public class MarshmallowManAlien extends Alien {
    public MarshmallowManAlien(int health, String name){
        super(health, name);
    }
    @Override       
    public int getDamage(){
        return 2;
    }
}