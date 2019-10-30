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
import Register

switch (GlobalVariable.json_response_code) {
	case 201 :
	if(WebUI.verifyMatch(GlobalVariable.json_response_code.toString(), expected_response_code.toString(), false, FailureHandling.STOP_ON_FAILURE)) {
		Register.verifyResponseCode201()
	}
	break
	
	case 200 :
	break
	
	case 401 :
	break
	
	case 403 :
	break
	
	case 404 :
	break
	
	case 406 :
	break
	
	case 408 :
	break
	
	case 409 :
	break
	
	case 422 :
	if(WebUI.verifyMatch(GlobalVariable.json_response_code.toString(), expected_response_code.toString(), false, FailureHandling.STOP_ON_FAILURE)) {
		Register.verifyResponseCode422()
	}
	break
	
	case 408 :
	break
	
	
}