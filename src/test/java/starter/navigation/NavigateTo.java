package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theGestionDeTemplatePage() {
        return Task.where("{0} accede a Gestion de Template",
                Open.browserOn().the(GestionDeTemplatesPage.class));
    }

    public static Performable theIntranetPage() {
        return Task.where("{0} accede a NCD intranet",
                Open.browserOn().the(IntranetPage.class));
    }
}
