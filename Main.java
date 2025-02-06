package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.management.RuntimeErrorException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println( " Hello World ");

        System.setProperty( " webdriver.crome.Driver "," src/main/resources/chromedriver.exe ");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get( "https://www.google.com/");
        String title = driver.getTitle();
        System.out.println(title);

        if (title.equals("Google")) {
            System.out.println("Title matches expected value: 'Google'");
        } else {
            System.out.println("Title does not match. Expected 'Google', but got: " + title);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}