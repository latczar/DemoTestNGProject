package util;

import base.CommonFunctions;

public class Constant extends CommonFunctions {
	
	
	/*Environment details:

		Dev Env:  https://wa-breeam-platform-dev-uksouth-001.azurewebsites.net/
		Test Env: https://wa-breeam-platform-test-uk-south-001.azurewebsites.net/
		UAT Env: https://wa-breeam-platform-uat-uk-south-001.azurewebsites.net/
	
		Legacy Application: http://10.150.12.110/breeam3/projects/admin/login.jsp
		Lighthouse Application : https://platform.breeam.com/assets
		
		AzureOps : https://dev.azure.com/BreGroup/
	*/
	
	public static String username;
	public static String password;
	public static String selfSignUpUsername;
	public static String selfSignUpPassword;
	public static String selfSignUpVerificationCode;
	public static final String ProjectPath = System.getProperty("user.dir");
	
	public static String organisationAdministrator = "";    
	public static String userAdministrator = "";
	public static String seniorTechnicalSupport = "";
	public static String schemeDesigner = "";
	public static String schemeManager = "";
	public static String schemeOwner = "";
	public static String assetAdministrator = "";
	public static String assetManager = "";
	public static String assetContributor = "";
	public static String assessmentAdministrator = "";
	public static String assessmentManager = "";
	public static String assessmentContributor = "";
	public static String assessmentStakeholder = "";
	public static String userPassword = "";
}