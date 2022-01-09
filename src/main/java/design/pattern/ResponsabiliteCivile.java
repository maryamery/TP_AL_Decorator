package design.pattern;

public class ResponsabiliteCivile extends AssuranceVoiture{
    @Override
    public double cout() {
    	System.out.println("L'assurance de la responsabilite civile ="+1000);
        return 1000;
    }

   
}
