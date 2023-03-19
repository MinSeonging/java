Tv클래스를 선언한 것은 설계도를 작성한 것에 불과하므로 인스턴스를 생성해야 제품을 사용할 수 있다.

예제 java/Chapter6/TvTest.java
[TvTest.java](https://github.com/MinSeonging/java/blob/main/Chapter6/TvTest.java)

```java
class Tv {
	String color;
	boolean power;
	int channel;
	
	void power()	{ power = !power; }
	void channelUp()	{ ++channel; }
	void channelDown()	{ --channel; }
}

public class TvTest {

	public static void main(String[] args) {
		Tv t;						// Tv인스턴스를 참조하기 위한 변수 t를 선언
		t= new Tv();					// Tv인스턴스를 생성한다.
		t.channel = 7;					// Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();				// Tv인스턴스의 메서드 channelDown()을 호출한다.
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}

}
```
