/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarcipher;

public class CaesarCipher {
 
    public String encrypt(String plainText, int key) {
        key = key % 26 + 26;
        StringBuilder encrypted = new StringBuilder();
        for (char i : plainText.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encrypted.append((char) ('A' + (i - 'A' + key) % 26 ));
                } else {
                    encrypted.append((char) ('a' + (i - 'a' + key) % 26 ));
                }
            } else {
                encrypted.append(i);
            }
        }
        return encrypted.toString();
    }
    
    public String decrypt(String encrypted, int key) {
        return encrypt(encrypted, 26-key);
    }
}
