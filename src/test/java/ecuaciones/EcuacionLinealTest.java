package ecuaciones;


import org.junit.jupiter.api.Test;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.MatcherAssert.*;

public class EcuacionLinealTest {

	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 0); // x + 0 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionLineal.solucion(), is(0.0));
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(1, 1); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionLineal.solucion(), is(-1));

		ecuacionLineal = new EcuacionLineal(2, 1); // 2x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
		assertThat(ecuacionLineal.solucion(), is(-0.5));
	}
}
