package ProjectRoyalSundaram.steps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xmltest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\arili\\OneDrive\\Desktop\\ProjectRoyalSundaram\\ProjectRoyalSundaram\\ChromeDriver\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
File f = new File("D:\\Excel Read\\RoyalSundaram.xlsx");
FileInputStream loc = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(loc);
Sheet s = wb.getSheet("Sheet1");
Row urow = s.getRow(1);
Cell carNumberPlate = urow.getCell(0);
System.out.println(carNumberPlate);
int phoneNumber = (int)s.getRow(1).getCell(1).getNumericCellValue();
System.out.println(phoneNumber);
Row row2 = s.getRow(1);
Cell nameOfPerson = row2.getCell(2);
System.out.println(nameOfPerson);
Row row3 = s.getRow(1);
Cell emailOfPerson = row3.getCell(3);
System.out.println(emailOfPerson);
Row row4 = s.getRow(1);
Cell carEngineNumber = row4.getCell(4);
System.out.println(carEngineNumber);
Row row5 = s.getRow(1);
Cell carChassisNumber = row5.getCell(5);
System.out.println(carChassisNumber);
Row row6 = s.getRow(1);
Cell pollutionCertificateNumber = row6.getCell(6);
System.out.println(pollutionCertificateNumber);
	
	
	
	}}
