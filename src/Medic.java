public class Medic extends Hero{
    private double heelPoints = 50;

    public Medic() {
        super();
        superAbilitytype = "Regen tower";
    }
    public void medicInfo(int health, int damage) {
        System.out.println(" Medic:" + "Health:" + " " + health + " --- " + "Damage: " + damage);
    }
    @Override
    public void applySuperAbility() {
        System.out.println(" Medic apply super ability " + this.superAbilitytype);
    }

    public void increaseExperience(){
        heelPoints *= 1.1;
        int healPoints = (int) heelPoints;
        System.out.println(" heel points increaseExperience + 10%: " + healPoints + "%");
    }
}
