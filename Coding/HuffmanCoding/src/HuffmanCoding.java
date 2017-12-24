import java.io.FileNotFoundException;
import java.util.Scanner;

public class HuffmanCoding {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("*************Huffman encoding*************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: \t");
        String text = scanner.next();
        Huffman huffman = new Huffman();
        huffman.initialize(text);
        String encoded = huffman.encodeText(text);
        System.out.println("Encoded:\t" + encoded);
        String decoded = huffman.decodeText(encoded);
        System.out.println("Decoded:\t" + decoded);
    }
}
