package loginToTgs

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testcase.Variable
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI


public class LoginToTgsApplication {
	
	public void loginToApplication(String url, String email, String password, String customer){
		
		WebUI.openBrowser(url)
		WebUI.waitForPageLoad(20)
		WebUI.maximizeWindow()
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_Login/input_email'), email)
		WebUI.sendKeys(findTestObject('Object Repository/Page_Login/input_password'), password)
		WebUI.sendKeys(findTestObject('Object Repository/Page_Login/input_customer'), customer)
		WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign In'))
		
	}
	
	@Keyword
	public void applicationLogIn(){
		
		loginToApplication(GlobalVariable.url, GlobalVariable.email, GlobalVariable.password, GlobalVariable.customer)
		
	}

}
