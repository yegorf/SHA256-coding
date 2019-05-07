
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class FileHandler {

    public byte[][] splitFile(String url, int COUNT) throws IOException {
        byte[] array = Files.readAllBytes(Paths.get(url));

        int fileSize = array.length;

        int blockSize = fileSize/COUNT;
        byte[][] blocks = new byte[COUNT][blockSize];

        int pos = 0;
        for(int i=0; i<COUNT; i++) {
            for(int j=0; j<blockSize; j++) {
                blocks[i][j] = array[pos];
                pos++;
            }
        }
        return blocks;
    }
}
