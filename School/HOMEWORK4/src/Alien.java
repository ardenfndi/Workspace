public abstract class Alien {
    private int health;
    private String name;

    public Alien(int health, String name){
        this.health = health;
        this.name = name;
    }

    public int getHealth(){
        return health;
    }

    public String getName(){
        return name;
    }

    public abstract int getDamage();
}
