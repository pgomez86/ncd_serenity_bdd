package gestion.modulos.stepdefinitions;

import gestion.modulos.questions.ResultadoBusquedaInventarioDWDM;
import gestion.modulos.tasks.*;
import gestion.modulos.ui.GestionDeInventarioDWDMPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

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
    public void irTabSistemasRutasSpans(Actor actor) {
        actor.attemptsTo(
                IrTab.irTabSistemaRutaSpan()
        );

    }

    @Y("{actor} ingresa el sistema {string}")
    public void ingresarBusqueda(Actor actor, String text) {
        actor.attemptsTo(
                BuscarCon.ingresarDatoSistema(text)
        );
    }

    @Y("{actor} selecciona el status {string}")
    public void seleccionarStatus(Actor actor, String status) {
        actor.attemptsTo(
                BuscarCon.seleccionarEstado(status)
        );
    }

    @Y("{actor} realiza la busqueda")
    public void realizarBusqueda(Actor actor) throws InterruptedException {
        actor.attemptsTo(
                BuscarCon.clickBuscar()
        );
        Thread.sleep(10000);
    }

    @Entonces("{actor} debera visualizar el dato sistema, la ruta y RFS")
    public void should_see_information_about(Actor actor) {
        actor.attemptsTo(
               // ResultadoBusquedaInventarioDWDM.ObtenerResultadoRuta(text)
                Ensure.that(GestionDeInventarioDWDMPage.INPUT_RESULTADO_RUTA).isDisplayed(),
                Ensure.that(GestionDeInventarioDWDMPage.INPUT_RESULTADO_RFS).isDisplayed(),
                Ensure.that(GestionDeInventarioDWDMPage.INPUT_RESULTADO_SISTEMAS).isDisplayed()
        );
    }
}
