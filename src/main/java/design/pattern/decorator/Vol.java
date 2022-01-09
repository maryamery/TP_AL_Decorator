package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class Vol extends AssuranceDecorator{

    public Vol(AssuranceVoiture assuranceVoiture){
        super(assuranceVoiture);
    }

    @Override
    public double cout() {
    	double cout=assuranceVoiture.cout() + 500;
    	System.out.println("L'Assurance du Vol="+cout);
        return cout;
    }

    
}
