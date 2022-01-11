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
import org.openqa.selenium.By as By

import org.openqa.selenium.WebDriver as WebDriver

import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.logging.KeywordLogger

import com.kms.katalon.core.util.KeywordUtil


WebUI.openBrowser('')

WebUI.navigateToUrl('file:///C:/tester/mks/MKS/flagi.html')

WebUI.verifyElementVisible(findTestObject('Object Repository/img_Po agnielsku_maly'))

WebUI.verifyElementText(findTestObject('Object Repository/td_A'), 'A')

WebDriver driver = DriverFactory.getWebDriver()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> Rows = Table.findElements(By.tagName('tr'))


KeywordLogger log = new KeywordLogger()

table: for (int i = 0; i < Rows.size(); i++) {
	
	List<WebElement>	 Cols = Rows.get(i).findElements(By.tagName('td'))
	
	for (int j = 1; j < 2 && j<Cols.size() ; j++) {
		'test'
		String celltext = Cols.get(j).getText()
		
		if (celltext!=findTestData('TestDataFlagi').getValue('litera',i)){
			
						log.logFailed('Row: '+i+' Column: '+j+' Result Fail!')
			KeywordUtil.markFailed("One or more failed steps present. Check test report for details.")
			
		}
			
		
		}
		
	}



WebUI.verifyElementText(findTestObject('Object Repository/td_Alfa'), 'Alfa')

WebUI.verifyElementText(findTestObject('Object Repository/td_-'), '.-')

WebUI.verifyElementText(findTestObject('Object Repository/td_Mam nurka pod wod trzymajcie si z dala i_cd3551'), 'Mam nurka pod wodą; trzymajcie się z dala i idźcie powoli.')

WebUI.click(findTestObject('Object Repository/html_katalonfont-familymonospacefont-size13_6a6dcb'))

WebUI.verifyElementText(findTestObject('Object Repository/td_I have diver dowm keep well clear at slow speed'), 'I have diver dowm; keep well clear at slow speed.')

WebUI.rightClick(findTestObject('Object Repository/img_Po agnielsku_maly'))

