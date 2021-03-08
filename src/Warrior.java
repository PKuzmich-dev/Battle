public abstract class Warrior {
    private String name;
    private String specialization;
    private int health = 100;
    // конструктор
    Warrior(String name, String specialization){
        this.name = name;
        this.specialization = specialization;
    }

    public abstract void run();
    public abstract void defend(Warrior warrior); // защищаться

    private void die(){
        System.out.println(this.toString() + " погиб!");
    }

    public void hurt(int damage) {
        health -= damage;
        if(health <= 0 )
            die();
        else
            System.out.println(this + " ранен, осталось " + health + "% здоровья");
    }

    public boolean isAlive(){
        return health > 0;
    }

    @Override
    public String toString() {
        return specialization + " " + name;
    }
}
