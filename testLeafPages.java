package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class testLeafPages extends baseclass {

	String expectedTitle = "Leaftaps - TestLeaf Automation Platform";
String leadID, leadID1, companyName;
Set<String> allsetWindows;
List<String> alllisthandles;
Set<String> allsetWindows2;
List<String> alllisthandles2;
	/*@Given("Open the chrome browser")
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("Load the application url")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	} */
	
	@Given("enter the username as {string}")
	public void enter_the_username_as_username(String username)
	{
	    
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("enter the password as {string}")
	public void enter_the_password_as_password(String password) 
	{
		driver.findElement(By.id("password")).sendKeys(password);
	} 
	
	@Given("Click on Login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		String Actualresult = driver.getTitle();
		
		Assert.assertEquals(Actualresult, expectedTitle);
	}
	
	@Given("Homepage should be displayed")
	public void homePage()
	{
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);
	
	}
	
	@Given("Click on CRMSFA link")
	public void clickCRMSFA()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	
	}
	
	@Given("Click on Leads link")
	public void clickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
	
	}
	
	@Given("Click on CreateLeads link")
	public void createLeads()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	
	}

	@Given("Enter company name as {string}")
	public void companyName(String companyname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	
	}
	
	@Given("Enter first name as {string}")
	public void firstName(String firstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	
	}
	
	@Given("Enter last name as {string}")
	public void lastName(String lastname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	
	}
	
	@Given("Click on submit button")
	public void submitButton()
	{
		driver.findElement(By.name("submitButton")).click();
	
	}
	@When("Click on finfLead link")
	public void click_on_finf_leads_link() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("Click on Phonenumber")
	public void click_on_phonenumber() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter phonenumber as {string}")
	public void enter_phonenumber_as(String phonenumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phonenumber);
	}
	@Given("Click on findLead")
	public void click_on_find_leads() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@Given("get the elements using xpth")
	public void gettheElement()  {
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
	}
	
	@Given("Click the first list of element")
	public void firstlistofelement()  {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	@Given("Click on delete button")
	public void deletebutton() {
		driver.findElement(By.linkText("Delete")).click();
	}
	@Given("Click on findleads button again")
	public void findleadsbuttonagain() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Enter the lead id as {string}")
	public void leadid(String leadid) {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
	}
	
	@Given("Click on find button")
	public void findButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Given("Get the page info")
	public void getpage() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	@Given("Click on duplicate lead button")
	public void duplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	
	@Given("Click on submit as button")
	public void submitasButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Given("Click on Edit lead button")
	public void EditLead() {
		driver.findElement(By.linkText("Edit")).click();
	}
	
	@Given("Update company name as {string}")
	public void updateCompanyname(String companyname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyname);
	}

	@Given("Click on as submit as button")
	public void assubmitasbutton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@And("Click on MergeLeads link")
	public void mergeLeads() {

		driver.findElement(By.linkText("Merge Leads")).click();
	}

	@And("Click on FromLead widget")
	public void clickFromLeadWidget() {

		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		allsetWindows = driver.getWindowHandles();
		alllisthandles = new ArrayList<String>(allsetWindows);
		driver.switchTo().window(alllisthandles.get(1));
	}

	@And("Enter From FirstName as {string}")
	public void FromFirstName(String FromFName) {

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(FromFName);
	}

	@And("Click on FindLeads button for FromLead")
	public void FromFindLeadsButton() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	}

	@And("Click on First FromLead")
	public void FirstFromLead() {

		leadID1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(alllisthandles.get(0));
	}

	@And("Click on ToLead widget")
	public void ClickToLeadWidget() {

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		allsetWindows2 = driver.getWindowHandles();
		alllisthandles2 = new ArrayList<String>(allsetWindows2);
		driver.switchTo().window(alllisthandles2.get(1));
	}

	@And("Enter To FirstName as {string}")
	public void ToFirstName(String ToFName) {

		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(ToFName);
	}

	@And("Click on FindLeads button for ToLead")
	public void ToFindLeadsButton() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
	}

	@And("Click on First ToLead")
	public void FirstToLead() {

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(alllisthandles2.get(0));
	}

	@When("Click on Merge button")
	public void MergeButton() {

		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

	@Given("Click on FindLeads link after Merging")
	public void FindLeadsAfterMerge() {

		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Enter the From FirstLead ID")
	public void enterFromFirstLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID1);
	}

	@And("Click on FindLeads button for searching FirstLeadId")
	public void FindLeadsButtonAfterMerge() {

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Verify Merged record is available")
	public void MergeExpectedResult() {

		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

		driver.close();

	}

	@And("Click on Edit button")
	public void editLead() {

		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Update CompanyName as {string}")
	public void updateCompanyName(String comName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(comName);
		companyName = comName;
	}

	@And("Click on update button")
	public void clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify Updated record is available")
	public void EditExpectedResult() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		Assert.assertEquals(text, companyName);
		
		driver.close();

	}

	@And("Click on Duplicate Lead button")
	public void clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@And("Click on CreateLead button")
	public void clickCreateLeadButton1() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify Lead is created")
	public void DuplicateExpectedResult() {

		boolean displayed = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();

		Assert.assertTrue(displayed);

		driver.close();
	}
	
}
