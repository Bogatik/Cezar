
public class Litera {

    private char litera;
    private double chance;

    public Litera(char litera, double chance)
    {
        this.litera = litera;
        this.chance = chance;
    }

    public char getLitera()
    {
        return litera;
    }

    public double getChance()
    {
        return chance;
    }

    @Override // переопределение метода
    public String toString()
    {
        return "[" + litera + ", " + chance + "%]";
    }

}
