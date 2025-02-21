package allclasses;

public class User {
    public static void main(String[] args){
        Course hldCourse=CourseFactory.getCourse("HLD");
        Course lldCourse=CourseFactory.getCourse("LLD");

        assert hldCourse!=null;
        System.out.print("HLD Modules: ");
        System.out.println(hldCourse.getModules());

        assert lldCourse!=null;
        System.out.print("LLD Modules: ");
        System.out.println(lldCourse.getModules());

    }
}