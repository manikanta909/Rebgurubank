package com.banking.scripts;

public class Basicscript {

	public static void main(String[] args) {
		
		String  Actval,Expval;
		//open browser
				WebDriver driver =new ChromeDriver();
				//maximise
				driver.manage().window().maximize();
		        	
			driver.get("http://www.demo.guru99.com/V4/");
			//login
			Expval="Customer Registered Successfully!!!";
			driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mngr230506");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("zeqYmUm");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			//new customer
			driver.findElement(By.xpath("//a[contains(.,'New Customer')]")).click();
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("xyzabc");
			driver.findElement(By.xpath("//input[contains(@value,'f')]")).click();
			driver.findElement(By.xpath("//input[contains(@id,'dob')]")).sendKeys("05/22/1997");
			driver.findElement(By.xpath("//textarea[contains(@cols,'20')]")).sendKeys("sbibank");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("hyderabad");
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TS");
			driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("500001");
			driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("2134567890");
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("a2021c2c3@gmail.com");
			driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			Actval = driver.findElement(By.xpath("//p[@class='heading3'][contains(.,'Customer Registered Successfully!!!')]")).getText();
		      
			//comparision
			if(Expval.equalsIgnoreCase(Actval)) {
				System.out.println("customer registered");
				
			}else {
				System.out.println("customer not registerd");
			}
			Thread.sleep(5000);
			//home btn
			driver.findElement(By.partialLinkText("Home")).click();
			
			//edit customer
			Expval ="Customer details updated Successfully!!!";
			driver.findElement(By.xpath("//a[@href='EditCustomer.php']")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("99364");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			//change telephone num
			driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		    Actval =  driver.findElement(By.xpath("//p[contains(@class,'heading3')]")).getText();
			System.out.println(Actval);
			if (Expval.equalsIgnoreCase(Actval)) {
				System.out.println("customer acnt edited");
			}else {
				System.out.println("customer acnt not edited");
				
			}
			driver.findElement(By.xpath("//a[contains(.,'Home')]")).click();
			
			
			
			}

		
	  




	     }








	}

}
