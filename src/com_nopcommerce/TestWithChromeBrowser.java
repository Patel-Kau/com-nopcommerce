package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestWithChromeBrowser {

    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        WebDriver driver = new ChromeDriver();  // Creation of Chrome browser object
        driver.get(baseurl);                // Load the URL to the browser
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // Gave implicit wait
        driver.manage().window().maximize();        // Maximize the browser window
        System.out.println(driver.getTitle());   // Print the title
        System.out.println(driver.getCurrentUrl());     // Print the Current URL
        System.out.println(driver.getPageSource());     // Print the page source
        driver.findElement(By.name("Email")).sendKeys("Kaushikpatel@hatmail.com");  // Enter the email address in username field
        driver.findElement(By.id("Password")).sendKeys("12345678");         // Enter the Password in the password field

        driver.close();     //Close the browser

    }
}
