public abstract class Hero implements HavingSuperAbility{
    int health;
    int damage;
    String superAbilitytype;
    public void Hero(int health, int damage, String superAbilitytype){
        this.superAbilitytype = superAbilitytype;
    }

    @Override
    public abstract void applySuperAbility();
}
