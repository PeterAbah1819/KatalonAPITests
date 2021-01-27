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



//Send a request to the restful API and whatever response we get should be stored in 'Response'
Response = WS.sendRequest(findTestObject('User/GetUserDetails'))

//Verify that what we got from the request that was stored in 'Response' was a 200 response
WS.verifyResponseStatusCode(Response, 200)

//Verify that the name Janet is what is stored in the first name
WS.verifyElementPropertyValue(Response, 'data.first_name', 'Janet')

//Verify that the name Weaver is what is stored in the Last name
WS.verifyElementPropertyValue(Response, 'data.last_name', 'Weaver')

//Verify that the email janet.weaver@reqres.in is what is stored in the email
WS.verifyElementPropertyValue(Response, 'data.email', 'janet.weaver@reqres.in')

WS.comment('Passed Beeshes!')

WS.comment('Sorry')



