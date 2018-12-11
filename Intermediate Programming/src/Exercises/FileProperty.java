import java.io.File;
public class FileProperty {

	public static void main(String[] args) {

		File file = new File("Hamlet.txt");
		System.out.println("Does the file exist? " +  file.exists()  );
		System.out.println("File size is " +  file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canRead());
		System.out.println("Is this a directory? " + file.isDirectory());
		System.out.println("Absolute path of this file is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified())); 
		
		
		
	}

}
