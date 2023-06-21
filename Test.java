package rpg;

public class Test {
    public static void main(String[] args) {
        //Elf e1 = new Elf("Elrond",80,20);
        //Elf e2 = new Elf("Legolas",70,24);
        Elf e1 = Elf.getInstance();
        Dvarf d1 = Dvarf.getInstance();
        System.out.println(e1);
        System.out.println(d1);

        e1.attack(d1);
        System.out.println(d1);
    }
}
