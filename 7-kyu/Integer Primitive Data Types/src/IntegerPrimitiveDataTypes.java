public class IntegerPrimitiveDataTypes {
    public static String determineType(String number) {

        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0: {
                    try {
                        byte type = Byte.valueOf(number);
                        return "byte";
                    } catch (NumberFormatException nfe) {
                        break;
                    }
                }
                case 1: {
                    try {
                        short type = Short.valueOf(number);
                        return "short";
                    } catch (NumberFormatException nfe) {
                        break;
                    }
                }
                case 2: {
                    try {
                        int type = Integer.valueOf(number);
                        return "int";
                    } catch (NumberFormatException nfe) {
                        break;
                    }
                }
                case 3: {
                    try {
                        long type = Long.valueOf(number);
                        return "long";
                    } catch (NumberFormatException nfe) {
                        break;
                    }
                }
            }
        }
        return "none";
    }
}
