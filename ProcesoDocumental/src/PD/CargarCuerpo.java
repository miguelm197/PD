package PD;

import com.dogma.busClass.ApiaAbstractClass;
import com.dogma.busClass.BusClassException;
import com.dogma.busClass.object.Attribute;
import com.dogma.busClass.object.PossibleValue;

public class CargarCuerpo extends ApiaAbstractClass{
	@Override
	protected void executeClass() throws BusClassException {
		
		Attribute tipos = this.getCurrentEntity().getAttribute("PD_CUERPO_STR");

		PossibleValue pos1 = new PossibleValue("CSS", "CSS");
		PossibleValue pos2 = new PossibleValue("AG", "AG");

		
		tipos.addPossibleValues(pos1);
		tipos.addPossibleValues(pos2);
		
	}
}
			