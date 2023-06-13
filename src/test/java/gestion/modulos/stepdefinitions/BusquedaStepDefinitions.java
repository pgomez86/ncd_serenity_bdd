package gestion.modulos.stepdefinitions;

import gestion.modulos.task.IrTab;
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
    public void irMenuItemGestionInventarioDWDM(Actor actor) {
        actor.attemptsTo(
                IrMenu.irMenuGestionModuloDWDM()
        );
    }

    @Y("{actor} selecciona el tab Sistema_Rutas_Spans")
    public void irTabSistemasRutasSpans(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                IrTab.irTabSistemaRutaSpan()
        );
        Thread.sleep(10000);
    }

    @Y("{actor} ingresa el sistema {string}")
    public void ingresarBusqueda(Actor actor, String text) {
        actor.attemptsTo(
                //IrTab.irTabSistemaRutaSpan()
        );
    }

    @Y("{actor} selecciona el status {string}")
    public void seleccionarStatus(Actor actor, String status) {
        actor.attemptsTo(
                //IrTab.irTabSistemaRutaSpan()
        );
    }

    @Y("{actor} realiza la busqueda")
    public void realizarBusqueda(Actor actor) {
        actor.attemptsTo(
                //IrTab.irTabSistemaRutaSpan()
        );
    }

    @Entonces("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(
                //Ensure.that(AccederMenuModulo.HEADING).hasText(term)
        );
    }
}
