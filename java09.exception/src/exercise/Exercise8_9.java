package exercise;

public class Exercise8_9 {

//	[8-9] 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오.
//	[참고] 생성자는 실행결과를 보고 알맞게 작성해야한다.
	
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
		
	}

}

//		* 클래스명        : UnsupportedFuctionException
//		* 조상클래스명  : RuntimeException
//		* 멤버변수        :  
//		     이름    : ERR_CODE
//		     저장값 : 에러코드
//		     타입    : int
//		     기본값 : 100
//		     제어자 : final private

		
//		* 메서드          :
//		1. 메서드명    : getErrorCode
//		      기능          : 에러코드(ERR_CODE)를 반환한다.
//		      반환타입    : int
//		      매개변수    : 없음
//		      제어자       : public
              
		   
//		2. 메서드명    : getMessage
//		      기능          : 메세지의 내용을 반환한다. (Exception클래스의 getMessage( )를 오버라이딩)
//		      반환타입    : String
//		      매개변수    : 없음
//		      제어자       : public
		
class UnsupportedFuctionException extends RuntimeException{
	private int ERR_CODE = 100;
	
	UnsupportedFuctionException(String msg, int errCode){
		super(msg); // 조상의 생성자 RuntimeException (String msg) 호출
		
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg){
		this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화
	}

	public int getErrCode() {
		return ERR_CODE;
	}
	
	public String getMessage() { 
		return "[" + getErrCode() + "]" + super.getMessage();
		
	}


	}


