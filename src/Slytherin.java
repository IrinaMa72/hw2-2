public class Slytherin extends Hogwarts{
   private int cunning;
   private int resolve;
   private int ambition;
   private int resourcefulness;
   private int desireForPower;
    public Slytherin(int cunning, int resolve, int ambition, int resourcefulness, int desireForPower) {
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDesireForPower() {
        return desireForPower;
    }

    public void setDesireForPower(int desireForPower) {
        this.desireForPower = desireForPower;
    }
    public void compare(Slytherin student) {
        int powerStudentOne = student.getWitchcraft()+ student.getTransgress()+ student.cunning+ student.resolve+ student.ambition+ student.resourcefulness+ student.desireForPower;
        int powerStudentSecond = this.getWitchcraft()+ this.getTransgress()+ this.cunning+ this.resolve+ this.ambition+ student.resourcefulness+ student.desireForPower;
        if (powerStudentOne>powerStudentSecond) {
            System.out.println("Победил "+ getName());
        } else if (powerStudentOne<powerStudentSecond) {
            System.out.println("Победил "+ getName());
        } else System.out.println("Победила дружба!");}

    @Override
    public String toString() {
        return "Я " + this.getName() + " - студент Slytherin, у меня cunning=" + cunning +
                ", resolve=" + resolve +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", desireForPower=" + desireForPower +
                ", колдовство=" + this.getWitchcraft() + ", способность трансгрессировать=" + this.getTransgress();
    }


}
