package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public abstract class AssuranceDecorator extends AssuranceVoiture{
    protected AssuranceVoiture assuranceVoiture;
    public AssuranceDecorator(AssuranceVoiture assuranceVoiture) {
    	super();
    	this.assuranceVoiture = assuranceVoiture;
    	}

   

}
