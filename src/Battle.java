public class Battle {
    public void start(){
        Archer archer = new Archer("Робин Гуд", "лучник");
        Infantry infantry = new Infantry("Александр", "пехотинец");

        archer.run();
        infantry.run();

        while(archer.isAlive() && infantry.isAlive()){
            archer.shootBow();
            infantry.defend(archer);

            if (infantry.isAlive()) {
                infantry.hitSword();
                archer.defend(infantry);
            }
        }
    }
}
