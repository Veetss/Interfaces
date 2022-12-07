public class Professor extends CollegePerson implements TeachingPerson {

    String subject;

    public void teachToOtherPeople() {
        System.out.println("The " + subject + " " + "professor " + name + " " + surname + ", id: " + collegeId + ", is a teaching person who teach to other people.");
    }

    /**
     *
     * @param name
     * @param surname
     * @param Id
     * @param subject
     */
    Professor(String name, String surname, int Id, String subject) {
        this.name = name;
        this.surname = surname;
        this.collegeId = Id;
        this.subject = subject;
    }
}
