package screenplay.questions;

import net.serenitybdd.screenplay.questions.targets.TargetText;
import net.serenitybdd.screenplay.questions.targets.TheTarget;
import screenplay.user_interfaces.CheckoutSummary;

public class Checkout {

	public static TargetText totalPrice() {
		return TheTarget.textOf(CheckoutSummary.TOTAL_PRICE);
	}
}
