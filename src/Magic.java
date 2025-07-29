public class Magic extends Hero{
    public Magic() {
        super();
        this.superAbilitytype = "Freeze time";
    }
    public void megicInfo(int health, int damage) {
        System.out.println(" Withard:" + "Health:" + " " + health + " --- " + "Damage: " + damage);
    }
    @Override
    public void applySuperAbility() {
        System.out.println(" Withard apply super ability " + this.superAbilitytype);
    }
}
