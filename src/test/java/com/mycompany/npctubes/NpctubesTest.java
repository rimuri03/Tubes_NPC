/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.npctubes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RizkiMr
 */
public class NpctubesTest {
    
    @Test
    public void testBEqualsZero() {
        assertEquals(1, Npctubes.CariNilaiPangkat(2, 0));
        assertEquals(1, Npctubes.CariNilaiPangkat(0, 0));
    }

    @Test
    public void testBNegative() {
        assertEquals(-1, Npctubes.CariNilaiPangkat(2, -3));
        assertEquals(-1, Npctubes.CariNilaiPangkat(-2, -3));
    }

    @Test
    public void testBGreaterThanTen() {
        assertEquals(-2, Npctubes.CariNilaiPangkat(2, 11));
        assertEquals(-2, Npctubes.CariNilaiPangkat(3, 12));
    }

    @Test
    public void testAGreaterThanHundred() {
        assertEquals(-2, Npctubes.CariNilaiPangkat(101, 3));
        assertEquals(-2, Npctubes.CariNilaiPangkat(102, 2));
    }

    @Test
    public void testValidPangkat() {
        assertEquals(8, Npctubes.CariNilaiPangkat(2, 3));
        assertEquals(16, Npctubes.CariNilaiPangkat(2, 4));
        assertEquals(1, Npctubes.CariNilaiPangkat(1, 5));
        assertEquals(0, Npctubes.CariNilaiPangkat(0, 5));
    }

    @Test
    public void testNegativeBase() {
        assertEquals(-8, Npctubes.CariNilaiPangkat(-2, 3));
        assertEquals(16, Npctubes.CariNilaiPangkat(-2, 4));
    }

    @Test
    public void testBaseOne() {
        assertEquals(1, Npctubes.CariNilaiPangkat(1, 0));
        assertEquals(1, Npctubes.CariNilaiPangkat(1, 10));
    }
}
