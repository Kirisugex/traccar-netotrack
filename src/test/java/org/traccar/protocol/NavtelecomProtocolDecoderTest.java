package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class NavtelecomProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new NavtelecomProtocolDecoder(null));

        verifyNull(decoder, binary(
                "404e5443010000000000000013004e452a3e533a383636373935303331343130363839"));

        verifyNull(decoder, binary(
                "404e544301000000000000002a005e6c2a3e464c4558b01e1efffffe300a08080ffffe08000000580028002bc0000000000000b4000000000000"));

        verifyPositions(decoder, binary(
                "7e4104022106000517c4ae2f6180a9000e2fc4ae2f61471dff0171b35801d2050000a9870e412801d9d096466a37061000009474270080ff7f00000000ffff8000000000ffffffffffffffffffffffffffff7f00000000ffffff0308000000000000090cf70900000826fa000200b3ad2b00000826fa000200aad75200000826fa000200aa9cae2f6158020000000000000000000a14000000000000000000000000000000000000000026000000032106000b17dbae2f6180a9000e33daae2f61a11dff01edb15801d00500009c50e83f2f01ecd09646793706100000ab74270080ff7f00000000ffff8000000000ffffffffffffffffffffffffffff7f00000000ffffff0408000000000000090bf70900000826fa000200af8bc70000256cfa000200ab3e7c0000256cfa000200aad7ae2f61fd080000000000000000000a140100000000000000000000000000000000000000260000000421060054a0e7ae2f6180a9000e33e6ae2f61ba1dff01beb15801d305000038b977402201f0d09646163706100000b674270080ff7f00000000ffff8000000000ffffffffffffffffffffffffffff7f00000000ffffff0309000000000000080bf70900000826fa000200af8bc70000256cfa000200ab3e7c0000256cfa000200aad7ae2f6173040000000000000000000a14080000000000000000000000000000000000000026000000052106000517efae2f6180a9000f33efae2f61c21dff0166b15801df05000017f145404d00f5d09646693706100000bf74270080ff7f00000000ffff8000000000ffffffffffffffffffffffffffff7f00000000ffffff0408000000000000090cf70900000826fa000200af8bc70000256cfa000200ab3e7c0000256cfa000200aad7ae2f615b030000000000000000000a14020000000000000000000000000000000000000026000000a9"));

        verifyNull(decoder, binary(
                "404e544301000000000000001300f7fc2a3e464c4558b00a0a45fffe00000000000000"));

        verifyNull(decoder, binary(
                "404e544301000000000000001300cbc02a3e464c4558b00a0a45fffe300a0e08000000"));

    }

}
