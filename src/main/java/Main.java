import design.pattern.AssuranceVoiture;
import design.pattern.ResponsabiliteCivile;
import design.pattern.decorator.BrisDeGlace;
import design.pattern.decorator.DammageAndCollision;
import design.pattern.decorator.Incendie;
import design.pattern.decorator.Inondation;
import design.pattern.decorator.Vol;

public class Main {

	public static void main(String[] args) {
		AssuranceVoiture responsabiliteCivile = new ResponsabiliteCivile();
		responsabiliteCivile.cout();

		responsabiliteCivile = new Vol(responsabiliteCivile);
		responsabiliteCivile.cout();

		responsabiliteCivile = new DammageAndCollision(responsabiliteCivile);
		responsabiliteCivile.cout();
		
		responsabiliteCivile = new Incendie(responsabiliteCivile);
		responsabiliteCivile.cout();
		
		responsabiliteCivile = new Inondation(responsabiliteCivile);
		responsabiliteCivile.cout();
		
		responsabiliteCivile = new BrisDeGlace(responsabiliteCivile);
		responsabiliteCivile.cout();

	}
}
