import java.util.Random;
public class Archer extends Warrior implements BowInterface{
    final Random random = new Random();
    private boolean needRun = true;

    @Override
    public void run() {
        System.out.println(this + " бежит и набегу достает стрелу из колчана");
    }

    @Override
    public void shootBow() {
        System.out.println(this + " выстрелил из лука");
    }

    @Override
    public void duck() {
        System.out.println(this + " увернулся от удара");
    }

    Archer(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void defend(Warrior warrior) {
        if (random.nextInt(2) == 0) {
            if (warrior instanceof Infantry) {
                hurt(50);
            }
        }
        else
            duck();
    }
}
