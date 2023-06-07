public abstract class Hogwarts {
   private String name;
   private int witchcraft;
   private int transgress;
    public String getName() {
        return name;
    }
   public Hogwarts(String name, int witchcraft, int transgress) {
       this.name = name;
       this.witchcraft = witchcraft;
      this.transgress = transgress;
   }

    @Override
    public String toString() {
        return "Hogwarts{" + ", witchcraft=" + witchcraft +
                ", transgress=" + transgress +
                '}';
            }
   public int calculateGeneralScore() {
      return witchcraft + transgress;
   }
      public abstract int calculateSpecificScore();

    public void compare(Hogwarts hogwarts) {
        if (this.getClass().equals(hogwarts.getClass())) {
            compareBySpecific(hogwarts);
        } else {
            compareByGeneral(hogwarts);
        }
    }
    private void compareBySpecific(Hogwarts hogwarts) {
        int thisScore = this.calculateGeneralScore() + this.calculateSpecificScore();
        int otherScore = hogwarts.calculateGeneralScore() + hogwarts.calculateSpecificScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("%s сильнее чем %s", this.name, hogwarts.getName()));
        } else if (thisScore < otherScore) {
            System.out.println(String.format("%s сильнее чем %s", hogwarts.getName(), this.name));
        } else {
            System.out.println("Волшебники равны по силе");
        }
    }

    private void compareByGeneral(Hogwarts hogwarts) {
        int thisScore = calculateGeneralScore();
        int otherScore = hogwarts.calculateGeneralScore();
        if (thisScore > otherScore) {
            System.out.println(String.format("%s сильнее чем %s",  this.name, hogwarts.getName()));
        } else if (thisScore < otherScore) {
            System.out.println(String.format("%s сильнее чем %s", hogwarts.getName(), this.name));
        } else {
            System.out.println("Волшебники равны по силе");
        }
    }



}
