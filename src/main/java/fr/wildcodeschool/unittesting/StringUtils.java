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
        char lettreCourante;
        // supprime les espaces eventuels
        candidate=candidate.replaceAll(" ","");
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            lettreCourante=letters[i];
            if (ALL_VOWELS.indexOf(lettreCourante) >= 0 && vowels.indexOf( (lettreCourante)) < 0) {
                // on teste si la lettre n'a pas été deja trouvée
                    vowels += lettreCourante;

            }
        }
        return vowels;
    }
}
