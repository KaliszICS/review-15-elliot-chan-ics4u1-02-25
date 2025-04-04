import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.lang.reflect.Method;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void goodStringTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "bacdsfa");
         assertEquals(result, 1);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void goodStringTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "abcda");
         assertEquals(result, 0);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void goodStringTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "abcdefghiab");
         assertEquals(result, 1);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void goodStringTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "pqr");
         assertEquals(result, -1);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void goodStringTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "bacdefghipalop");
         assertEquals(result, 4);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void goodStringTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "abcdfedree");
         assertEquals(result, 5);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void goodStringTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class,};
         Method method = testClass.getDeclaredMethod("goodString", cArg);
         // Enter code here
         int result = (int)method.invoke(null, "abcdfghee");
         assertEquals(result, 7);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }
}
