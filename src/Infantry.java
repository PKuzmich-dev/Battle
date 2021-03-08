import java.util.Random;
public class Infantry extends Warrior implements InfantryInterface {
    final Random random = new Random();
    @Override
    public void blockShield() {
        System.out.println(this + " закрылся щитом");
    }

    @Override
    public void hitSword() {
        System.out.println(this + " ударил мечом");
    }

    @Override
    public void run() {
        System.out.println(this + " бежит и размахивает мечом");
    }

    Infantry(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void defend(Warrior warrior) {
        if (random.nextInt(2) == 0) {
            if (warrior instanceof Archer)
                hurt(40);
        }
        else
            blockShield();
    }
}
