package info.nightscout.androidaps.plugins.pump.carelevo.ui.ext

fun ByteArray.convertToBytesToString(): String {
    return StringBuilder().let {
        for (byte in this) {
            it.append(String.format("0x%02x", byte)).append(" ")
        }
        it
    }.toString()
}