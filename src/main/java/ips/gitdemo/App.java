package ips.gitdemo;

public class App {

	private static final String MESSAGE =
	        "Mensaje integrado tras resolver el conflicto";

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        System.out.println(getSaludo());
    }

    public static String getSaludo() {
        return "Hola desde una rama de trabajo";
    }
}
