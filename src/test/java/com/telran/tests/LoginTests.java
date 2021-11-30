package com.telran.tests;

import com.telran.pages.LoginPage;
import org.junit.Before;
import org.junit.Test;

public class LoginTests {
    LoginPage login;

    @Before
    public void setUp() {
        login = new LoginPage();
    }

    @Test
    public void loginPositiveTest() {
        login.with("LisaAlisaLA@gmail.com", "LiAl12345~");
        login.validLogin();
    }

    @Test
    public void loginNegativeTest() {
        login.with("LisaAlisaLA@gmail.com", "LiAl12345");
        login.invalidLogin();
    }
}
