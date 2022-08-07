package learnFromInterview;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.mozilla.javascript.ast.WhileLoop;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvFileReader {

	@Test
	void csvReader() throws CsvValidationException, IOException {
		
		CSVReader csvReader = new CSVReader(new FileReader("C:\\Users\\hiiiiii\\Desktop\\data.csv"));
		
		 String[] csvCell;
		 
		while((csvCell = csvReader.readNext()) != null)
		 {
			
			System.out.println(csvCell);
			
			 String cName = csvCell[0];
		//	 String cpasswod = csvCell[1];
		//	 String cFname = csvCell[2];
		//	 String clname = csvCell[3];
			 
			 
			 
			 
		 }
	}
	
	
	
}
