public class Boss extends Character {

    public Boss () {

        super("assets/boss.png", 0, 0);
        super.posGEN();
        super.lvl = 1;
        super.hp = 2 * lvl * (r.nextInt(5) + 1) + r.nextInt(5) + 1;
        super.currentHP = hp;
        super.dp = lvl / 2 * r.nextInt(6) + (r.nextInt(5) + 1) / 2;
        super.sp = lvl * ((r.nextInt(5) + 1) + lvl);
        super.name = "Boss";
    }
}
