package rpg;

public class Test {
    public static void main(String[] args) {
        //Elf e1 = new Elf("Elrond",80,20);
        //Elf e2 = new Elf("Legolas",70,24);
        Elf e1 = Elf.getInstance();
        Elf e2 = Elf.getInstance();
        System.out.println(e1);
        System.out.println(e2);
        e1.attack(e2);
        System.out.println(e2);
    }
}
