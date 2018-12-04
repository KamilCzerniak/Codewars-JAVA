public class Dinglemouse {
    public static boolean generationLoss(String orig, String copy) {
        if (orig.length() != copy.length()) {
            return false;
        }
        for (int i = 0; i < orig.length(); i++) {
            char charOrig = orig.charAt(i);
            char charCopy = copy.charAt(i);
            if (String.valueOf(charOrig).matches("[#+:.A-Za-z0-9]")) {
                if (Character.isDigit(charOrig) && charOrig != charCopy) {
                    return false;
                } else if (Character.isUpperCase(charOrig)
                        && charOrig != charCopy
                        && Character.toLowerCase(charOrig) != charCopy
                        && !"#+:. ".contains(String.valueOf(charCopy))) {
                    return false;
                } else if (Character.isLowerCase(charOrig)
                        && charOrig != charCopy
                        && !"#+:. ".contains(String.valueOf(charCopy))) {
                    return false;
                }

                switch (charOrig) {
                    case '#': {
                        if (!"#+:. ".contains(String.valueOf(charCopy))) {
                            return false;
                        }
                        break;
                    }
                    case '+': {
                        if (!"+:. ".contains(String.valueOf(charCopy))) {
                            return false;
                        }
                        break;
                    }
                    case ':': {
                        if (!":. ".contains(String.valueOf(charCopy))) {
                            return false;
                        }
                        break;
                    }
                    case '.': {
                        if (!". ".contains(String.valueOf(charCopy))) {
                            return false;
                        }
                        break;
                    }
                }
            } else {
                if (charOrig != charCopy) {
                    return false;
                }
            }
        }

        return true;
    }
}
