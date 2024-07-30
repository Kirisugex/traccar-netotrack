package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

public class OmnicommFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        var decoder = inject(new OmnicommFrameDecoder());

        verifyFrame(
                binary("c08600004566"),
                decoder.decode(null, null, binary("c08600004566")));

        verifyFrame(
                binary("c080080061a61915340100001dec"),
                decoder.decode(null, null, binary("c080080061a61915340100001dec")));

        verifyFrame(
                binary("c0860d0510ab1200b56c9b14002500080c1308b5d9eda401200750ce01142b0896d384940410c8fdbce60218002000280a30002c0c000a0211031308c6d9eda40114660008011308d4d9eda4012001280040f201482c50ce01600068007000800102880195e4ef01900100142b08d4da84940410acf1bce602180c208401280930f81e38d4d9eda4012c330800344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c660008121308d5d9eda4011483010a56543050303e3243303a313031313120543150323e3143313a313131313120566572333039204e6f762031342032303139525354313030303139353020554152545f4750535f393630303a203334353733303234380d0a8401700008011308e6d9eda4012001280040f201482c50ce016000680070008001028801a7e4ef01900164142b08ecd784940410c6f2bce6021800208401280a30f01e38e6d9eda4012c33080010be980218f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308f8d9eda4012007280040f201482c50ce016000680070008001028801b9e4ef01900164142b08ecd784940410c6f2bce6021800208401280b30f01e38f8d9eda4012c33080010c8de0118f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c6f00080113088bdaeda4012007280040f201482c50ce016000680070008001028801cbe4ef01900164142b08ecd784940410c6f2bce6021800208401280c30f01e3889daeda4012c33080010966a18f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c6f00080113089ddaeda4012007280040f201482c50ba066000680070038001028801dde4ef01900164142b08ecd784940410c6f2bce6021800208401280b30f01e389cdaeda4012c33080010b01818f02220e638344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c6f0008011308afdaeda4012007280040f201482c50d2016000680070008001028801efe4ef01900164142b08ecd784940410c6f2bce6021800208401280c30f01e38aedaeda4012c33080010a27518f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308c1daeda4012007280040f201482c50ce01600068007000800102880181e5ef01900164142b08ecd784940410c6f2bce6021800208401280d30f01e38c0daeda4012c33080010d6e80118f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308d3daeda4012007280040f201482c50d001600068007000800102880193e5ef01900164142b08c2e784940410c0edbce602180020cb02280c30fa1e38d2daeda4012c33080010e6980218f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308e5daeda4012007287140f201482c50da016000680070008001028801a5e5ef01900164142b08c2e784940410c0edbce602180020cb02280b30fa1e38e3daeda4012c33080010f6980218ee2220e638344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308f7daeda4012007280040f201482c50d8016000680070008001028801b7e5ef01900164142b08c2e784940410c0edbce602180020cb02280c30fa1e38f6daeda4012c33080010fc980218f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4cc801"),
                decoder.decode(null, null, binary("c0860d0510ab1200b56c9b14002500080c1308b5d9eda401200750ce01142b0896d384940410c8fdbce60218002000280a30002c0c000a0211031308c6d9eda40114660008011308d4d9eda4012001280040f201482c50ce01600068007000800102880195e4ef01900100142b08d4da84940410acf1bce602180c208401280930f81e38d4d9eda4012c330800344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c660008121308d5d9eda4011483010a56543050303e3243303a313031313120543150323e3143313a313131313120566572333039204e6f762031342032303139525354313030303139353020554152545f4750535f393630303a203334353733303234380d0a8401700008011308e6d9eda4012001280040f201482c50ce016000680070008001028801a7e4ef01900164142b08ecd784940410c6f2bce6021800208401280a30f01e38e6d9eda4012c33080010be980218f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308f8d9eda4012007280040f201482c50ce016000680070008001028801b9e4ef01900164142b08ecd784940410c6f2bce6021800208401280b30f01e38f8d9eda4012c33080010c8de0118f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c6f00080113088bdaeda4012007280040f201482c50ce016000680070008001028801cbe4ef01900164142b08ecd784940410c6f2bce6021800208401280c30f01e3889daeda4012c33080010966a18f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c6f00080113089ddaeda4012007280040f201482c50ba066000680070038001028801dde4ef01900164142b08ecd784940410c6f2bce6021800208401280b30f01e389cdaeda4012c33080010b01818f02220e638344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c6f0008011308afdaeda4012007280040f201482c50d2016000680070008001028801efe4ef01900164142b08ecd784940410c6f2bce6021800208401280c30f01e38aedaeda4012c33080010a27518f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308c1daeda4012007280040f201482c50ce01600068007000800102880181e5ef01900164142b08ecd784940410c6f2bce6021800208401280d30f01e38dbdcdaeda4012c33080010d6e80118f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308d3daeda4012007280040f201482c50d001600068007000800102880193e5ef01900164142b08c2e784940410dbdcedbce602180020cb02280c30fa1e38d2daeda4012c33080010e6980218f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308e5daeda4012007287140f201482c50da016000680070008001028801a5e5ef01900164142b08c2e784940410dbdcedbce602180020cb02280b30fa1e38e3daeda4012c33080010f6980218ee2220e638344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4c700008011308f7daeda4012007280040f201482c50d8016000680070008001028801b7e5ef01900164142b08c2e784940410dbdcedbce602180020cb02280c30fa1e38f6daeda4012c33080010fc980218f02220e838344b0b08ff0110ff0118ff0120ff0128ff0130ff0138ff0140ff010c4cc801")));

    }

}
