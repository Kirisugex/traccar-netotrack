package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class TramigoFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new TramigoFrameDecoder());

        verifyFrame(
                binary("0480001df35b1b69101a023ef34f0090436d38003200380e0000850081c0e4ff6d542f00000015000000050000000000007600a20100008f436d3800014400000000000000000021000a0006005a574a6169726f7320486972692043656e747265205072696d617279205363686f6f6c536f7574686572746f6e486172617265"),
                decoder.decode(null, null, binary("0480001df35b1b69101a023ef34f0090436d38003200380e0000850081c0e4ff6d542f00000015000000050000000000007600a20100008f436d3800014400000000000000000021000a0006005a574a6169726f7320486972692043656e747265205072696d617279205363686f6f6c536f7574686572746f6e486172617265")));

        verifyFrame(
                binary("8000ed2bb0009c000101bee000050b09633d925b5472616d69676f3a205472697020737461727465642c2053686f636b2053656e736f722c206174204b696e6720437265656b20526f61642d46726565746f776e205374726565742c20506f727420486172636f7572742c205269766572732c204e472c20342e37363336312c20372e30313836382c2030373a31383a333620536570203320454f46"),
                decoder.decode(null, null, binary("8000ed2bb0009c000101bee000050b09633d925b5472616d69676f3a205472697020737461727465642c2053686f636b2053656e736f722c206174204b696e6720437265656b20526f61642d46726565746f776e205374726565742c20506f727420486172636f7572742c205269766572732c204e472c20342e37363336312c20372e30313836382c2030373a31383a333620536570203320454f46")));

        verifyFrame(
                binary("80003d1ac0001c00010100000367152b13bc1d5970696e6720454f46"),
                decoder.decode(null, null, binary("80003d1ac0001c00010100000367152b13bc1d5970696e6720454f46")));

    }

}
