package fr.wildcodeschool.unittesting;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;





/**
 * Unit test for simple StringUtils.
 */
public class StringUtilsTest
{
    // Test echec methode
    @Test
    public void TestMethodeFail (){
        StringUtils  sStringvowels = new StringUtils();

        assertEquals("",sStringvowels.vowels(null));

    }
    // Mot vide
    @Test
    public void Testmotvide (){
    StringUtils  sStringvowels = new StringUtils();
        String sMotVide="";
        assertEquals("",sStringvowels.vowels(sMotVide));

    }
    // Test amot avec espace
    @Test
    public void TestMotAvecEspace (){
        StringUtils  sStringvowels = new StringUtils();
        String sMotAtester="eat io";
        assertEquals("eaio",sStringvowels.vowels(sMotAtester));
    }
    // Test voyelle avec accent
    @Test
    public void TestmotAvecAccent (){
    StringUtils  sStringvowels = new StringUtils();
    String sMotAtester="ébâ";
    assertEquals("éâ",sStringvowels.vowels(sMotAtester));
    }

    // Mot avec la meme voyelle plusieurs fois
    @Test
    public void TestMotAvecVoyelle (){
        StringUtils  sStringvowels = new StringUtils();
        String sMotAtester="ébeoco";
        assertEquals("éeo",sStringvowels.vowels(sMotAtester));
    }
    // Mot sans aucune voyelle
    @Test
    public void TestMotSansvoyelle (){
        StringUtils  sStringvowels = new StringUtils();
        String sMotAtester="rtdfgpm";
        assertEquals("",sStringvowels.vowels(sMotAtester));
    }
    // Test mot avec lettre majuscule
    @Test
    public void TestMotAvecMajusculeEtY (){
        StringUtils  sStringvowels = new StringUtils();
        String sMotAtester="Y evtrey";
        assertEquals("éeo",sStringvowels.vowels(sMotAtester));
    }
    
}
