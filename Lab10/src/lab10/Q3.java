/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

import java.util.*;
import java.io.*;

/**
 *
 * @author Wei Han
 */
public class Q3 {

    public static void main(String[] args) {
        ShuffleCipher plainToCipher = new ShuffleCipher("plainText.txt", "shuffleCipherText.txt", 3);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher("shuffleCipherText.txt", "shuffleDecodedText.txt", 3);
        cipherToPlain.cipherToPlain();
    }
}

class ShuffleCipher implements MessageEncoder {

    String inputFileName;
    String outputFileName;
    int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }

    public void plainToCipher() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine()) {
                outputStream.println(encode(inputStream.nextLine()));
            }

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public void cipherToPlain() {
        try {
            Scanner inputStream = new Scanner(new FileInputStream(inputFileName));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(outputFileName));

            while (inputStream.hasNextLine()) {
                outputStream.println(decode(inputStream.nextLine()));
            }

            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    @Override
    public String encode(String plainText) {
        int half = plainText.length() / 2;
        String cipherText = "";
        for (int shuffle = 0; shuffle < N; shuffle++) {
            cipherText = "";
            for (int i = 0; i < half; i++) {
                cipherText += "" + plainText.charAt(i) + plainText.charAt(i + half);
            }
            if (plainText.length() % 2 == 1) {
                cipherText += plainText.charAt(plainText.length() - 1);
            }
            plainText = cipherText;
        }
        return cipherText;
    }

    @Override
    public String decode(String cipherText) {
        String plainText = "";
        for (int shuffle = 0; shuffle < N; shuffle++) {
            String s1 = "", s2 = "";
            for (int i = 0; i < cipherText.length();) {
                s1 += cipherText.charAt(i++);
                s2 += cipherText.charAt(i++);
            }
            plainText = s1 + s2;
            if (cipherText.length() % 2 == 1) {
                plainText += cipherText.charAt(cipherText.length() - 1);
            }
            cipherText = plainText;
        }
        return plainText;
    }
}
