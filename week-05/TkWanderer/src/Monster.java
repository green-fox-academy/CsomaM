public class Monster extends Character{

    public Monster () {

        super("assets/skeleton.png", 0,0);
        super.posGEN();
        super.lvl = 1;
        super.hp = 2 * (r.nextInt(5) + 1) + r.nextInt(5) + 1;
        super.currentHP = hp;
        super.dp = r.nextInt(6) + (r.nextInt(5) + 1) / 2;
        super.sp = (r.nextInt(5) + 1);
        super.name = "Skeleton";
    }
}
