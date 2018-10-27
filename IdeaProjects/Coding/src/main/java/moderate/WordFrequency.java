package moderate;
import java.util.HashMap;

public class WordFrequency {


    // Single Query

    public int getWordFrquency(String word, String[] book) {

        word = word.trim().toLowerCase();
        int wordCount = 0;

        for(String wrdInBook : book) {
            if(wrdInBook.trim().toLowerCase().equals(word)) {
                wordCount++;
            }
        }
        return wordCount;
    }

    // Multiple Queries

    public HashMap<String, Integer> generateWordMap(String[] book) {

        HashMap<String, Integer> map = new HashMap<>();

        for(String wordInaBook : book) {
            wordInaBook = wordInaBook.trim().toLowerCase();
            if(map.containsKey(wordInaBook)) {
                map.put(wordInaBook, map.get(wordInaBook) + 1);
            } else {
                map.put(wordInaBook, 1);
            }
        }
        return map;
    }

    public int getFrequency(String word, HashMap<String, Integer> wordMapInaBook) {

        word = word.trim().toLowerCase();
        if(wordMapInaBook.containsKey(word)) {
            return wordMapInaBook.get(word);
        } else {
            return 0;
        }
    }
}
