package ips.gitdemo;

public class App {

	private static final String MESSAGE =
	        "squash otro";

    public static void main(String[] args) {
        System.out.println(MESSAGE);
        System.out.println(getSaludo());
    }

    public static String getSaludo() {
        return "Saludo";
    }
}
