public class Magic extends Hero{
    public Magic() {
        super();
        this.superAbilitytype = "Freeze time";
    }
    @Override
    public void applySuperAbility() {
        System.out.println(" Withard apply super ability " + this.superAbilitytype);
    }
}
