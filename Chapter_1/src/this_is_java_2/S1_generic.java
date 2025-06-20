package this_is_java_2;

public class S1_generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ContainerExample0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container0<String> container1 = new Container0<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);
		
		Container0<Integer> container2 = new Container0<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);
	}
}

class Container0<T> {
	private T name;
	
	public void set(T name) {
		this.name = name;
	}
	
	public T get() {
		return name;
	}
}

//

 class ContainerExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container1<String, String> container1 = new Container1<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job1 = container1.getValue();
		System.out.println(name1 + job1);
		
		Container1<String, Integer> container2 = new Container1<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int job2 = container2.getValue();
		System.out.println(name2 + job2);
	}
}

 class Container1<T, S> {
	private T name0;
	private S name1;
	
	public void set(T name0, S name1) {
		this.name0 = name0;
		this.name1 = name1;
	}
	
	public T getKey() {
		return name0;
	}
	
	public S getValue() {
		return name1;
	}
}

 //
 
 class UtilExample0 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pair<String, Integer> pair = new Pair<String, Integer>("홍길동", 35);
			Integer age = Util.getValue(pair, "홍길동");
			System.out.println(age);
			
			ChildPair<String, Integer> childPair = new ChildPair<String, Integer>("홍삼원", 20);
			Integer childAge = Util.getValue(childPair, "홍삼순");
			System.out.println(childAge);
			
			//OtherPair<String, Integer> otherPair = new OtherPair◇("홍삼원", 20);
			//Integer otherAge = Util.getValue(otherPair, "홍삼순");
			//System.out.println(otherAge);
		}
	}
 
  class Pair<T, S> {
	 private T t;
	 private S s;
	  
	  Pair(T t, S s){
		  this.t = t;
		  this.s = s;
	  }
	  
	  T getKey() { return t;}
	  S getValue() {return s;}
	  
  }
  
  class ChildPair<T, S> extends Pair<T, S>{
	  ChildPair(T t, S s){
		  super(t, s);
	  }
  }
  
  class Util {
	  static <T, S> S getValue(Pair<T, S> p1, T t){
		  
		  if(p1.getKey().equals(t)) {
			  S s = p1.getValue();
			  return s;
		  } else {
			  return null;
		  }
	  }
  }
 
/* 제네릭
 *  - 컴파일 과정에서 잘못 사용된 타입 수정
 *  - 클래스를 설계할 때 구체적인 타입을 명시하지 않고, 사용될 때 구체적인 타입을 지정함으로써 타입 변환을 최소화시킨다.
 *  제네릭 타입
 *  - 인터페이스와 클래스 뒤에 "<타입 파라미터>" 부호를 사용한다.
 *  멀티 타입 파라미터
 *  - class<T, K...>
 *  제네릭 메소드
 *  - <T> 리턴타입 매소드명(T t)
 *  - 리턴(T) 변수 = <T>메소드명(T t)
 *  제한된 타입 파라미터
 * - <T extends 최상위타입>
 *  와일드 타입
 * - 제네릭타입<?>: 모든 클래스나 인터페이스
 * - 제네릭타입<? extends 상위타입>: 상위타입과 그 하위타입
 * - 제네릭타입<? extends 하위타입>: 하위타입과 그 상위타입
 *  제네릭 타입의 상속과 구현
 */
 