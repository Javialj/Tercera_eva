package LaBatallaDeLasAlmas;

public class Demonio extends Incorporio{
    int bondad;
    int maldad;
    @Override
    public void mostar() {

    }

    public Demonio(int bondad, int maldad) {
        this.bondad = bondad;
        this.maldad = maldad;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }
}
