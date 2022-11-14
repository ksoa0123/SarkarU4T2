import java.util.Locale;

public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        /* to be implemented */
        character = character.toLowerCase();
        searchString = searchString.toLowerCase();

        int counter = 0;

        for (int i = 0; i < searchString.length(); i++){
            if (Character.toString(searchString.charAt(i)).equals(character)){
                counter+= 1;
            }
        }

        return counter;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        /* to be implemented */
        String reversed = "";

        for (int i = origString.length() - 1; i >= 0 ;i--){
            reversed += origString.charAt(i);
        }
        return reversed;

    }
}

