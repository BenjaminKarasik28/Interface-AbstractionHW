package GA.homework.InheritenceAndAbstraction;

public class Algebra extends Math {

    public Algebra() {}

    public Algebra(String className, int numOfStudents, String teacherName, int classRoomNum, boolean isOffered) {
        super(className, numOfStudents, teacherName, classRoomNum, isOffered);
    }

    @Override
    public void gradesOffered() {
        System.out.println("For fall 2019, algebra is offered to all students.");
    }

}
