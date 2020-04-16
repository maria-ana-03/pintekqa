import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment(note)

WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/label_Products'), 3)

WebUI.click(findTestObject('Object Repository/saucedemo/button_ADD TO CART'))

String itemOnCart = WebUI.getText(findTestObject('Object Repository/saucedemo/label_numberOfItem'))

WebUI.verifyNotMatch(itemOnCart, '0', false)

WebUI.click(findTestObject('Object Repository/saucedemo/button_cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/label_Your Cart'), 3)

WebUI.click(findTestObject('Object Repository/saucedemo/button_checkout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/label_Checkout Your Information'), 3)

WebUI.setText(findTestObject('Object Repository/saucedemo/input_firstName'), firstName)

WebUI.setText(findTestObject('Object Repository/saucedemo/input_lastName'), lastName)

WebUI.setText(findTestObject('Object Repository/saucedemo/input_postalCode'), postalCode)

WebUI.click(findTestObject('Object Repository/saucedemo/button_continue'))

if (scenario == 'pos') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/label_Checkout Overview'), 3)

    WebUI.click(findTestObject('Object Repository/saucedemo/button_finish'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/label_THANK YOU FOR YOUR ORDER'), 0)
} else if (scenario == 'neg') {
    WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/alert'), 3)
}

WebUI.takeScreenshot()

WebUI.delay(1)

