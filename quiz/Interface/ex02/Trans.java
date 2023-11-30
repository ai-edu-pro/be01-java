package quiz.Interface.ex02;

public interface Trans {
	
	String name = " ";
	double accelerater = 0.1f;

	public void Move();

	public void Stop();

	public double Speed(double fSpeed);

	public String Name(String str);

	public void Proc();
}
