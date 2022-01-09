package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class Inondation extends AssuranceDecorator{
	public Inondation(AssuranceVoiture assuranceVoiture){
        super(assuranceVoiture);
    }

    @Override
    public double cout() {
    	double cout=assuranceVoiture.cout() + 400;
    	System.out.println("L'Assurance d'Incendie= "+cout);
        return assuranceVoiture.cout() + 400;
    }

}
