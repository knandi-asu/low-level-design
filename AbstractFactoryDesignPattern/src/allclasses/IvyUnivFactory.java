package allclasses;

public class IvyUnivFactory extends UniversityFactory{
    @Override
    public GetAdmitCard getAdmitCard(String course){
        switch(course){
            case "Math":
                return new CalTechAdmitCard();
            case "CS":
                return new MITAdmitCard();
            default:
                break;
        }
        return null;
    }
    @Override
    public GetFees getFees(String course){
        switch(course){
            case "Math":
                return new CalTechFees();
            case "CS":
                return new MITFees();
            default:
                break;
        }
        return null;
    }
}
