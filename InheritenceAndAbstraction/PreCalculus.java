package GA.homework.InheritenceAndAbstraction;

public class PreCalculus extends Math {

    public PreCalculus() {}

    public PreCalculus(String className, int numOfStudents, String teacherName, int classRoomNum, boolean isOffered) {
        super(className, numOfStudents, teacherName, classRoomNum, isOffered);
    }

    @Override
    public void gradesOffered(){
        System.out.println("For fall 2019, pre-calc is offered to Sophomores, Juniors, and Seniors.");
    }



}
