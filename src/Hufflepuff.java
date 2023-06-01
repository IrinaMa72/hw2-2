public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, int witchcraft, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
//    public void compare(Hufflepuff student) {
//        int powerStudentOne = student.getWitchcraft()+ student.getTransgress()+ student.industriousness+ student.loyalty+ student.honesty;
//        int powerStudentSecond = this.getWitchcraft()+ this.getTransgress()+ this.industriousness+ this.loyalty+ this.honesty;
//        if (powerStudentOne>powerStudentSecond) {
//            System.out.println("Победил " + getName());
//        } else if (powerStudentOne<powerStudentSecond) {
//            System.out.println("Победил " + getName());
//        } else System.out.println("Победила дружба!");}

    @Override
    public int calculateSpecificScore() {
        return this.industriousness + this.loyalty + this.honesty;
    }

    @Override
    public String toString() {
        return super.toString() + "Я "
//                + this.getName()
                + " -  студент Hufflepuff, у меня industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", колдовство="
                //+ this.getWitchcraft()
        + ", способность трансгрессировать="
                //+ this.getTransgress()
        ;
    }



}
