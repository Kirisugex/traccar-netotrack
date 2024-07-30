package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.traccar.ProtocolTest;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class At2000ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        assumeTrue(Boolean.parseBoolean(System.getenv("CI")));

        At2000ProtocolDecoder decoder;

        decoder = inject(new At2000ProtocolDecoder(null));

        verifyNull(decoder, binary(
                "01012f00000000000000000000000000003335373435343037313632373539388b57ec3a6ec7e3310a1ceb0a70fd751b8f2e7be6df1d6dcd80129f66fff0ea1c"));

        verifyNull(decoder, binary(
                "89000000000000000000000000000000"));

        decoder = inject(new At2000ProtocolDecoder(null));

        verifyNull(decoder, binary(
                "01012f0000000000000000000000000000333537343534303731363036313936ddf189075add9a32d97b54073025963e65849a3a59940d05fd8db655fc84bc6d"));

        verifyPositions(decoder, binary(
                "893b01000000000000000000000000003b40bcdab6387d829146701d8cb53daaa87b84d24b40cb24fd86da5d3f5f02b0f6f603c43c5a513418a0b2bdcaba603dbe737687cfe9082c57668eb6789d2b029a35aeac6a609558b96de5d7ad37917c902efc878ca9aff474f9d5d2417191285b8d5749bd3ffa86cc99096ce24c1f6ac350ae9adf3d5c788f80b4e3d3dc2dbb8abc1414ea1b52fdb55b2bb8af223ec528245f99d451b715e5774c5397db645d9ae441e645f8dae70230b728e81f51240868712d6f426fd694dbad8026fcf487c268939f04593ad86391cc829b1a1bdac8804ff7507544a69dc0b1b3927d7344e8a5b26fa56825283b3e476330b36d15011e1647ebd9f2ef71844ed32c0dc050457bfbd79160e6d1d8cda00a0927c8957631770e98eb20735aa46b0b18502baf4c45d2623ee51a4320cf3018010e7bbf8bc0dd79eb28e88b727ea67e980b8a91"));

        decoder = inject(new At2000ProtocolDecoder(null));

        verifyNull(decoder, binary(
                "01012f000000000000000000000000000033353734353430373136303631393637f5441a9862260117858237fe3160388490f0df7d46c09112ee087235a92101"));

        verifyPositions(decoder, binary(
                "89043203000000000000000000000000d01ff1df1b56ba9185bb741ddc253f3cee093b1f8193100cd95777b5288a6f29d1b343a952f882ce8825679f7e27ad88ed7898bff92f716acadfc3c17fa8c1a6b9d0934e8f042433a183776c06c1acd73efb4b9f19030debb4dceb161fb3e6630757d25c3e995b7cf5f446318dcc1677eb215d1af49f11cd7300598bcdc40cc25466ed2391d836c782e44bc04a332e902b2b34f5597a542af4ca670cdfc18d87ce2a225c3e6f2f32359d4914c6df09aa5ee306c229260d4a56da53f93398bc8a6e77095305ee214cf605de20d3876a993fb810486f75bcd514c12442bf4dc3fbe7963b20d5100b5ecff1c1aef4c4b3736a04e245d50f538327db21d55270b279db5ac5a9658876bae3d9b5026b8975bb2bf4d100b8492760d66ae31f27bf9c525c2d794860eabca9c788b91152dbce79f336daaf6a7a9547bf1dd8e3334c891f4548fd6d112ebf45125c2a8abd3a786ebbcfdd03101b524bbf465f14a9a424305ce7de56ffca85b4657fc8c03e4349c0ca6be64d1cf595ee91f8173678ef2267dae54dd00028450c48d9b74c925af0f245d409d8773238dce5832747587f53a12155869c1d464eb0630f94cf8dceb76aa39995411d4ce7743b1501692425afec498535526067e79f568b7f71ee47d8b4929118d57b13d56cdbfd26582d579dee"));

        decoder = inject(new At2000ProtocolDecoder(null));

        verifyNull(decoder, binary(
                "01012f0000000000000000000000000000333537343534303731363035353033dd529a1eb5df9f3b6d320b38250e03306692957e8c2127d8e381a717f639b4c9"));

        verifyPositions(decoder, binary(
                "89898701000000000000000000000000ae99e38f13d44f536769eb4930a6826dfebe5b98a6048941e89b17c9cdcb276be4af7c0d188d07c90d6e94aa9efcb465fe7aeaff4d85caf837483b4e9b32fbbacfbc4e175eebf57a27f552a64fc3419565d2dfbea668511a08d5a526342fad0e93b20c4449ad8defab4a9ac68cf7dad86971eb2cd96810d9d6a9c56e07fd90e4c28cfc53a069b63efe37a0523a69b607a2dc011ba17b177c5332c04be1faeeabed24539b3b790fa8a8610ab3633e0140ed79690fcae9dea43c7daad780d95a511d8f4875e621bcfe7516a03b80eb3c473ffd4bc1eda298dfa7d994a2cfeaa5d24c190d52d72fd90975a2e6f9ed3b95017133952262f91787c46839738a80c333dc53ee4d8afe75315d801efe17bc7309f30cfce64906bf70e6844c835781cbb64b49e9315ca3c2cd39d00a03cc7178a4ebc5df230dcdfd44ec588791d488f96bb6ff4007a753f552bda4d1766632aa3ec5eb38feb23ed6efb8f382a7f22b70adc9cb533c09bf749190c36d63b572c1acfc3a59138d51273835ab13c4689df01e3d2c2dd1829e00aac5c56b5d51e60d6731833f82c7464d88df663ca28a20eedeecb60f3704ae78281838caa116184e414db459768321bbfa1e83ad59fe168eb81f3b41cfe0e39c8aa78cbbe5825620bf053a1cb62e04d4cdf17ca2dc9305d47c"));

        decoder = inject(new At2000ProtocolDecoder(null));

        verifyNull(decoder, binary(
                "01012f00000000000000000000000000003335363137333036343430373439320fad981997ae8e031fe10c0ea7641903ca32c0331df467233d2a9cd886fbeef8"));

        verifyPositions(decoder, binary(
                "893f0000000000000000000000000000e048b1a31deba3f5dbe8877f574877e6ed4d022b6611a10d80dfc4c0c11fa8aacf4a9de61528327e2b66843dd9c5d3a7cc9ee1d9c71a34bb482145d88b4fda3e"));

    }

}
