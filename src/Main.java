public class Main {
    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Harry Potter", 100, 100, 100, 100, 100);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", 85, 55, 68, 70, 30);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 85, 85, 90, 70, 90, 80, 100);

        hermioneGranger.compare(dracoMalfoy);
        harryPotter.compare(dracoMalfoy);

    }
}