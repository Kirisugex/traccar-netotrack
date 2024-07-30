package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class RadarProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new RadarProtocolDecoder(null));

        verifyPositions(decoder, binary(
                "361800011459015cb497554c01c101ff003500050038000207ff831c04c01f1c00555cb464895cb46487ff7f04eafeffdbd80000079402ead0000000110000000000120d2aff150000000000000002000a00050002436c61726f0000000000008b00000003764500037653005207ff831c04c01f1c00555cb4648a5cb46489ff7f04eafeffdbd80000079402ead0000000010000000000120e00ff150000000000000002000800060002436c61726f0000000000008d00000003764600037654000207ff831c04c01f1c00555cb464d85cb464d7ff7f04eafeffdbd80000079402ead0000000110000000000120e2aff150000000000000002000700070003436c61726f0000000000008d000000037694000376a2005207ff831c04c01f1c00555cb464d95cb464d9ff7f04eafeffdbd80000079402eac0000000010000000000120e00ff150000000000000002000700070003436c61726f0000000000008d000000037695000376a3000207ff831c04c01f1c00555cb465065cb46504ff7f04eafeffdbd80000079402ead0000000110000000000120e2aff150000000000000000000500060005436c61726f0000000000008d0000000376c2000376d07ed7"));

    }

}
