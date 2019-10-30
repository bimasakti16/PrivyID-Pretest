import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import groovy.json.JsonSlurper as JsonSlurper

import internal.GlobalVariable

public class Register {

	public static String phone, country, latlong, device_token, device_type

	public static verifyResponseCode201 () {

		String str_device_type

		JsonSlurper slurper = new JsonSlurper()

		Map parsedJson = slurper.parseText(GlobalVariable.json_string)

		String json_phone = parsedJson.get('data').get('user').get('phone')

		String json_country = parsedJson.get('data').get('user').get('country')

		String json_latlong = parsedJson.get('data').get('user').get('latlong')

		String json_device_token = parsedJson.get('data').get('user').get('user_device').get('device_token')

		String json_device_type = parsedJson.get('data').get('user').get('user_device').get('device_type')

		def map = (Map)GlobalVariable.input_text

		switch (map.get('device_type')) {
			case 0 :
				str_device_type = "ios"
				break

			case 1 :
				str_device_type = "android"
				break

			case 2 :
				str_device_type = "web"
				break
		}

		if(WS.verifyMatch(json_phone, map.get('phone'), false, FailureHandling.CONTINUE_ON_FAILURE)) {
			WS.comment("phone passed!")
		} else {
			WS.comment("phone failed!")
		}

		if(WS.verifyMatch(json_country, map.get('country'), false, FailureHandling.CONTINUE_ON_FAILURE)) {
			WS.comment("country passed!")
		} else {
			WS.comment("country failed!")
		}

		if(WebUI.verifyMatch(json_latlong, map.get('latlong'), false, FailureHandling.CONTINUE_ON_FAILURE)) {
			WS.comment("latlong passed!")
		} else {
			WS.comment("latlong failed!")
		}

		if(WS.verifyMatch(json_device_token, map.get('device_token'), false, FailureHandling.CONTINUE_ON_FAILURE)) {
			WS.comment("device_token passed!")
		} else {
			WS.comment("device_token failed!")
		}

		if(WS.verifyMatch(json_device_type, str_device_type, false, FailureHandling.CONTINUE_ON_FAILURE)) {
			WS.comment("device_type passed!")
		} else {
			WS.comment("device_type failed!")
		}
	}

	public static verifyResponseCode422() {

		JsonSlurper slurper = new JsonSlurper()

		Map parsedJson = slurper.parseText(GlobalVariable.json_string)

		String json_error = parsedJson.get('error').get('errors')[0]

		WS.comment(json_error)
	}
}
