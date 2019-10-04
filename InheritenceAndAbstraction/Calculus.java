package GA.homework.InheritenceAndAbstraction;

public class Calculus extends Math{

    private String ABorIB;

    public Calculus(){}

    public Calculus(String className, int numOfStudents, String teacherName, int classRoomNum, boolean isOffered, String ABorIB) {
        super(className, numOfStudents, teacherName, classRoomNum, isOffered);
        this.ABorIB = ABorIB;
    }

    public String getABorIB() {
        return ABorIB;
    }

    public void setABorIB(String ABorIB) {
        this.ABorIB = ABorIB;
    }


    @Override
    public void gradesOffered() {
        System.out.println("For fall 2019, calculus is offered to Seniors only.");
    }
}
