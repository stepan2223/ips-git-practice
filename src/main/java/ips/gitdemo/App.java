package ips.gitdemo;

public class App {

	private static final String MESSAGE = "Mensaje creado en la rama de conflicto";

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        System.out.println(getSaludo());
    }

    public static String getSaludo() {
        return "Hola desde una rama de trabajo";
    }
}
