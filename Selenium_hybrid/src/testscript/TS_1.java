package testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericscript.Base_Test;
import genericscript.Generic_excel;
import pomscript.POM1;

public class TS_1 extends Base_Test
{
@Test
public void Script() throws EncryptedDocumentException, IOException
{
String username = Generic_excel.getdata("Sheet1", 0, 0);
String password = Generic_excel.getdata("Sheet1", 1, 0);
POM1 p = new POM1(driver);
p.email(username);
p.pass(password);
//Assert.fail();
p.login();
}
}
