public class Assistant extends CollegePerson implements TeachingPerson, LearningPerson {

    String willBeAPhD;

    public void teachToOtherPeople() {
        System.out.println("The assistant " + name + " " + surname + ", college id: " + collegeId + ", can be a teaching person that teach to other people and " + willBeAPhD);
    }

    public void studyAtHome() {
        System.out.println("The assistant " + name + " " + surname + ", college id: " + collegeId + ", can be a learning person that study at home and " + willBeAPhD);
    }


    /**
     *
     * @param name
     * @param surname
     * @param collegeId
     * @param willBeAPhD
     */
    Assistant(String name, String surname, int collegeId, String willBeAPhD) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
        this.willBeAPhD = willBeAPhD;
  
