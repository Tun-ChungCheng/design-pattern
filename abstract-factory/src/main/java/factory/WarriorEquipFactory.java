package factory;

import clothes.Armor;
import clothes.Clothes;
import weapon.LongSword;
import weapon.Weapon;

public class WarriorEquipFactory implements EquipFactory{
    public Weapon productWeapon() {
        LongSword product = new LongSword();
        product.setAtk(10);
        product.setRange(1);
        return product;
    }

    public Clothes productClothes() {
        Armor product = new Armor();
        product.setDef(10);
        return product;
    }
}
