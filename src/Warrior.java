public class Warrior extends Hero {


    public Warrior() {
        super();
        this.superAbilitytype = "critical damage x2";
    }

    @Override
    public void applySuperAbility() {
        System.out.println(" Warrior apply super " + this.superAbilitytype);
    }
}
