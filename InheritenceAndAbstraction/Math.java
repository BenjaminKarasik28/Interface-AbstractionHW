package GA.homework.InheritenceAndAbstraction;


public abstract class Math implements Class {

    protected String className;
    protected int numOfStudents;
    protected String teacherName;
    protected int classRoomNum;
    boolean isOffered;



    public Math(){}

    public Math(String className, int numOfStudents, String teacherName, int classRoomNum, boolean isOffered) {
        this.className = className;
        this.numOfStudents = numOfStudents;
        this.teacherName = teacherName;
        this.classRoomNum = classRoomNum;
        this.isOffered = isOffered;
    }

    @Override
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getClassRoomNum() {
        return classRoomNum;
    }

    public void setClassRoomNum(int classRoomNum) {
        this.classRoomNum = classRoomNum;
    }

    public boolean isOffered() {
        return isOffered;
    }

    public void setOffered(boolean offered) {
        isOffered = offered;
    }

    public abstract void gradesOffered();

    public String toString(){
        return "Math class! " + className;
    }
}
