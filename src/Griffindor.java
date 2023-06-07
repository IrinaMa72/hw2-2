public class Griffindor extends Hogwarts{
//    String name;
    private int nobility;
    private int honour;
    private int bravery;

    public Griffindor(String name, int witchcraft, int transgress, int nobility, int honour, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public int calculateSpecificScore() {
        return this.nobility + this.honour + this.bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "Я " + " - студент Griffindor, у меня благородство=" + nobility +                ", честь=" + honour +
                ", храбрость=" + bravery + ", колдовство=" + ", способность трансгрессировать=";
    }
}
