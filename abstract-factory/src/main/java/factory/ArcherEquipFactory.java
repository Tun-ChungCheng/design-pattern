package factory;

import clothes.Leather;
import weapon.Bow;
import clothes.Clothes;
import weapon.Weapon;

public class ArcherEquipFactory implements EquipFactory{
    public Weapon productWeapon() {
        Bow product = new Bow();
        product.setAtk(10);
        product.setRange(10);
        return product;
    }

    public Clothes productClothes() {
        Leather product = new Leather();
        product.setDef(5);
        return product;
    }
}
