package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;
import org.traccar.model.Position;

public class EelinkProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new EelinkProtocolDecoder(null));

        verifyPositions(decoder, binary(
                "454c029249a50354679090044671676712004321315f3cf43503fc94d3760c79328a0129000000000a01f9000190330905580d2e046f118a04ec00000000ccc7086c02fe000000000000000000000000000000000000676712004321325f3cf43e03fc94d3760c79328a0129000000000901f9000190330905580d2e046f117b04ec00000000ccc7086d02ff000000000000000000000000000000000000676712004321335f3cf44703fc94d3760c79328a0129000000000901f9000190330905580d2e046f117f04ec00000000ccc7086d02ff000000000000000000000000000000000000676712004321345f3cf45303fc94d3760c79328a0129000000000901f9000190330905580d2e046f119d04ec00000000ccc7086d02ff000000000000000000000000000000000000676712004321355f3cf45c03fc94d3760c79328a0129000000000801f9000190330905580d2e046f11a304ec00000000ccc7086d02ff000000000000000000000000000000000000676712004321365f3cf46603fc94d3760c79328a0129000000000801f9000190330905580d2e046f118804df00000000ccc7086d02ff000000000000000000000000000000000000676712004321375f3cf47103fc94d3760c79328a0129000000000901f9000190330905580d2e046f119704ec00000000ccc7086d02ff000000000000000000000000000000000000676712004321385f3cf47a03fc94d3760c79328a0129000000000901f9000190330905580d2e046f118204ec00000000ccc7086e0300000000000000000000000000000000000000676712004321395f3cf48303fc94d3760c79328a0129000000000901f9000190330905580d2e046f117604df00000000ccc7086e0300000000000000000000000000000000000000"));

        verifyPosition(decoder, binary(
                "6767120056096661d38e0091fbf0aa3a0f8fa08500060051015f09002542e50e7ea6080101f90001304e304e0818390d000000c524c2ae0699102b00000000000115b0040504050000000014000000000000000000000000000002"));

        verifyAttribute(decoder, binary(
                "676714001500035f74a2940201360104591100a7160122250400"),
                Position.KEY_ALARM, Position.ALARM_REMOVING);

        verifyNull(decoder, binary(
                "454C0027E753035254407167747167670100180002035254407167747100200205020500010432000086BD"));

        verifyPositions(decoder, false, binary(
                "454C03EA2B040865284045749185676712013B001E5E8ED5A60000880ED8000000000000000000030003000000000000000000005C550000000000001102F1A00220F0FEA700B10C0BE91510001828D97ECC95D1C400B1030BFD16C00015B3B0FE237EC7C00001040BD816200019BDC691C032E6C000B1020C2015D00003C67480A034F7A30001040BDC1310001CE52429096FDCBA00B1020C1C15F0001F9AEB3CC9C8D49F0001040B7316200014C0A26B6495EFAB0001040ACC1A400013D6313E4CE3EED700B1030BF516800016BE49BD3E05EDB00001040BF01620001DDB15BDE209E4A800B10C0BE515300014BA13142CB0C7AA0001040BD815D00019D39722BB52DBA30001040BF317500011020C850118EFC50001020A8115F000188B659FD04CD1AD0001040BE816000014AC91F5C96BDBAC0001040BF214B0001495CDFA62B6D2AB00B10C0BDB15C00013676712014B001F5E8ED5AC0000880ED8000000000000000000030003000000000000000000005F8D0000000000001202B3B0FE237EC7C00001040BD816200019BDC691C032E6C000B1020C2015D00003C67480A034F7A30001040BDC1310001CE52429096FDCBA00B1020C1C15F0001FBE49BD3E05EDB00001040BF01620001DDB15BDE209E4A800B10C0BE515300014BA13142CB0C7AA0001040BD815D00019D39722BB52DBA30001040BF317500011020C850118EFC50001020A8115F000188B659FD04CD1AD0001040BE816000014AC91F5C96BDBAC0001040BF214B0001495CDFA62B6D2AB00B10C0BDB15C00013F1A00220F0FEA700B10C0BE9152000189AEB3CC9C8D4A30001040B731620001428D97ECC95D1C200B1030C0016C00015372CFB9E84C3A00029020F5100000000D6313E4CE3EED700B1030BF716800016C0A26B6495EFB10001040ACC1A400013676712014B00205E8ED5B10000880ED8000000000000000000030003000000000000000000005C550000000000001202B3B0FE237EC7C00001040BD816200019BDC691C032E6C000B1020C2015D00003DB15BDE209E4A800B10C0BE515300014BA13142CB0C7AA0001040BD815D00019D39722BB52DBA30001040BF317500011020C850118EFC50001020A8115F000188B659FD04CD1AD0001040BE81600001495CDFA62B6D2AB00B10C0BDB15C000139AEB3CC9C8D4A30001040B731620001428D97ECC95D1C200B1030C0016C00015372CFB9E84C3A00029020F5100000000C0A26B6495EFB10001040ACC1A400013BE49BD3E05EDA90001040BF01620001DAC91F5C96BDBA50001040BF014B00014F1A00220F0FE9F00B10C0BE915200018E52429096FDCC200B1020C1B15F0001FD6313E4CE3EED200B1030BF716800016C67480A034F7A40001040BDC1300001C"));

        verifyAttribute(decoder, binary(
                "6767070006000e0077035d"),
                Position.KEY_IGNITION, true);

        verifyAttributes(decoder, binary(
                "676707006502df5c89fde800bc3fa8030302005555045b555555057a5555550b225555550c105c55550d115555550e7e5555550f4555555510017b5555112b5555551f01ed5555208005b0012100005555407ad000004237f5555589000000498a0000aef78b00000000"));

        verifyAttribute(decoder, binary(
                "676712003400e45c5b0ade02012e03702d87064546aa24066a1086018a0000002dc1a0ffffffff0afd074d000000000000000000000000fce0"),
                Position.PREFIX_TEMP + 2, -50.0);

        verifyAttribute(decoder, binary(
                "6767120043000e5c37387c0304e4e1b4f8194fa800160013009408012e03702d8706453c6e5b066f115f05710000001b067f8d248d240313020500000000000000000000000001cc"),
                Position.PREFIX_TEMP + 2, 28.75);

        verifyPosition(decoder, binary(
                "676714002414B05AD43A7D03026B92B10C395499FFD7000000000701CC00002495000014203604067B"));

        verifyPosition(decoder, binary(
                "676780005a000001000000004c61743a4e33312e38333935352c4c6f6e3a5738322e36313334362c436f757273653a302e30302c53706565643a302e30306b6d2f682c4461746554696d653a323031372d31322d30322031313a32393a3433"));

        verifyPosition(decoder, binary(
                "676780005E5788014C754C754C61743A4E32332E3131313734330A4C6F6E3A453131342E3430393233380A436F757273653A302E30300A53706565643A302E31374B4D2F480A446174652054696D653A323031352D30392D31332032303A32313A3230"));

        verifyPosition(decoder, binary(
                "454C0050EAE2035254407167747167671200410021590BD93803026B940D0C3952AD0021000000000501CC0001A53F0170F0AB1305890F11000000000000C2D0001C001600000000000000000000000000000000"));

        verifyNull(decoder, binary(
                "676701000c007b03525440717505180104"));

        verifyPosition(decoder, binary(
                "6767120048000559c1829213059a7400008e277d000c000000000800cc00080d2a000034df3cf0b429dd82cad3048910320000000000007b7320d005ba0000000019a000000000000000000000"));

        verifyPosition(decoder, binary(
                "6767050020213b59c6aecdff41dce70b8b977d00000001fe000a36e30078fe010159c6aecd"));

        verifyPosition(decoder, binary(
                "676705002102b459ae7388fcd360d7034332b1000000028f000a4f64002eb101010159ae7388"));

        verifyPosition(decoder, binary(
                "676702001c02b259ae7387fcd360d6034332b2000000028f000a4f64002eb10101"));

        verifyPosition(decoder, binary(
                "6767050022001F59643640000000000000000000000001CC0000249500142000015964A6C0006E"));

        verifyAttributes(decoder, binary(
                "67670300040021006E"));

        verifyPosition(decoder, binary(
                "676705002200255964369D000000000000000000000001CC0000249500142000025964A71D006A"));

        verifyAttributes(decoder, binary(
                "67670300040028006A"));

        verifyPosition(decoder, binary(
                "676712002d066c592cca6803002631a60b22127700240046005c08020d000301af000da0fd12007f11ce05820000001899c0"));

        verifyPosition(decoder, binary(
                "676702002509f65868507603a1e92e03cf90fe000000019f000117ee00111e0120631145003101510000"));

        verifyAttributes(decoder, binary(
                "676712001e0092579714d60201f90001785003a301cd1a006a118504f2000000000000"));

        verifyPosition(decoder, binary(
                "676712003400505784cc0b130246479b07d05a06001800000000070195039f046100002cc52e6466b391604a4900890e7c00000000000006ca"));

        verifyPosition(decoder, binary(
                "676714002b00515784cc24130246479b07d05a06001800010000060195039f046100002cc52f6466b391604a49020089"));

        verifyNull(decoder, binary(
                "676701000c002603541880486128290120"));

        verifyPosition(decoder, binary(
                "676704001c01a4569ff2dd0517a0f7020b0d9a06011000d8001e005b0004450183"));

        verifyPosition(decoder, binary(
                "676705002200ba569fc3520517a0d8020b0f740f007100d8001e005b0004460101569fd162001f"));

        verifyPosition(decoder, binary(
                "676702002500bb569fc3610517a091020b116000001900d8001e005b00044601001f1170003200000000"));

        verifyPosition(decoder, binary(
                "676704001c00b7569fc3020517a2d7020b08e100000000d8001e005b0004460004"));

        verifyNull(decoder, binary(
                "676701000b001b035418804661834901"));

        verifyAttributes(decoder, binary(
                "6767030004001A0001"));

        verifyAttributes(decoder, binary(
                "6767070088001050E2281400FFFFFFFF02334455660333445566043344556605AA00000007334455660A334455660B334455660C4E2000000DAA0000000E334455660F3344556610AAAA000011334455661C334455661F334455662133445566423344556646334455664D334455665C334455665E33445566880000000089000000008A000000008B00000000"));

        verifyPosition(decoder, binary(
                "676702001b03c5538086df0190c1790b3482df0f0157020800013beb00342401"));

    }

}
