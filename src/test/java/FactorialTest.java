import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    // Given: Nous avons besoin d'un nombre entier positif
    @Test
    public void testFactorielle() {
        int nombre = 5;
        int resultatAttendu = 120;

        // When: On calcule sa factorielle
        int res = factorielle(nombre);

        // Then: Le resultat doit correspondre a l'attendu
        assertEquals(resultatAttendu, res);
    }

    // Méthode qui calcule la factorielle
    public int factorielle(int fact) {
        int n = 1;
        for (int i = 1; i <= fact; i++) {
            n = n * i;
        }
        return n;
    }
}
