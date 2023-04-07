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
    public static Object ServerURL
     
    /**
     * <p></p>
     */
    public static Object MailhogURL
     
    /**
     * <p></p>
     */
    public static Object AdminUser
     
    /**
     * <p></p>
     */
    public static Object AffiliateUser
     
    /**
     * <p></p>
     */
    public static Object CustomerEmail
     
    /**
     * <p></p>
     */
    public static Object IndividualSubs
     
    /**
     * <p></p>
     */
    public static Object FamilySubs
     
    /**
     * <p></p>
     */
    public static Object CustomerPassword
     
    /**
     * <p></p>
     */
    public static Object GeneralString
     
    /**
     * <p></p>
     */
    public static Object GeneralInt
     
    /**
     * <p></p>
     */
    public static Object GeneraliVisaPassword
     
    /**
     * <p></p>
     */
    public static Object PhotoFile
     
    /**
     * <p></p>
     */
    public static Object TurkeyeVisa
     
    /**
     * <p></p>
     */
    public static Object PrintedPhoto
     
    /**
     * <p></p>
     */
    public static Object PickUpPhoto
     
    /**
     * <p></p>
     */
    public static Object USRenewal
     
    /**
     * <p></p>
     */
    public static Object EmbReg
     
    /**
     * <p></p>
     */
    public static Object PaymentEndDate
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            ServerURL = selectedVariables['ServerURL']
            MailhogURL = selectedVariables['MailhogURL']
            AdminUser = selectedVariables['AdminUser']
            AffiliateUser = selectedVariables['AffiliateUser']
            CustomerEmail = selectedVariables['CustomerEmail']
            IndividualSubs = selectedVariables['IndividualSubs']
            FamilySubs = selectedVariables['FamilySubs']
            CustomerPassword = selectedVariables['CustomerPassword']
            GeneralString = selectedVariables['GeneralString']
            GeneralInt = selectedVariables['GeneralInt']
            GeneraliVisaPassword = selectedVariables['GeneraliVisaPassword']
            PhotoFile = selectedVariables['PhotoFile']
            TurkeyeVisa = selectedVariables['TurkeyeVisa']
            PrintedPhoto = selectedVariables['PrintedPhoto']
            PickUpPhoto = selectedVariables['PickUpPhoto']
            USRenewal = selectedVariables['USRenewal']
            EmbReg = selectedVariables['EmbReg']
            PaymentEndDate = selectedVariables['PaymentEndDate']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
