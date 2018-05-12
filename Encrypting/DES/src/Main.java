
public class Main {

    public static void main(String[] args) {
        DES des = new DES();

        String oriText = "12345678";
        String key = des.convertStringToHex("mypass");
        byte[] keys = des.parseBytes(key);
        byte[] test = oriText.getBytes();

        System.out.println("Plain text:  " + oriText );
        System.out.println("Key:  " + des.hex(keys));

        String result = des.hex(des.encryptCBC(test, keys));
        System.out.println("Original text:  " + des.hex(test));
        System.out.println("Encryption result:  " + result);

        byte[] encResult = des.parseBytes(result);
        String decResult = new String(des.decryptCBC(encResult,keys));
        System.out.println("Decryption result:  " + decResult);
    }
}
