public class StringPacket {
    public static String communicationModule(String packet) {
        String result = "";
        int a = Integer.valueOf(packet.substring(8, 12));
        int b = Integer.valueOf(packet.substring(12, 16));
        switch (packet.substring(4, 8)) {
            case "0F12": {
                result = String.format("%04d", a + b > 9999 ? 9999 : a + b);
                break;
            }
            case "B7A2": {
                result = String.format("%04d", a - b < 0 ? 0 : a - b);
                break;
            }
            case "C3D9": {
                result = String.format("%04d", a * b > 9999 ? 9999 : a * b);
                break;
            }
        }
        return String.format("%sFFFF%s0000%s"
                , packet.substring(0, 4)
                , result
                , packet.substring(packet.length() - 4));
    }
}
