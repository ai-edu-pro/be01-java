package quiz.Interface.ex02;

public class Air implements Trans {
	 
    @Override
    public void Move() {
        System.out.println("[ 비행기 ]"+"가 출발 합니다.");
    }
 
    @Override
    public void Stop() {
        System.out.println("[ 비행기 ]"+"가 도착 했습니다.");
    }
 
    @Override
    public String Name(String str) {
     return str;
    }
 
    @Override
    public double Speed(double fSpeed) {
        return fSpeed * accelerater;
    }
 
    @Override
    public void Proc() {
 
        try {
            Move();
            Thread.sleep(1000);  //  1/1000 ==> 1초 
            for(int n = 0; n < 3; n++)
            {    
                Thread.sleep(500);   // 0.5초
                System.out.println("accelerator: "+Speed(n));
            }
            Thread.sleep(500);
            Stop();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}
