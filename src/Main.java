class Hero {
    String heroName = "Axe"; // имя героя
    String attribute = "Strength"; // атрибут героя
    int health = 670; // показатель здоровья
    int strength = 25; //  показатель силы
    int agility = 20; // показатель ловкости
    int intelligence = 18; // показатель интеллекта
    int moveSpeed = 315; // показатель скорости бега
    double armor = 2.33; // показатель брони
    int damage = 55; // показатель урона
}

public class Main {
    public static void main(String[] args) {
        Hero hero_One; // первый герой
        hero_One = new Hero();

        Hero hero_Two; // второй герой
        hero_Two = new Hero();
        hero_One = hero_Two;

        hero_Two.heroName = "Phantom Assassin";
        hero_Two.attribute = "Agility";
        hero_Two.health = 538;
        hero_Two.strength = 19;
        hero_Two.agility = 23;
        hero_Two.intelligence = 15;
        hero_Two.moveSpeed = 305;
        hero_Two.armor = 4.83;
        hero_Two.damage = 54;

    }
}