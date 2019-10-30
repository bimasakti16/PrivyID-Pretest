<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>RegisterAccount</name>
   <tag></tag>
   <elementGuidId>247fafc8-6d6a-415a-8a59-2040f772437f</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\t\&quot;phone\&quot; : \&quot;${phone}\&quot;,\n\t\&quot;password\&quot; : \&quot;${password}\&quot;,\n\t\&quot;country\&quot; : \&quot;${country}\&quot;,\n\t\&quot;latlong\&quot; : \&quot;${latlong}\&quot;,\n\t\&quot;device_token\&quot; : \&quot;${device_token}\&quot;,\n\t\&quot;device_type\&quot; : \&quot;${device_type}\&quot;\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://pretest-qa.privydev.id/api/v1/register</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>19884ba6-d069-4da6-9f65-1bffe8d1490c</id>
      <masked>false</masked>
      <name>phone</name>
   </variables>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>da0aeff3-2c5f-4005-ae9a-daa55a89c8ce</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>87740c3c-d24d-435e-be10-5d1e252848ce</id>
      <masked>false</masked>
      <name>country</name>
   </variables>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>6ee325d5-3c28-4612-8685-26e196d422cc</id>
      <masked>false</masked>
      <name>latlong</name>
   </variables>
   <variables>
      <defaultValue>'1'</defaultValue>
      <description></description>
      <id>d92a8a06-6b09-4f36-ac73-5bbbc62bed1c</id>
      <masked>false</masked>
      <name>device_token</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>a55a14f9-a3f7-45a9-b083-917e491dd9ea</id>
      <masked>false</masked>
      <name>device_type</name>
   </variables>
   <variables>
      <defaultValue>GlobalVariable.base_url</defaultValue>
      <description></description>
      <id>d288d337-9024-4b6e-871a-d847964202d7</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
