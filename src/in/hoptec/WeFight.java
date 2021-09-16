package in.hoptec;

import java.util.Base64;

public class WeFight {
    public static void main(String[] args) throws Exception {

        String[] messageToYou = {"V2UgYXJlIE5hdmlucyAh",
                "V2UgRmlnaHQgLCBCZWNhdXNlIFRoYXRzIHdoYXQgd2UgZG8uLg==",
                "VGhhdHMgV2hvIFdlIEFyZSA=",
                "V2Ugd2lsbCB3aW4gZHVlIHRvIHRoZSBzaW1wbGUgZmFjdCB0aGF0IHdlIGRvbnQgcXVpdCA=",
                "QW5kIFlvdSBrbm93IHdoeSA/IEJlY2F1c2UgV2UgYXJlIE5hdmlucyBhbmQgdGhhdHMgd2hhdCB3ZSBkby4u",
                "V2UgRmlnaHQgLCBXZSBGaWdodCB0aWxsIHdlIHdpbiAsIG9yIHRpbGwgd2UgdGFrZSBvdXIgbGFzdCBicmVhdGg=",
                "V2UgRmlnaHQgLCBXZSBGaWdodCBMaWtlIEhlbGwgLCBXZSBqdXN0IGRvbnQgUXVpdCAuIA==",
                "QmVjYXVzZSBXZSBhcmUgTmF2aW5zICwgVGhhdHMgd2hvIHdlIGFyZSAsIGFuZCBUaGF0cyB3aGF0IHdlIGRvIC4gV0UgRklHSFQgISA=",
                "RG9udCBXb3JyeSAhIFlvdSB3aWxsIG1ha2UgaXQgISBHb2QgaXMgdGhlcmUgZm9yIHlvdSAhIEFsbCB5b3UgaGF2ZSB0byBkbyBpcyBGSUdIVCAh",
                "RmlnaHQgIQ==",
                "QmVjYXVzZQ==",
                "V2UgYXJlIE5hdmlucyAh",
                "UmVtZW1iZXIgdGhhdC4uLg=="};

        int normalLen = messageToYou[0].length();
        for (String msg : messageToYou) {
            System.out.println(new String(Base64.getDecoder().decode(msg)));
            Thread.sleep(3000 * (msg.length() / normalLen));
        }

    }
}
