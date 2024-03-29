package internship;
import java.io.*;
public class FileOverlap {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\mahes\\Desktop\\file1.txt";
        String file2 = "C:\\Users\\mahes\\Desktop\\file2.txt";

        try {
            Range range1 = getFileRange(file1);
            Range range2 = getFileRange(file2);
            if (rangesOverlap(range1, range2)) {
                System.out.println("Files overlap.");
            } else {
                System.out.println("Files do not overlap.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the files: " + e.getMessage());
        }
    }
    private static Range getFileRange(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            int tokenStart = Integer.parseInt(tokens[0]);
            int tokenEnd = Integer.parseInt(tokens[1]);
            start = Math.min(start, tokenStart);
            end = Math.max(end, tokenEnd);
        }

        bufferedReader.close();

        return new Range(start, end);
    }
    private static boolean rangesOverlap(Range range1, Range range2) {
        return range1.getEnd() >= range2.getStart() && range2.getEnd() >= range1.getStart();
    }
    static class Range {
        private final int start;
        private final int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}