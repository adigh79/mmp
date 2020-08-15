package org.iit.mmp.tests;

import java.util.HashMap;

import org.iit.mmp.adminmodule.SearchBySsn;
import org.iit.mmp.helper.HelperClass;
import org.iit.util.TestBase;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdminModuleTest extends TestBase {
	HelperClass helper;
	@Parameters({"uRl","uName","pWord","doctorName"})
	@Test(description="US_006, Validate Search Using SSN ",groups= {"sanity","regression","UI","adminmodule","US_006"})
	public void validateSearchUsingSsn(String uRl,String uName, String pWord,String doctorName) {
		
		helper = new HelperClass(driver);
		helper.launchAdminModule(uRl);
		helper.adminLogin(uName, pWord);
		helper.navigateToPatientModule("Patients");
		SearchBySsn ssn = new SearchBySsn(driver);
		HashMap<String,String> hMapAdm = ssn.createVisit(doctorName);
		helper.navigateToPatientModule("Patients");
		boolean result = ssn.validateAppointmentDetailsinAdminPage(hMapAdm);
		Assert.assertTrue(result);
		
		
		
	}

}


