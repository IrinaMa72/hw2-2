public class Ravenclaw extends Hogwarts{
    private int smarts;
    private int wisdom;
    private int wittiness;
    private int creative;
    public Ravenclaw(String name, int witchcraft, int transgress, int smarts, int wisdom, int wittiness, int creative) {
        super(name, witchcraft, transgress);
        this.smarts = smarts;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creative = creative;
    }

    public int getSmarts() {
        return smarts;
    }

    public void setSmarts(int smarts) {
        this.smarts = smarts;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public int calculateSpecificScore() {
        return this.smarts + this.wisdom +  this.wittiness + this.creative;
    }

    @Override
    public String toString() {
        return super.toString() + "Я " + " - студент Ravenclaw, у меня smarts=" + smarts +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creative=" + creative +
                ", колдовство=" + ", способность трансгрессировать=";
    }


}
