import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private HashMap<String, Set<String>> multipleEntries = new HashMap<>();
    @Override
    public void add(String word, String translation) {
        Set<String> translations = multipleEntries.getOrDefault(word, new HashSet<>());
        translations.add(translation);
        multipleEntries.put(word, translations);
    }

    @Override
    public Set<String> translate(String word) {
        return multipleEntries.get(word);
    }

    @Override
    public void remove(String word) {
        multipleEntries.remove(word);
    }
}
