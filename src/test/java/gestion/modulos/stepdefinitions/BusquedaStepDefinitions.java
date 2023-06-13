package gestion.modulos.stepdefinitions;

import gestion.modulos.task.NavegarA;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import gestion.modulos.task.IrMenu;
import gestion.modulos.task.AccederMenuModulo;

public class BusquedaStepDefinitions {

    @Dado("{actor} esta logueado en NCD intranet")
    public void loginIntranet(Actor actor) {
        actor.wasAbleTo(NavegarA.theIntranetPage());
    }

    @Cuando("{actor} accede a Gestion de templates")
    public void irGestionTemplate(Actor actor) {
            actor.wasAbleTo(NavegarA.theGestionDeTemplatePage());
    }

    @Y("{actor} selecciona el link Gestion")
    public void irMenuGestionTemplate(Actor actor) {
        actor.attemptsTo(
                IrMenu.irMenuGestion()
        );
    }

    @Y("{actor} selecciona el item Gestion de Inventario DWDM")
    public void irMenuItemGestionInventarioDWDM(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                IrMenu.irMenuGestionModuloDWDM()
        );
        Thread.sleep(10000);
    }

    @Entonces("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                //Ensure.that(AccederMenuModulo.HEADING).hasText(term)
        );
    }
}
