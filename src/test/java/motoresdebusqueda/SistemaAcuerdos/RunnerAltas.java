package motoresdebusqueda.SistemaAcuerdos;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/SistemaAcuerdos.feature",
        tags = "@AltaEstadoDeExpedientes"

)

public class RunnerAltas {
}

/*
*   DELETE FROM users WHERE 'código' = <codigo>
* */
