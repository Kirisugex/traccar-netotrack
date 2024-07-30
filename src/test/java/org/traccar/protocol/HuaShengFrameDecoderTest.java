package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HuaShengFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new HuaShengFrameDecoder());

        assertEquals(
                binary("c0010c00120060000000000004000600010100c0"),
                decoder.decode(null, null, binary("c0010c00120060000000000004000600010100c0")));

        assertEquals(
                binary("c0010c003e0002000000000010020012a0014f42445f3347315f56312e302e330013a0043335353835353035303434303635380006a08701000006a0a1035fc0"),
                decoder.decode(null, null, binary("c0010c003e0002000000000010020012a0014f42445f3347315f56312e302e330013a0043335353835353035303434303635380006a08701000006a0a1035fc0")));

        assertEquals(
                binary("c00000003faa0000000000003ea5a5005a3f00c000000031363037303530373132353700e6d186ffcc7a25002201160010000000010015000000000000000000c0"),
                decoder.decode(null, null, binary("c00000003faa0000000000003ea5a5005a3f00dbdc00000031363037303530373132353700e6d186ffcc7a25002201160010000000010015000000000000000000c0")));

        assertEquals(
                binary("C000000041AA00000000000030C000000031353035323630373538323800ADDCC100226AEF0000000000120005000100151206EF0504E99975002903EB80556492CEC0"),
                decoder.decode(null, null, binary("C000000041AA00000000000030DBDC00000031353035323630373538323800ADDCC100226AEF0000000000120005000100151206EF0504E99975002903EB80556492CEC0")));

    }

}
