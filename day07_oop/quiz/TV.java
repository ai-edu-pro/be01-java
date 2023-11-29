package day07_oop.quiz;
/*
 *  > 생성자함수(constructor method)
  - 클래스명과 동일하다
  - 리턴타입 없음 ( void 조차 사용하지 않음 )
  - 중복정의 가능함 ( overload 가능 - 중복함수 )
  -  default constructor 갖고 있음
    (단, 사용자가 생성자함수 재정의 하면 디폴트 생성자함수 기능 상실함 )
  - 멤버변수의 초기화 담당함
 */

public class TV {
    String color;
    int channel; 
    
    public TV() {  // default constructor
    	color = "gray";
    	channel = 11 ;
    }
    public TV(String color) {
    	this.color = color;
    }
    public TV(int channel) {
    	color = "pink";
    	this.channel = channel;
    }
    public TV(String color , int ch) {
    	this.color = color;
    	channel = ch;
    }
  
	// getter / setter method
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	// output 
	public void disp() {
		System.out.println("TV의 색상 : "+color + "\n현재 채널 : " +channel);
	}
}






