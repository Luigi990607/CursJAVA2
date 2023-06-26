package curs12;

public class TestJSONFileProcessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JsonFileProcessor obj = new JsonFileProcessor();
		obj.writeJsonFile();
		obj.readJson("name");
		obj.readJson("listaObiecte");
		obj.readJson("email");
		System.out.println("--------------------");
		obj.updateJsonFile("email", "altEmail");
		System.out.println("email after update: ");
		obj.readJson("email");
		
		obj.deleteFromJson("email");
		System.out.println("Email after delete: ");
		obj.readJson("email");
	}

}
