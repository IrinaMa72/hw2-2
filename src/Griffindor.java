public class Griffindor extends Hogwarts{
//    String name;
    private int nobility;
    private int honour;
    private int bravery;

    public Griffindor(int nobility, int honour, int bravery) {
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
    public void compare(Griffindor student) {
        int powerStudentOne = student.getWitchcraft()+ student.getTransgress()+ student.nobility+ student.honour+ student.bravery;
        int powerStudentSecond = this.getWitchcraft()+ this.getTransgress()+ this.nobility+ this.honour+ this.bravery;
        if (powerStudentOne>powerStudentSecond) {
            System.out.println("Победил "+ getName() );
        } else if (powerStudentOne<powerStudentSecond) {
            System.out.println("Победил второй студент");
        } else System.out.println("Победила дружба!");


    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }



    @Override
    public String toString() {
        return "Я " + this.getName() + " - студент Griffindor, у меня благородство=" + nobility +                ", честь=" + honour +
                ", храбрость=" + bravery + ", колдовство=" + this.getWitchcraft() + ", способность трансгрессировать=" + this.getTransgress();
    }
}
