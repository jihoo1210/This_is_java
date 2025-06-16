package This_is_java_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Example_API_1 {
	private String num;
	
	public Example_API_1(String num) {
		this.num = num;
	}
	
	public String getNum() {
		return num;
	}
	
	// 같은 객체로 취급되기 위해서 Strig의 경우 컴퓨터가 같은 해쉬값과 같은 번지를 지닌다고 인식해야 한다.
	// 그렇기에 해쉬값 설정과 equals 모두 오버라이딩해야 한다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Example_API_1) {
			Example_API_1 example_api_1 = (Example_API_1) obj;
			if(num.equals(example_api_1.num)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return num.hashCode();
	}
	
}

class StudentExample {
	public static void main(String[] args) {
		// Example_API_1 키로 총점을 저장하는 hashMap 객체 생성
		HashMap<Example_API_1, String> hashMap = new HashMap<Example_API_1, String>();
	
		hashMap.put(new Example_API_1("1"), "95");
		
		//새로운 객체(new)라도 이전의 객체와 같은 객체로 인식시켜야 한다.
		String score = hashMap.get(new Example_API_1("1"));
		System.out.println("점수: "+ score);
	}
}

class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//객체의 문자 정보를 리턴하는 역할을 한다.
	//기본적으로 클래스명@16진수해시코드를 리턴하지만 오버라이딩을 통해 실용적인 정보를 리턴하도록 할 수 있다.
	@Override
	public String toString() {
		return id + ": " + name;
	}
}

class MemberExample {
	public static void main(String[] args) {
		Member member = new Member("blue", "jihoo");
		System.out.println(member);
		//결과: 'blue: jihoo'
	}
}

class ByteToStringExamle{
	public static void main(String[] args) {
		byte[] bytes = { 73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		
		//문자열로 변환
		String str = new String(bytes);
		System.out.println(str);
	}
}

class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "자바 언어로 개발된 프로그램";
		//해당 문자열이 포함되어 있지 않으면 -1을 리턴하는 메소드
		int index = str.indexOf("자바");
		if (index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않음.");
		} else {
			System.out.println("자바 문자열이 포함되어 있음");
			str = str.replace("자바", "java");
			System.out.println("-->" + str);
		}
	}
}

class SplitExample {
	public static void main(String[] args) {
		String str = " 아이디, 이름, 패스워드";
		
		//부분 문자열을 추출하는 메소드
		String[] Ac1 = str.split(",");
		for(String name : Ac1) {
			System.out.println(name);
		}
		
		System.out.println("");
		
		//count, next, hasMore 메소드를 사용하려면 우선 Tokenizer 객체를 생성해야 한다.
		StringTokenizer Ac2 = new StringTokenizer(str, ",");
		int countTokens = Ac2.countTokens();
		for(int i = 0; i < countTokens; i++) {
			String token = Ac2.nextToken();
			System.out.println(token);
		}
		
		//토큰(문자열)을 가지고 있는지 검사하는 메소드.
		while(Ac2.hasMoreTokens()) {
			String token = Ac2.nextToken();
			System.out.println(token);
		}
	}
}

class StringBuilderExample{
	public static void main(String[] args) {
		String str = "";
		for(int i = 0; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
		
		//객체를 새로 생성하지 않고 하나의 객체를 수정하는 방법으로
		StringBuilder str1 = new StringBuilder();
		for(int i = 0; i <= 100; i++) {
			//문자열 끝에 매개값을 추가하는 StringBuilder 메소드
			str1.append(i);
		}
		System.out.println(str);
	}
}

class PatternMatcherExample{
	public static void main(String[] args) {
		String id = "a0123456789b";
		//정규 표현식을 통한 표현식 제한 방법
		String regExp = "[a-zA-Z]\\w{8,12}";
		//Pattern 클래스로 정규 표현식과 표현식의 일치를 검사한다.
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("id를 사용할 수 있습니다.");
		} else {
			System.out.println("id를 사용할 수 없습니다.");
		}
	}
}

class StringConvertExample {
	public static void main(String[] args) {
		//String 타입을 정수로 변경
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(intData1);
		
		//정수를 String 타입으로 변경
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2);
		
	}
}

class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(now));
		
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(date1.format(now));
	}
}


