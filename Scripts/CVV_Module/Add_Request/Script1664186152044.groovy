import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetValue as GetValue
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.DevURL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Sign In/UserName'), GlobalVariable.UserName_Credit_Appraiser)

WebUI.setText(findTestObject('Sign In/Password'), GlobalVariable.Credit_Appraiser_Password)

WebUI.click(findTestObject('Sign In/Signin_Button'))

WebUI.navigateToUrl(GlobalVariable.URL_Customer_Profile)

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('CVV_Module/Menu_risk'))

WebUI.click(findTestObject('CVV_Module/SubMenu_CCV'))

WebUI.setText(findTestObject('CVV_Module/Textbox_CCVFileNo'), findTestData('HDFC Automation Data (1)').getValue(2, 1))

WebUI.sendKeys(findTestObject('CVV_Module/Textbox_CCVFileNo'), Keys.chord(Keys.ENTER))

