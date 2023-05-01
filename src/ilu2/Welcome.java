package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		StringBuilder resultat = new StringBuilder();
		if(input== null || input.isEmpty() || input.isBlank()) {
			resultat.append("Hello, my friend");
		}else if(input.equals(input.toUpperCase())) {
			resultat.append("HELLO, "+input);
		}else if(input.split(",").length==2) {
			String[] name=input.split(",");
			resultat.append("Hello, "+name[0].substring(0, 1).toUpperCase() + name[0].substring(1)+", "+name[1].substring(0, 1).toUpperCase() + name[1].substring(1));
		}else if(input.split(",").length>2) {
			String[] names=input.split(",");
			resultat.append("Hello");
			for (String name : names) {
				resultat.append(", ");
				resultat.append(name.substring(0, 1).toUpperCase() + name.substring(1));
			}
			System.out.println(resultat.toString());
		}else{		
			resultat.append("Hello, "+input.substring(0, 1).toUpperCase() + input.substring(1));
		}
		return resultat.toString();
	}
}
