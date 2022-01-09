package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class Incendie extends AssuranceDecorator{
	public Incendie(AssuranceVoiture assuranceVoiture){
        super(assuranceVoiture);
    }

    @Override
    public double cout() {
    	double cout=assuranceVoiture.cout() + 600;
    	System.out.println("L'Assurance d'Incendie= "+cout);
        return cout;
    }

}
