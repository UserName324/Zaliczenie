package rpg;

public class Elf extends Hero{
    private static String[] imiona = {"Erro", "Legolas", "Alfsol", "Kaldia"};
    public Elf(String name, int health, int strength) {
        super(name, health, strength);
    }
    public static Elf getInstance(){
        String imie = imiona[rand.nextInt(imiona.length)];
        int zdrowie = rand.nextInt(50,100);
        int sila = rand.nextInt(20,40);
        return new Elf(imie, zdrowie, sila);
    }

    @Override
    public void attack(Hero another) {
        int damage = (int)(this.strength * rand.nextDouble(0.5,1));
        //int damage = (int)(this.strength * (rand.nextDouble()*0.5 +0.5));
        another.health -= damage;
        System.out.println(this.name + " attacks " + another.name +
                " and makes " +damage+ " points of damage.");
    }
}
