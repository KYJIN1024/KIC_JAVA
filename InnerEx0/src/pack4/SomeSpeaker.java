package pack4;

public interface SomeSpeaker {
	void sayHello();
}

public class AnonymousInnerTest{
	public void useSpeaker(SomeSpeaker speaker) {
		speaker.sayHello();
	}
}
