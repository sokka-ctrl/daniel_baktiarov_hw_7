public abstract class Hero implements HavingSuperAbility{
    private int health;
    private int damage;
    String superAbilitytype;
    public void Hero(int health, int damage, String superAbilitytype){
        this.superAbilitytype = superAbilitytype;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public abstract void applySuperAbility();


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
