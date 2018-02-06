package ecuaciones;


import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.*;

public class EcuacionCuadraticaTest {

	@Test
	public void terminoACeroTest() {
		EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(0, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.primeraSolucion(), is(-1.0));
		
		ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.segundaSolucion(), is(-1.0));
	}
	
	@Test
	public void terminoBCeroTest() {
		EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.primeraSolucion(), is(0.0));
		
		ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.segundaSolucion(), is(0.0));
	}
	
	@Test
	public void terminoCCeroTest() {
		EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.primeraSolucion(), is(0.0));
		
		ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.segundaSolucion(), is(0.0));
	}

	@Test
	public void primeraSolucionTest() {
		EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.primeraSolucion(), is(-1));

		ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.primeraSolucion(), is(-0.5));
	}
	
	@Test
	public void segundaSolucionTest() {
		EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.segundaSolucion(), is(-1));

		ecuacionCuadratica = new EcuacionCuadratica(1, 1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionCuadratica.segundaSolucion(), is(-0.5));
	}
}
