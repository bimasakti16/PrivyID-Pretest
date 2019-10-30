package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object base_url
     
    /**
     * <p>Profile default : json response save as string text</p>
     */
    public static Object json_string
     
    /**
     * <p></p>
     */
    public static Object json_response_code
     
    /**
     * <p></p>
     */
    public static Object input_text
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            base_url = selectedVariables['base_url']
            json_string = selectedVariables['json_string']
            json_response_code = selectedVariables['json_response_code']
            input_text = selectedVariables['input_text']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
