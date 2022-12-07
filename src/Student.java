public class Student extends CollegePerson implements LearningPerson {

    int academicYear;

    public void studyAtHome() {
        System.out.println("The student " + name + " " + surname + ", college Id: " + collegeId + ", is a learning person from academic year: " + academicYear + " that study at home.");
    }

    /**
     *
     * @param name
     * @param surname
     * @param collegeId
     * @param academicYear
     */
    Student(String name, String surname, int collegeId, int academicYear) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.academicYear = academicYear;
    }
}
