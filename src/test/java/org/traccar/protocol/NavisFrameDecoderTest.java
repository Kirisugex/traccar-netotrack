package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class NavisFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecodeNtcb() throws Exception {

        NavisFrameDecoder frameDecoder = new NavisFrameDecoder();

        verifyFrame(binary(
                "404e5443010000000000000059009adb2a3e54250000000000ff1500040b0a1008291838001200760ee600000000000000000000000f1500040b0a10ac20703fb1aec23f00000000320149668f430000000000000000000000000000000000000000000000f3808080"),
                frameDecoder.decode(null, null, binary("404e5443010000000000000059009adb2a3e54250000000000ff1500040b0a1008291838001200760ee600000000000000000000000f1500040b0a10ac20703fb1aec23f00000000320149668f430000000000000000000000000000000000000000000000f3808080")));

    }

    @Test
    public void testDecodeFlex10() throws Exception {

        NavisFrameDecoder frameDecoder = new NavisFrameDecoder();

        frameDecoder.setFlexDataSize(73);

        verifyFrame(binary(
                "7e54040000000400000030129957405c000b00632f9857405ccace03021e129101a103000000000000c4005ba3fe3b00000000120046100000000000001aff7f000080bfffff80000080bfffffffff9f"),
                frameDecoder.decode(null, null, binary("7e54040000000400000030129957405c000b00632f9857405ccace03021e129101a103000000000000c4005ba3fe3b00000000120046100000000000001aff7f000080bfffff80000080bfffffffff9f")));

        verifyFrame(binary(
                "7e4101080000000917c057405c002b001833c057405cbbce030225129101a00300007c6102408900400c1b3cfce3b23a12004710e000000000001bff7f000080bfffff80000080bfffffffffb2"),
                frameDecoder.decode(null, null, binary("7e4101080000000917c057405c002b001833c057405cbbce030225129101a00300007c6102408900400c1b3cfce3b23a12004710e000000000001bff7f000080bfffff80000080bfffffffffb2")));
    }

}
