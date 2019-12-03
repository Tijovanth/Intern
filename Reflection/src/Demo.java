import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//import java.text.DateFormat.Field;

public class Demo {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
     Test obj = new Test();
     Class cls = obj.getClass();
//      System.out.println(cls.getName());
//      Constructor constructor = cls.getConstructor();
//      System.out.println(constructor.getName());
//      System.out.println(constructor.getModifiers());
//     // System.out.println(cls.getMethod("method"));
      Method[] methods = cls.getMethods();
      for(Method method: methods)
      {
    	  System.out.println(method.getName());
//    	  System.out.println(method.getModifiers());
//    	  System.out.println(method.getParameterCount());
      }
      Method methodobj = cls.getDeclaredMethod("method2", int.class);
      methodobj.invoke(obj, 1);
      Method methodobj1 = cls.getDeclaredMethod("method1");
      methodobj1.invoke(obj);
      java.lang.reflect.Field field = cls.getDeclaredField("s");
      field.setAccessible(true);
      field.set(obj,1223);
      System.out.println(obj.s);
	}
}
