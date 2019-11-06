package me.sakigamiyang.exercise.text;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CiphersTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void testEncryptCeasar() {
        Assert.assertEquals("", Ciphers.encryptCeasar("", 3));
        Assert.assertEquals("123KLMNOPQRSTUVWXYZABCDEFGHIJ", Ciphers.encryptCeasar("123ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10));
    }

    @Test
    public void testDecryptCeasar() {
        Assert.assertEquals("", Ciphers.descryptCeasar("", 3));
        Assert.assertEquals("123ABCDEFGHIJKLMNOPQRSTUVWXYZ", Ciphers.descryptCeasar("123KLMNOPQRSTUVWXYZABCDEFGHIJ", 10));
    }

    @Test
    public void testEncryptVernamWithIllegalArgumentException01() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("s and privateKey must have the same length.");
        Ciphers.encryptVernam("123", "12");
    }

    @Test
    public void testEncryptVernamWithIllegalArgumentException02() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("s and privateKey must have the same length.");
        Ciphers.encryptVernam("123", "1234");
    }

    @Test
    public void testDecryptVernamWithIllegalArgumentException01() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("s and privateKey must have the same length.");
        Ciphers.encryptVernam("123", "12");
    }

    @Test
    public void testDecryptVernamWithIllegalArgumentException02() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("s and privateKey must have the same length.");
        Ciphers.encryptVernam("123", "1234");
    }

    @Test
    public void testEncryptVernam() {
        Assert.assertEquals("", Ciphers.encryptVernam("", ""));
        Assert.assertEquals("12AB QLVC", Ciphers.encryptVernam("12AB YZXM", "CD34 SMYQ"));
    }

    @Test
    public void testDecryptVernam() {
        Assert.assertEquals("", Ciphers.descryptVernam("", ""));
        Assert.assertEquals("12AB YZXM", Ciphers.descryptVernam("12AB QLVC", "CD34 SMYQ"));
    }

    @Test
    public void testEncryptVigenereWithIllegalArgumentException() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("The length of privateKey must greater than 0.");
        Ciphers.encryptVigenere("ABCDEFG", "");
    }

    @Test
    public void testDecryptVigenereWithIllegalArgumentException() throws IllegalArgumentException {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("The length of privateKey must greater than 0.");
        Ciphers.descryptVigenere("ABCDEFG", "");
    }

    @Test
    public void testEncryptVigenere() {
        Assert.assertEquals("", Ciphers.encryptVigenere("", "ABC"));
        Assert.assertEquals("1JOIKZSWSMAZGPRMPBBCU", Ciphers.encryptVigenere("1YANGZHIXIAOSUNMENGYU", "1LOVE"));
    }

    @Test
    public void testDecryptVigenere() {
        Assert.assertEquals("", Ciphers.descryptVigenere("", "ABC"));
        Assert.assertEquals("1YANGZHIXIAOSUNMENGYU", Ciphers.descryptVigenere("1JOIKZSWSMAZGPRMPBBCU", "1LOVE"));
    }
}
