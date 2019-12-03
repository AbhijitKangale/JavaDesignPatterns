package Observer;

public class Youtube {

	public static void main(String args[]) {

		Channel pewDiePie = new Channel();

		Subscriber s1 = new Subscriber("Mark");
		Subscriber s2 = new Subscriber("Allen");
		Subscriber s3 = new Subscriber("Bobby");
		Subscriber s4 = new Subscriber("Ben");
		Subscriber s5 = new Subscriber("Rocky");

		pewDiePie.subscribe(s1);
		pewDiePie.subscribe(s2);
		pewDiePie.subscribe(s3);
		pewDiePie.subscribe(s4);
		pewDiePie.subscribe(s5);

		s1.subscribeChannel(pewDiePie);
		s2.subscribeChannel(pewDiePie);
		s3.subscribeChannel(pewDiePie);
		s4.subscribeChannel(pewDiePie);
		s5.subscribeChannel(pewDiePie);

		pewDiePie.upload("You Lose You Laugh");
	}
}
