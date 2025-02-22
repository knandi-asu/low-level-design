package allclasses;

public class Student{
    public static void main(String[] args){
        UniversityFactory uf1 = UniversityFactory.getUnivFactory(95);
        GetAdmitCard admit_card1=uf1.getAdmitCard("CS");
        GetFees get_fees1=uf1.getFees("CS");
        System.out.println(admit_card1.getClass());
        System.out.println(get_fees1.getFees());

        UniversityFactory uf2 = UniversityFactory.getUnivFactory(105);
        GetAdmitCard admit_card2=uf2.getAdmitCard("Math");
        GetFees get_fees2=uf2.getFees("Math");
        System.out.println(admit_card2.getClass());
        System.out.println(get_fees2.getFees());
    }
}