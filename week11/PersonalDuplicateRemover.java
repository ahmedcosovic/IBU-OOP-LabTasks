import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> characterStrings = new HashSet<>();
    private int duplicateCount = 0;

    @Override
    public void add(String characterString) {
        if (characterStrings.contains(characterString)) {
            duplicateCount++;
        } else {
            characterStrings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return characterStrings;
    }

    @Override
    public void empty() {
        characterStrings.clear();
        duplicateCount = 0;
    }
}