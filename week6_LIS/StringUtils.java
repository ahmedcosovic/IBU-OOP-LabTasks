public class StringUtils {
    public static boolean included(String word, String searched){
        if(word.equals(null) || searched.equals(null))
            return false;
        String wordlower = word.toLowerCase();
        String searchedlower = searched.toLowerCase();
        wordlower = wordlower.trim();
        searchedlower = searchedlower.trim();
        if(wordlower.contains(searchedlower))
            return true;
        else
            return false;
    }
}
