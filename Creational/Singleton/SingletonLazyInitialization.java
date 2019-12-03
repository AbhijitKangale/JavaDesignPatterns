package Singleton;

public class SingletonLazyInitialization {

	private static SingletonLazyInitialization INSTANCE = null;

	private SingletonLazyInitialization() {

	}

	public static SingletonLazyInitialization getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonLazyInitialization.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonLazyInitialization();
				}
			}
		}
		return INSTANCE;
	}

	public static void main(String[] args) {

		SingletonLazyInitialization objectOne = getInstance();

		SingletonLazyInitialization objectTwo = getInstance();

		System.out.println(objectOne == objectTwo);
	}
}
