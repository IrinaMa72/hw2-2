public class Slytherin extends Hogwarts{
   private int cunning;
   private int resolve;
   private int ambition;
   private int resourcefulness;
   private int desireForPower;

    public Slytherin(String name, int witchcraft, int transgress, int cunning, int resolve, int ambition, int resourcefulness, int desireForPower) {
        super(name, witchcraft, transgress);
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

    @Override
    public int calculateSpecificScore() {
        return this.cunning + this.resolve + this.ambition + this.resourcefulness + this.desireForPower;
    }

    @Override
    public String toString() {
        return super.toString() + "Я " + " - студент Slytherin, у меня cunning=" + cunning +
                ", resolve=" + resolve +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", desireForPower=" + desireForPower +
                ", колдовство=" + ", способность трансгрессировать=";
    }


}
