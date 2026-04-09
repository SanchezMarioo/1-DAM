
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
	@Test
	void testCadenaInvertidaNormal() {
		assertEquals("ana", StringUtils.cadenaInvertida("ana"));
		assertEquals(null, StringUtils.cadenaInvertida(""));
		assertEquals(null, StringUtils.cadenaInvertida(null));
		assertEquals("a", StringUtils.cadenaInvertida("a"));
	}
	@Test
	void testCountVowels() {
		assertEquals(2, StringUtils.contarVocales("ana"));
		assertEquals(0, StringUtils.contarVocales("bcd"));
		assertEquals(3, StringUtils.contarVocales("aEI"));
		assertEquals(0, StringUtils.contarVocales(null));
		assertEquals(0, StringUtils.contarVocales(""));
	}
	
}
