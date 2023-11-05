package com.javafriends.javabasic.homework.lesson11;

public class PasswordGenerator {

    private int length;

    public PasswordGenerator(int length) {
        if (length < 3) {
            throw new IllegalArgumentException("Password's length must be more than 3.");
        }
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String nextPassword() {
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            do {
                password[i] = (char) (Math.random() * (('z' + 1) - '0') + '0');
            } while (!(Character.isLetterOrDigit(password[i]) || password[i] == '_'));
        }
        return isValidPassword(password) ? new String(password) : nextPassword();
    }

    private boolean isValidPassword(char[] password) {
        boolean haveLetter = false;
        boolean haveDigit = false;
        boolean haveUnderscore = false;

        for (char c : password) {
            if (Character.isLetter(c)) {
                haveLetter = true;
            } else if (Character.isDigit(c)) {
                haveDigit = true;
            } else {
                haveUnderscore = true;
            }

            if (haveUnderscore && haveDigit && haveLetter) {
                return true;
            }
        }
        return false;
    }
}
