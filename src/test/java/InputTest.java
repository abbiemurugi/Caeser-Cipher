import org.junit.*;
import static org.junit.Assert.*;

public class InputTest {

    @Test
    public void runEncrypted_ableTo_encrypt(){
        Input testInput = new Input();
        assertEquals("cd", testInput.encrypt("ab",2));
    }

    @Test
    public void runDecryption_ableTo_decrypt(){
        Input testInput = new Input();
        assertEquals("xy", testInput.decrypt("za",2));

    }

    }