import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        FileHandler handler = new FileHandler();
        SHA256Encoder encoder = new SHA256Encoder();
        HashComparator comparator = new HashComparator();

        int COUNT = 10;
        String file1 = "file1.bmp";
        String file2 = "file2.bmp";
        String[] file1Blocks = new String[COUNT];
        String[] file2Blocks = new String[COUNT];

        byte[][] blocks = handler.splitFile(file1, COUNT);
        System.out.println("Хеши блоков 1 файла");
        for(int i=0; i<COUNT; i++) {
            file1Blocks[i] = encoder.code(blocks[i]);
            System.out.println(file1Blocks[i]);
        }

        blocks = handler.splitFile(file2, COUNT);
        System.out.println("Хеши блоков 2 файла");
        for(int i=0; i<COUNT; i++) {
            file2Blocks[i] = encoder.code(blocks[i]);
            System.out.println(file2Blocks[i]);
        }

        comparator.compare(file1Blocks, file2Blocks);
    }
}
