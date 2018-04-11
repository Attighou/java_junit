package fr.wildcodeschool.unittesting;


import java.lang.*;

public class StringUtils
{
    private static final String ALL_VOWELS = "aeiouyAEIOUYàâéèêëïîôû";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        //if (candidate!=null){
        // supprime les espaces eventuels
        candidate=candidate.replaceAll(" ","");
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                // on teste si la lettre n'a pas été deja trouvée
                if (vowels.indexOf( (letters[i])) < 0) {
                    vowels += letters[i];
                }
            }
        }
        //}
        return vowels;
    }
}
