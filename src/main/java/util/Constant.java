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
	
	public static String organisationAdministrator = "wofarid794@quipas.com";    
	public static String userAdministrator = "sayiwa8839@naymedia.com";
	public static String seniorTechnicalSupport = ""; //missing role in my org
	public static String schemeDesigner = ""; //missing role in my org
	public static String schemeManager = ""; //missing role in my org
	public static String schemeOwner = ""; //missing role in my org
	public static String assetAdministrator = ""; //missing role in my org
	public static String assetManager = ""; //missing role in my org
	public static String assetContributor = ""; //missing role in my org
	public static String UATassessmentAdministrator = "fegav96005@nmaller.com";
	public static String UATassessmentManager = "vojare3434@wiemei.com";
	public static String UATassessmentContributor = "hejobi9069@kkoup.com";
	public static String UATassessmentStakeholder = "yicakaw414@sportrid.com";
	public static String userPassword = "@Test123";
	public static String nameOfAsset;
	public static String nameOfCopiedAssetV2;
	
	/*Roles UAT - test123###
	Global Administrator - bre
	Organisation Administrator - wofarid794@quipas.com
	User Administrator - sayiwa8839@naymedia.com
	Assessment Administrator - fegav96005@nmaller.com 
	Assessment Manager - vojare3434@wiemei.com
	Assessment Contributor - hejobi9069@kkoup.com
	Assessment Stakeholder - yicakaw414@sportrid.com
	Asset Manager - yicakaw414@sportrid.com
	Asset Administrator - yicakaw414@sportrid.com
	*/
}