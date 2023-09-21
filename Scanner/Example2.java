package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeSet;

public class Example2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("C:\\text\\text.txt"));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String word = scanner.next();
                treeSet.add(word);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
         scanner.close();
        }
        System.out.println(treeSet);
    }
}
