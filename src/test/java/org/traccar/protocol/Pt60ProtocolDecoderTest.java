package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class Pt60ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new Pt60ProtocolDecoder(null));

        verifyNull(decoder, text(
                "@B#@|01|006|864891030184954|9425010450971470|20181213093127|2|1|"));

        verifyNull(decoder, text(
                "@B#@|01|006|864891030184954|9425010450971470|20181213093235|40412,10461,1,425,4|2|1|"));

        verifyNotNull(decoder, text(
                "@B#@|01|001|864891030184852|9425010450971470|1|84|20181205161005|40412,10461,1,425,10|2|"));

        verifyPosition(decoder, text(
                "@B#@|01|001|864891030184852|9425010450971470|1|45|20181127122717|32.701093|35.570938|1|"));

        verifyNull(decoder, text(
                "@B#@|01|003|864891030184954|9425010450971470|S6_EN_A_V1.3.7|0|66|20181122113251|40412,10461,1,425,18|49382,10461,1,425,9|40411,10461,1,425,7|2|"));

        verifyNull(decoder, text(
                "@B#@|01|033|864891030184954|9425010450971470|0|4|20181120151744|"));

        verifyPosition(decoder, text(
                "@B#@|01|001|111112222233333|8888888888888888|1|55|20160715150323|37.615124|125.48276|111.059279|49.346383|1|"));

        verifyPosition(decoder, text(
                "@B#@|01|001|111112222233333|8888888888888888|1|55|20160715150323|37.615124|125.48276|1|"));

        verifyAttributes(decoder, text(
                "@G#@,V01,14,357653051059785,9404223001501310,20180419165604,101,26,"));

        verifyAttributes(decoder, text(
                "@G#@,V01,13,357653051059785,9404223001501310,20180419112656,1180,"));

        verifyPosition(decoder, text(
                "@G#@,V01,6,111112222233333,8888888888888888,20150312010203,23.2014050;104.235212,"));

        verifyNull(decoder, text(
                "@G#@,V01,1,353882080015633,9460025014649193,"));

        verifyNull(decoder, text(
                "@G#@,V01,43,105681639001701,9460000412618231,20180410092923,5,460;0;9763;3852;-63|460;0;9763;3851;-26|460;0;9763;4080;-22|460;0;9763;3593;-18|460;0;9763;3591;-10,5,14:b8:37:26:64:88;004300680069006e0061004e00650074002d006e0047006e0058;-76|08:9b:4b:93:b5:b1;005400480049004e004b0052004100430045;-77|ec:3d:fd:c9:38:4a;004b00460052006f0075007400650072;-78|b0:d5:9d:c6:f8:82;003300360030514d8d390057006900460069002d00380032;-81|02:fa:84:3b:fa:6a;00470075006500730074005f0032002e003400470048007a;-82,"));

    }

}
