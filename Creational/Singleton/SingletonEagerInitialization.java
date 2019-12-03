package Singleton;

public class SingletonEagerInitialization {

	private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

	private SingletonEagerInitialization() {

	}

	public static SingletonEagerInitialization getInstance() {
		return INSTANCE;
	}

	public static void main(String[] args) {

		SingletonEagerInitialization objectOne = getInstance();

		SingletonEagerInitialization objectTwo = getInstance();

		System.out.println(objectOne == objectTwo);
	}
}
