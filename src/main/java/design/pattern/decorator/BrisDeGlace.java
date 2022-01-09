package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class BrisDeGlace extends AssuranceDecorator{
	public BrisDeGlace(AssuranceVoiture assuranceVoiture){
        super(assuranceVoiture);
    }

    @Override
    public double cout() {
    	double cout=assuranceVoiture.cout() + 400;
    	System.out.println("L'Assurance du Bris de glace= "+cout);
        return cout;
    }

}
