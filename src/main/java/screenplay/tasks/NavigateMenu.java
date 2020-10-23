package screenplay.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import net.serenitybdd.screenplay.conditions.Check;
import screenplay.user_interfaces.GlobalMenu;

public class NavigateMenu {

	public static Task toBlousesItem() {
		return Task.where("Navigate Menu to blouses option", Hover.over(GlobalMenu.CLOTHES),
				Check.whether(valueOf(GlobalMenu.CLOTHES), isVisible()).andIfSo(Hover.over(GlobalMenu.CLOTHES)),
				Check.whether(valueOf(GlobalMenu.WOMEN), isVisible()).andIfSo(Hover.over(GlobalMenu.WOMEN))
						.andIfSo(Click.on(GlobalMenu.WOMEN))

		);

	}

}
