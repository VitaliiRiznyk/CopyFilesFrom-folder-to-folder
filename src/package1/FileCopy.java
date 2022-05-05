package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void copyFilesPDF(File folderIn, File folderOut, String extension) throws IOException {
		File[] fileList = folderIn.listFiles();// create massive of files

		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory() == false) {
				if (fileList[i].getName().substring(fileList[i].getName().lastIndexOf("."))
						.equalsIgnoreCase(extension)) {
					String newFileName = folderOut.getAbsolutePath() + "\\" + fileList[i].getName();
					try (InputStream is = new FileInputStream(fileList[i]);
							OutputStream os = new FileOutputStream(newFileName)) {
						is.transferTo(os);
					}
				}
			}
		}
	}
}
