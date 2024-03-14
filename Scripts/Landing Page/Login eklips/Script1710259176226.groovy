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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://eklipse.gg/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Eklipse - Convert Your Twitch Stream  _ca4f16/a_Sign In'))

WebUI.navigateToUrl('https://app.eklipse.gg/login?from=https%3A%2F%2Feklipse.gg&_gl=1*1058i4o*_ga*NTI3MzE1MzA0LjE3MTAzMjM2Nzc.*_ga_WQX826KJ2T*MTcxMDMyMzY3Ni4xLjEuMTcxMDMyMzY4Ni41MC4wLjA.')

WebUI.setText(findTestObject('Object Repository/Page_Eklipse/input_OR_username'), 'nita.wulan04@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Eklipse/input_OR_password'), 'b3cAx3sZosKS3C2IBp0RVw==')

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Skip for now'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_StreamVideo'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/li_Live Stream'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/li_YouTube Highlights'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_TwitchKick Clips'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/li_Kick Clips'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Playlist'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Voice Command'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Content Publisher'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_TikTok'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Edited Clips'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Eklipse/select_NEWEST TO OLDESTOLDEST TO NEWEST'), 'asc', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Eklipse/select_ALLIN PROGRESSCONVERTED'), '2', true)

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Montages'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/li_Extended  Trimmed Clip'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Eklipse/select_ALLIN PROGRESSCONVERTED'), '1', true)

WebUI.click(findTestObject('Object Repository/Page_Eklipse/i_No New Notifications_ic-user'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Account Settings'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/button_Add Account'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/img_Accept_icon-close-modal float-right'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/i_No New Notifications_ic-user'))

WebUI.click(findTestObject('Object Repository/Page_Eklipse/span_Logout'))

WebUI.closeBrowser()

