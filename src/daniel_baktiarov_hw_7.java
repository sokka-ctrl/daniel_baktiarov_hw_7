public class daniel_baktiarov_hw_7 {
    public static void main(String[] args) {
       Hero[] heroes = new Hero[3];
       Warrior warrior = new Warrior();
       Magic magic = new Magic();
       Medic medic = new Medic();
       heroes[0] = warrior;
       heroes[1] = magic;
       heroes[2] = medic;
       warrior.warriorInfo(250, 25);
       magic.megicInfo(180, 20);
       medic.medicInfo(200, 0);
        System.out.println("------------------");
       for (Hero useSuperAbilities : heroes) {
           useSuperAbilities.applySuperAbility();
       }
        medic.increaseExperience();
    }
}
