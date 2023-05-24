package factory;

import clothes.Clothes;
import weapon.Weapon;

public interface EquipFactory {
    Weapon productWeapon();
    Clothes productClothes();
}
