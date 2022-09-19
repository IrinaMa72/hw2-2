public class Ravenclaw extends Hogwarts{
    private int smarts;
    private int wisdom;
    private int wittiness;
    private int creative;
    public Ravenclaw(int smarts, int wisdom, int wittiness, int creative) {
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
    public void compare(Ravenclaw student) {
        int powerStudentOne = student.getWitchcraft()+ student.getTransgress()+ student.smarts+ student.wisdom+ student.wittiness+ student.creative;
        int powerStudentSecond = this.getWitchcraft()+ this.getTransgress()+ this.smarts+ this.wisdom+ this.wittiness+ student.creative;
        if (powerStudentOne>powerStudentSecond) {
            System.out.println("Победил "+ getName());
        } else if (powerStudentOne<powerStudentSecond) {
            System.out.println("Победил "+ getName());
        } else System.out.println("Победила дружба!");}
    @Override
    public String toString() {
        return "Я " + this.getName() + " - студент Ravenclaw, у меня smarts=" + smarts +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creative=" + creative +
                ", колдовство=" + this.getWitchcraft() + ", способность трансгрессировать=" + this.getTransgress();
    }


}
