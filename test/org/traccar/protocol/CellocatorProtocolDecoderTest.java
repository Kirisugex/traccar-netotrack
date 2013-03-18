package org.traccar.protocol;

import java.nio.ByteOrder;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class CellocatorProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        CellocatorProtocolDecoder decoder = new CellocatorProtocolDecoder(null);
        decoder.setDataManager(new TestDataManager());

        byte[] buf1 = {0x4D,0x43,0x47,0x50,0x00,0x06,0x00,0x00,0x00,0x08,0x1A,0x02,0x02,0x12,0x04,0x00,0x00,0x00,0x21,0x00,0x62,0x30,0x00,0x00,0x00,0x6B,0x00,(byte)0xE1,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,(byte)0xE5,(byte)0xA1,0x00,0x04,0x02,0x06,0x61,0x4E,(byte)0xA3,0x03,0x18,0x1A,0x57,0x03,0x4E,0x12,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x00,0x15,0x25,0x07,0x14,0x03,(byte)0xD6,0x07,0x49};
        assertNotNull(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ByteOrder.LITTLE_ENDIAN, buf1)));

    }

}
