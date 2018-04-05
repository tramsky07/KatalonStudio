import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'loginToTgs.LoginToTgsApplication.applicationLogIn'()

WebUI.delay(3)

WebUI.click(findTestObject('Go_To_Contact_Page/a_layers'))

WebUI.delay(3)

WebUI.click(findTestObject('Go_To_Contact_Page/a_security            Traxon G'))

WebUI.delay(3)

WebUI.click(findTestObject('Go_To_Contact_Page/a_settings            Settings'))

WebUI.delay(3)

WebUI.click(findTestObject('Go_To_Contact_Page/span_contacts'))

WebUI.delay(3)

WebUI.click(findTestObject('Go_To_Contact_Page/button_ui-btn'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Contact_Information/input_contact-name'), 'Mart')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Contact_Information/input_contact-description'), 'Test Contact')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Contact_Information/input_contact-emaill-add-1'), 'jay.delemos@champ.aero')

WebUI.delay(3)

WebUI.click(findTestObject('Contact_Information/button_create contact'))

WebUI.delay(2)

WebUI.click(findTestObject('Contact_Information/i_add_circle'))

