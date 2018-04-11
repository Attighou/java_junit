package fr.wildcodeschool.unittesting;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

/**
 * Unit test for simple StringUtils.
 */
public class StringUtilsTest
{
    public StringUtils listeString;

    @BeforeEach
    public void initialisation(){
        StringUtils listeString = new StringUtils();
    }
    // Test echec methode
    @Test(expected = NullPointerException.class)
    public void TestMethodeFail (){

        assertEquals("",listeString.vowels(null));

    }
    // Mot vide
    @Test
    public void Testmotvide (){
        String sMotVide="";
        assertEquals("",listeString.vowels(sMotVide));

    }
    // Test amot avec espace
    @Test
    public void TestMotAvecEspace (){
        String sMotAtester="eat io";
        assertEquals("eaio",listeString.vowels(sMotAtester));
    }
    // Test voyelle avec accent
    @Test
    public void TestmotAvecAccent (){
    String sMotAtester="ébâ";
    assertEquals("éâ",listeString.vowels(sMotAtester));
    }

    // Mot avec la meme voyelle plusieurs fois
    @Test
    public void TestMotAvecVoyelle (){
        String sMotAtester="ébeoceo";
        assertEquals("éeo",listeString.vowels(sMotAtester));
    }
    // Mot sans aucune voyelle
    @Test
    public void TestMotSansvoyelle (){
         String sMotAtester="rtdfgpm";
        assertEquals("",listeString.vowels(sMotAtester));
    }
    // Test mot avec lettre majuscule
    @Test
    public void TestMotAvecMajusculeEtY (){
        String sMotAtester="Y evtrey";
        assertEquals("Yey",listeString.vowels(sMotAtester));
    }

    @AfterEach
    void reset(){
        listeString =null;
    }

}
