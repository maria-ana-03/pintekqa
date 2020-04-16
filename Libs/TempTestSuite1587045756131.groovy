import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/transaction')

suiteProperties.put('name', 'transaction')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/mariaana/Katalon Studio/Pintek.id/Reports/transaction/20200416_210236/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/transaction', suiteProperties, [new TestCaseBinding('Test Cases/transaction - Iteration 1', 'Test Cases/transaction',  [ 'postalCode' : '12345' , 'note' : 'success' , 'lastName' : 'name' , 'scenario' : 'pos' , 'firstName' : 'first' ,  ]), new TestCaseBinding('Test Cases/transaction - Iteration 2', 'Test Cases/transaction',  [ 'postalCode' : '12345' , 'note' : 'firstName empty' , 'lastName' : 'name' , 'scenario' : 'neg' , 'firstName' : '' ,  ]), new TestCaseBinding('Test Cases/transaction - Iteration 3', 'Test Cases/transaction',  [ 'postalCode' : '12345' , 'note' : 'lastName empty' , 'lastName' : '' , 'scenario' : 'neg' , 'firstName' : 'first' ,  ]), new TestCaseBinding('Test Cases/transaction - Iteration 4', 'Test Cases/transaction',  [ 'postalCode' : '' , 'note' : 'postalCode empty' , 'lastName' : 'name' , 'scenario' : 'neg' , 'firstName' : 'first' ,  ]), new TestCaseBinding('Test Cases/transaction - Iteration 5', 'Test Cases/transaction',  [ 'postalCode' : 'abcdef!@' , 'note' : 'postalCode using another character beside numeric ' , 'lastName' : 'name' , 'scenario' : 'neg' , 'firstName' : 'first' ,  ])])
