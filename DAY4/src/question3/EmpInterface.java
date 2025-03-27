package question3;

public interface EmpInterface {
	void acceptData();
	void ShowData();
	//compulsory to override above methods
	int X = 10;
	//default methods -- not compulsory to override
	default void show() {
		System.out.print("Hello!")
	}
}
//Declaration ---- java
//definition or implements ---- Programmer
//methods Call or Invoke ---- java