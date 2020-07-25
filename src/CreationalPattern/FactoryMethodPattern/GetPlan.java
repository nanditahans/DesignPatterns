package CreationalPattern.FactoryMethodPattern;

public class GetPlan {

    public Plan getPlan(String plantype){

        if(plantype.compareToIgnoreCase("DOMESTICPLAN")==0){
            return new DomesticPlan();
        }
        else if(plantype.compareToIgnoreCase("INSTITUTIONALPLAN")==0){
            return new InstitutioalPlan();
        }
        else if(plantype.compareToIgnoreCase("COMMERICALPLAN")==0){
            return new InstitutioalPlan();
        }
        else
            return null;

    }
}
