public class Warrior extends Hero {


    public Warrior() {
        super();
        this.superAbilitytype = "critical damage x2";
    }
    public void warriorInfo(int health, int damage) {
        System.out.println(" Warrior:" + "Health:" + " " + health + " --- " + "Damage: " + damage);
    }
    @Override
    public void applySuperAbility() {
        System.out.println(" Warrior apply super " + this.superAbilitytype);
    }
}
