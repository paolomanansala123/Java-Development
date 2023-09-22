package fundamentals;

public class Character {
    String name, dialog;
    int hp, mp, lvl;

    Character(String name, String dialog, int hp, int mp, int lvl) {
        this.name = name;
        this.dialog = dialog;
        this.hp = hp;
        this.mp = mp;
        this.lvl = lvl;
    }

    void introduce() {
        System.out.println(dialog + " I am " + name + " with " + "HP: " + hp + ", MP: " + mp + " , LVL:" + lvl);
    }

    void sayDialog() {
        System.out.println(dialog);
    }

    void talkTo(Character character){
        System.out.println("Hello " + character.name + ", I am " + name);

    }



}
