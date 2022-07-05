package testcases;
import java.io.File;
import java.io.IOException;

import java.net.URL;

import org.openqa.selenium.By;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import org.testng.annotations.Test;

public class winiumtest {
public static WiniumDriver vision=null;
	
@Test
public static void test() throws InterruptedException, IOException {  //main(String[] args) throws MalformedURLException {

	
	 
	String path = new File("MES\\SQA-Vision\\SQA-Vision.exe").getAbsolutePath();
	DesktopOptions option= new DesktopOptions();
	option.setApplicationPath(path);

	// Start the WinAppDriver Programmatically
	   
	//
	String command = new File("WiniumDriver\\Winium.Desktop.Driver.exe").getAbsolutePath(); 
    ProcessBuilder builder = new ProcessBuilder(command).inheritIO();
    Process process = builder.start();	

	
vision = new WiniumDriver(new URL("http://localhost:9999"), option);
System.out.print("*******Local host is run and software is opened*******");
Thread.sleep(20000); 
Thread.sleep(20000); 
//Find vision elements
var userName = vision.findElement(By.id("txtUser"));
userName.sendKeys("administrator");
Thread.sleep(10000); 
var password = vision.findElement(By.id("txtPass"));
password.sendKeys("fertility");
Thread.sleep(20000); 
vision.findElement(By.id("bOK")).click();
Thread.sleep(20000); 
System.out.print("Hi");

Thread.sleep(20000); 

vision.findElement(By.id("frmHome")).click();
Thread.sleep(10);
vision.findElement(By.id("B_6")).click();
Thread.sleep(20000);

vision.findElement(By.id("B_B_Patients")).click();
Thread.sleep(1000);
vision.findElement(By.id("C_AgeTest")).click();
Thread.sleep(1000);
vision.findElement(By.id("B_B_Save")).click();


}
}
