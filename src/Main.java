public class Main {
    public static void main(String[] args) {
//        Griffindor[] griffindors = {
//                new Griffindor("Harry Potter", 100, 100, 100, 100, 100),
//                new Griffindor("Hermoine Granger", 85, 55, 68, 70, 30),
//                new Griffindor("Ron Weasley", 50, 60, 70, 80, 40)};
//
//        Hufflepuff[] hufflepuffs = {
//                new Hufflepuff("Zakharia Smith", 50, 80, 60, 30, 20),
//                new Hufflepuff("Cedrick Diggory", 65, 40, 70, 50, 80),
//                new Hufflepuff("Justin Finch-Fletchlie", 10, 20, 30, 40, 50)};
//
//        Ravenclaw[] ravenclaws = {
//                new Ravenclaw("Cho Chang", 90, 80, 70, 60, 50, 40),
//                new Ravenclaw("Padma Patil", 60, 40, 50, 30, 70, 80),
//                new Ravenclaw("Marcus Belbie", 70, 70, 60, 60, 70, 70)};
//
//        Slytherin[] slytherins = {
//                new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100),
//                new Slytherin("Graham Montague", 60, 70, 30, 20, 75, 60, 20),
//                new Slytherin("Gregory Goyle", 50, 50, 50, 80, 50,  60, 20)};

        Griffindor harryPotter = new Griffindor("Harry Potter", 100, 100, 100, 100, 100);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 85, 55, 68, 70, 30);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100);

//        System.out.println("harryPotter.calculateSpecificScore() = " + harryPotter.calculateSpecificScore());
//        System.out.println("harryPotter.calculateGeneralScore() = " + harryPotter.calculateGeneralScore());

        hermioneGranger.compare(dracoMalfoy);
     //  hermioneGranger.compareBySpecific(harryPotter);




//        Griffindor harryPotter = new Griffindor(5, 10, 15);
//        harryPotter.setWitchcraft(100);
//        harryPotter.setTransgress(45);
//        harryPotter.setName("Harry Potter");
//        Griffindor hermioneGranger = new Griffindor(15, 20, 10);
//        hermioneGranger.setWitchcraft(52);
//        hermioneGranger.setTransgress(39);
//        hermioneGranger.setName("Hermione Granger");
//        Griffindor ronWeasley = new Griffindor(30, 25, 20);
//        ronWeasley.setWitchcraft(47);
//        ronWeasley.setTransgress(75);
//        ronWeasley.setName("Ron Weasley");
//        Slytherin dracoMalfoy = new Slytherin(40, 25, 20, 50, 60);
//        dracoMalfoy.setWitchcraft(56);
//        dracoMalfoy.setTransgress(46);
//        dracoMalfoy.setName("Draco Malfoy");
//
//        Slytherin grahamMontagu = new Slytherin(15,20,18,25,52);
//        grahamMontagu.setWitchcraft(34);
//        grahamMontagu.setTransgress(78);
//        grahamMontagu.setName("Graham Montagu");
//
//        Slytherin gregoryGoyle = new Slytherin(56,20,15,41,36);
//        gregoryGoyle.setWitchcraft(74);
//        gregoryGoyle.setTransgress(95);
//        gregoryGoyle.setName("Gregory Goyle");
//
//        Hufflepuff zachariasSmith = new Hufflepuff(74,15,19);
//        zachariasSmith.setWitchcraft(61);
//        zachariasSmith.setTransgress(29);
//        zachariasSmith.setName("Zacharias Smith");
//
//        Hufflepuff cedricDiggory = new Hufflepuff(63,25,41);
//        cedricDiggory.setWitchcraft(39);
//        cedricDiggory.setTransgress(16);
//        cedricDiggory.setName("Cedric Diggory");
//
//        Hufflepuff justinFinchFletchley = new Hufflepuff(20,15,84);
//        justinFinchFletchley.setWitchcraft(46);
//        justinFinchFletchley.setTransgress(28);
//        justinFinchFletchley.setName("Justin Finch-Fletchley");
//
//        Ravenclaw zhouChang = new Ravenclaw(15,74,66,25);
//        zhouChang.setWitchcraft(56);
//        zhouChang.setTransgress(89);
//        zhouChang.setName("Zhou Chang");
//
//        Ravenclaw padmaPatil = new Ravenclaw(25,63,85,95);
//        padmaPatil.setWitchcraft(26);
//        padmaPatil.setWitchcraft(82);
//        padmaPatil.setTransgress(14);
//        padmaPatil.setName("Padma Patil");
//
//        Ravenclaw marcusBelby = new Ravenclaw(100,95,84,11);
//        marcusBelby.setWitchcraft(56);
//        marcusBelby.setTransgress(18);
//        marcusBelby.setName("Marcus Belby");
//
//
//        System.out.println(harryPotter);
//        System.out.println(hermioneGranger);
//        System.out.println(ronWeasley);
//        System.out.println(dracoMalfoy);
//        System.out.println(grahamMontagu);
//        System.out.println(gregoryGoyle);
//        System.out.println(zachariasSmith);
//        System.out.println(cedricDiggory);
//        System.out.println(justinFinchFletchley);
//        System.out.println(zhouChang);
//        System.out.println(padmaPatil);
//        System.out.println(marcusBelby);
//
//        harryPotter.compare(hermioneGranger);
//        dracoMalfoy.compare(grahamMontagu);
//        zachariasSmith.compare(justinFinchFletchley);
//        zhouChang.compare(marcusBelby);
//
//        new Hogwarts().compare(harryPotter, dracoMalfoy);
    }
}