package curs12;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextFileProcessor txtFile=new TextFileProcessor();
		txtFile.writeTxt("Textul scris in fisier!\n");
		txtFile.readTxt();
		txtFile.updateTxtFile("Alt text in fisier");
		txtFile.readTxt();
	}

}
