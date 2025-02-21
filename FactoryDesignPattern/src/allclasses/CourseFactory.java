package allclasses;

public class CourseFactory {
    public static Course getCourse(String type) {
        switch(type){
            case "LLD":
                return new LLD();
            case "HLD":
                return new HLD();
            default:
                return null;
        }
    }
}
