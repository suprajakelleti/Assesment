package automation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	 String url="https://yocket.com/college-finder";
     WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("Webdriver.ie.Driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application");
	    driver=new InternetExplorerDriver();
        driver.get(url);   
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
	}
    
	public Test()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div[1]/a[2]/button")).click();
		
		WebElement country=driver.findElement(By.xpath("//*[@id=\"vs1__combobox\"]/div[1]/input"));
		country.click();
		Select from=new Select(country);
		from.selectByIndex(0);
		
        WebElement major=driver.findElement(By.xpath("//*[@id=\"vs2__combobox\"]/div[1]/input"));
		
		if( !major.isEnabled())
			major.click();
			major.sendKeys("d");
		    Select course=new Select(major);
		    course.selectByIndex(0);
		
	   Select defaultcourse=new Select(major);
	   defaultcourse.selectByIndex(0);
		
		//click next
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[3]/div/main/div/div/div/span/form/div[2]/div[2]/button")).click();
		
		WebElement college=driver.findElement(By.xpath("//*[@id=\"vs10__combobox\"]/div[1]/input"));
		
		if( !college.isEnabled())
			college.click();
			college.sendKeys("m");
		    Select name=new Select(college);
		    name.selectByIndex(0);
		
	   Select defaultname=new Select(college);
	   defaultname.selectByIndex(0);
		
	   WebElement majorcourse=driver.findElement(By.xpath("//*[@id=\"vs10__combobox\"]/div[1]/input"));
		
		if( !majorcourse.isEnabled())
			majorcourse.click();
			majorcourse.sendKeys("da");
		    Select coursename=new Select(majorcourse);
		    coursename.selectByIndex(1);
		
	   Select defaultcoursename=new Select(majorcourse);
	   defaultcoursename.selectByIndex(0);
		
	   WebElement marks=driver.findElement(By.id("marks_type"));
	   
	   Select marksformat=new Select(marks);
	   marksformat.selectByIndex(0);
	   
	   driver.findElement(By.name("marks")).sendKeys("100");
	   
	   driver.findElement(By.name("marks")).clear();
	   
	   driver.findElement(By.name("marks")).sendKeys("4");
	   
	   Select marksformat2=new Select(marks);
	   marksformat2.selectByIndex(1);
	   
	   driver.findElement(By.name("marks")).sendKeys("e");
	   
	   driver.findElement(By.name("marks")).clear();
	   
	   driver.findElement(By.name("marks")).sendKeys("400");
	   
	   Select marksformat3=new Select(marks);
	   marksformat3.selectByIndex(1);
	   
	   driver.findElement(By.name("marks")).sendKeys("7");
	   
	   driver.findElement(By.name("marks")).clear();
	   
	   driver.findElement(By.name("marks")).sendKeys("4");
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[2]/div[2]/button")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[2]/div[2]/button")).click();
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[1]/div[2]/div/div[1]/div[2]/div[1]/div")).click();
	   
	   
	   driver.findElement(By.id("toefl_overall_score")).sendKeys("-1");
	   
	   driver.findElement(By.id("toefl_overall_score")).clear();
	   
	   driver.findElement(By.id("toefl_overall_score")).sendKeys("100");
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[1]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div")).click();
	   
	   
       driver.findElement(By.id("verbal_score")).sendKeys("129");
	   
	   driver.findElement(By.id("verbal_score")).clear();
	   
	   driver.findElement(By.id("verbal_score")).sendKeys("130");
	  	   
       driver.findElement(By.id("quant_score")).sendKeys("-1");
	   
	   driver.findElement(By.id("quant_score")).clear();
	   
	   driver.findElement(By.id("quant_score")).sendKeys("130");
	   
       driver.findElement(By.id("awa_score")).sendKeys("-0.5");
	   
	   driver.findElement(By.id("awa_score")).clear();
	   
	   driver.findElement(By.id("awa_score")).sendKeys("5.5");
	   
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[2]/div[2]/button")).click();
	   try {
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/span/span/span[1]")).click();
	   }
	   catch(Exception e){
		   System.out.println(e.getMessage());
		   
	   }
	   driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/main/div/div/div/span/form/div[2]/div[2]/button")).click();
		
           WebElement sort=driver.findElement(By.xpath("//*[@id="__layout"]/div/div[3]/div/main/div/div/div/div[3]/div[1]/div/select"));
		sort.click();
		Select select=new Select(sort);
		select.selectByIndex(1);

	   //shortlist
	   driver.findElement(By.xpath("//*[@id="__layout"]/div/div[3]/div/main/div/div/div/div[3]/div[2]/div[1]/div[1]/span/span/span[2]/svg")).click();
          
	}
	@After
	public void tearDown() {
		driver.close();
	}

}
