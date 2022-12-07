public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Student pino = new Student("Pino", "Daniele", 5698, 3);
        Professor marco = new Professor("Marco", "Biondi", 1240, "literature");
        Assistant marta = new Assistant("Marta", "Micheli", 3022, "Is a PhD");

        pino.goToCollege();
        marco.goToCollege();
        marta.goToCollege();

        pino.studyAtHome();
        marco.teachToOtherPeople();
        marta.studyAtHome();
        marta.teachToOtherPeople();
    }
}
