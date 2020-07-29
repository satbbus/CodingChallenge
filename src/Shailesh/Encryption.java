package Shailesh;

import com.sun.xml.internal.ws.util.StringUtils;

class Encrypter {

    public static String getEncryptedName(String name) {
        Validator validator = new Validator();
        StringBuilder nameBuilder = new StringBuilder();
        if (validator.validate(name)) {
            nameBuilder = new StringBuilder();
            nameBuilder.append(name.toLowerCase());
            nameBuilder = nameBuilder.reverse();
        } else {
            throw new IllegalArgumentException("Try again with valid name");
        }
        return nameBuilder.toString();
    }
}

class Validator {
    public boolean validate(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch != ' ' && !(Character.isLowerCase(ch) || Character.isUpperCase(ch))) {
                return false;
            }
        }

        return true;
    }
}

