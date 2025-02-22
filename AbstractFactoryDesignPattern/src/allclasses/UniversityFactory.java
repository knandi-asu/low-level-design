package allclasses;

public abstract class UniversityFactory {
    private static int cutoff=100;
    public static UniversityFactory getUnivFactory(int score){
        if(score>cutoff){
            return new IvyUnivFactory();
        }else{
            return new PublicUnivFactory();
        }
    }

    public abstract GetAdmitCard getAdmitCard(String course);
    public abstract GetFees getFees(String course);
}
