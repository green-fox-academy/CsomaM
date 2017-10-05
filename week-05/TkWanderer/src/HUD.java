public class HUD {

    protected String name;
    protected int lvl;
    protected int hp;
    protected int dp;
    protected int sp;
    protected int currentHP;

    public HUD (Hero hero) {
        this.name = hero.getName();
        this.lvl = hero.getLvl();
        this.hp = hero.getHp();
        this.currentHP = hero.getCurrentHp();
        this.dp = hero.getDp();
        this.sp = hero.getSp();
    }

    public String display () {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " (Level: " + lvl + ") " + "HP: " + currentHP + "/" + hp + " | " + "DP: " + dp + " | " + "SP: " + sp);
        return sb.toString();
    }
}
