package allclasses;

public class LLD extends Course{
    @Override
    public void createCourse(){
        modules.add(new IntroModule());
        modules.add(new ConceptModule());
        modules.add(new ExcerciseModule());

    }
}
