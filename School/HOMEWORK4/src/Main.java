public class Main {
    public static void main(String[] args){
        AlienPack pack = new AlienPack(4);
        pack.addAlien(new LionAlien(100, "Lion Animal"), 0);
        pack.addAlien(new SasquatchAlien(100, "Sasquatch Alien"), 1);
        pack.addAlien(new MarshmallowManAlien(100, "Marshmallow Alien"), 2);
        pack.addAlien(new ChocolateAlien(100, "Chocolate Alien"), 3);

        System.out.println("Total damage: " + pack.calculateDamage());
    }
}
