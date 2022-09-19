public class Hogwarts {
   private String name;
   private int witchcraft;
   private int transgress;

   public void compare(Hogwarts studentOne, Hogwarts studentSecond) {
      int powerStudentOne = studentOne.getWitchcraft() + studentOne.getTransgress();
      int powerStudentSecond = studentSecond.getWitchcraft() + studentSecond.getTransgress();
      if (powerStudentOne>powerStudentSecond) {
         System.out.println("Победил первый студент");
      } else if (powerStudentOne<powerStudentSecond) {
         System.out.println("Победил второй студент");
      } else System.out.println("Победила дружба!");
   }

   public int getWitchcraft() {
      return witchcraft;
   }

   public void setWitchcraft(int witchcraft) {
      this.witchcraft = witchcraft;
   }

   public int getTransgress() {
      return transgress;
   }

   public void setTransgress(int transgress) {
      this.transgress = transgress;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;


   }
}
