package kz.altyngul;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) throws IllegalArgumentException, NoSuchFieldException, SecurityException {
		Animal animal = new Animal() {
			@Override
			public String getGender() {
				return "male";
			}
		};
		System.out.println(animal.getGender());
		
		
		try {
			Object obj = Student.class.newInstance();

			
			Field field = obj.getClass().getDeclaredField("id");

			Field field1 = obj.getClass().getDeclaredField("name");
			field1.setAccessible(true);
			field1.set(obj, "Albert");
			field.setAccessible(true);
			field.set(obj, 5);
			System.out.println(field.get(obj) + " " + field1.get(obj));
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
