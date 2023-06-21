

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste SeatTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class SeatTest
{
    /**
     * Construtor default para a classe de teste SeatTest
     */
    public SeatTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testSeatIsAvailable()
    {
        Seat s = new Seat();
        assertEquals(true, s.getAvailable());
        s.setAvailable(false);
        assertEquals(false, s.getAvailable());
        s.setAvailable(true);
        assertEquals(true, s.getAvailable());
    }
}

