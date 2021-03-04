package kz.altyngul;

public interface Animal {
	default void music() {
		System.out.println("not have a music");
	}
	public String getGender();
}
