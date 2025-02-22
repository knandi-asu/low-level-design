package allclasses;

public class PublicUnivFactory extends UniversityFactory{
    @Override
    public GetAdmitCard getAdmitCard(String course){
        switch(course){
            case "Math":
                return new UTDAdmitCard();
            case "CS":
                return new ASUAdmitCard();
            default:
                break;
        }
        return null;
    }
    @Override
    public GetFees getFees(String course){
        switch(course){
            case "Math":
                return new UTDFees();
            case "CS":
                return new ASUFees();
            default:
                break;
        }
        return null;
    }
}
