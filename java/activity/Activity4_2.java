package JavaActivity1.java.activity;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) throws IOException {
		try {
		// TODO Auto-generated method stub
		File file1 = new File("C:\\Users\\DurgaKundu\\eclipse-workspace\\file.txt");
		boolean fStatus = file1.createNewFile();
		if(fStatus) {
            System.out.println("File created successfully!");
        } else {
            System.out.println("File already exists at this path.");
        }
            File fileUtil = FileUtils.getFile("C:\\Users\\DurgaKundu\\eclipse-workspace/newfile.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File destDir = new File("resources");
            FileUtils.copyFileToDirectory(file1, destDir);

            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
         	}catch(IOException errMessage) {
            System.out.println(errMessage);
        }		

	}

}
