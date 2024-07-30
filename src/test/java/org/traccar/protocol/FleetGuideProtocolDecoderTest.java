package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class FleetGuideProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new FleetGuideProtocolDecoder(null));

        verifyNull(decoder, binary(
                "5300188f8a020001f36a"));

        verifyPositions(decoder, false, binary(
                "5322188f8a0200140700f355831a83ec06030c008065052c06ffffffff033006808001180003200100005ec0"));

        verifyPositions(decoder, binary(
                "539e598f8a020003020700e378351ac39f040c04ffa92e806a28a13b1f00b638030c000067052c06ffffffff033006808001180003200100000700e478351ac40204303dab2e80cb27a13b1c00ac40021b30e778351ac502043082a72e8054020530bf30021b30e978351ac69f0d0c0433a72e80c123a13b2000df3807002579351ac79f06020a170000df28021b476179351ac8020f30021c81279d79351ac9020f30021c8207d979351aca020f30021c8157157a351acb022b8140517a351acc022b608d7a351acd022b60c97a351ace022b30057b351acf022b30417b351ad0022b307d7b351ad1020f3048021b30b97b351ad2020f3070030c004066021630f57b351ad30213841080021730317c351ad4021330c00217306d7c351ad5020f3050021b30a97c351ad602138170021830e57c351ad7020f3058021b30217d351ad8021385500218305d7d351ad9022b8110997d351ada022b8170d57d351adb022b30117e351adc020f3068030ce184680216304d7e351add020f3060030ce34469021630897e351ade021260e4021830c57e351adf021230e5021830017f351ae002293022f2"));

        verifyPositions(decoder, binary(
                "538958235a02008408070027398f1a7da3040c0485c7437f9db8a635ca016189030c76a567052c06bd05ffff033006138009340f69fb0080008000800118010320018005070029398f1a7e08043b39f0437f14b9a635cb010288030c7108233b2b398f1a7f08043bec18447f7fbca6357c010b8008263b2d398f1a8008043be53d447f61c0a63562011480030c7708213b6f3b"));

        verifyPositions(decoder, binary(
                "53361886b60e00540700cf3b8f1a838d060e041dc683a1b672a04b0000ba885d00030c0ea567052c06ffffffff03300680800118000720070000000000006bc3"));

        verifyPositions(decoder, binary(
                "53dd581fc10e0094080700373d8f1a5e2f090e04cbb6c2a3d3078f4b5d023090b500030cac6567052c06ffffffff0330068080054810fdfdfdff0548121bf0000005481321d4830005481454cf08040e15eee20100054816770308040e171c0208040718281f0804071984000804071a583a000001180107200781050000000007003b3d8f1a5f2f040e04dcfbc2a3b15a8f4b67023890b4081c7c1f08067c2e08067c61081b7c842008057c8308067c443c08107c3e3d8f1a6008047cf125c3a31ca48f4b7c0242081e7c2208067c3908067c6b08067cef08147cac21080c7ce03e080e7cbb62"));

    }

}
