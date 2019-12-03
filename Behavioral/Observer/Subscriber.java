package Observer;

public class Subscriber {

	private String name;
	private Channel channel = new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update() {
		System.out.println("Hay " + name + " New Vedio Uploaded.");
	}

	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
}
