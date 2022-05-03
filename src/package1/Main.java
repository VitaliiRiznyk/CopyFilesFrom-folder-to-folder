package package1;
import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		
		File folderIn = new File("E:\\Java OOP actual\\CopyFolder");
		File folderOut = new File("E:\\Java OOP actual\\CopyFolder1");		
		
		// we copy all .pdf files
		try {
			FileCopy.copyFilesPDF(folderIn, folderOut);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
