package design.pattern.decorator;

import design.pattern.AssuranceVoiture;

public class DammageAndCollision extends AssuranceDecorator {

	public DammageAndCollision(AssuranceVoiture assuranceVoiture) {
		super(assuranceVoiture);

	}

	@Override
	public double cout() {
		double cout=assuranceVoiture.cout() + 500;
		System.out.println("L'assurance du dommage et Collision= "+cout);
		return cout;
	}

}
