// TestOfTime
// Name: Liyabona Mpapela
// Student Number: MPPLIY002
// Date: 16 August 2023


import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class TestOfTime {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


              
   /**Check that a Time object does actually store the time value provided as a parameter during creation (by calling toString).**/  
   @Test public void test1(){
    Time t = new Time("03:09");
    Assert.assertEquals(t.toString(),"03:09:00");
   }
   /**Check that subtracting an earlier Time from a later Time produces a Duration of the correct length.**/
    @Test public void test2(){
      Time tA = new Time("17:59");
      Time tB = new Time("18:00");
      Assert.assertEquals(tB.subtract(tA).intValue("minute"),1);
    }
    
   /**Check that subtracting a Time from itself produces a zero duration**/
   @Test public void test3(){
    Time tA = new Time("3:09");
     Time tB = new Time("3:09");
     Assert.assertEquals(tB.subtract(tA).intValue("millisecond"),0);
    }
   /**Check that the intValue method works with a parameter of second**/
   @Test public void test4(){
     Time tA = new Time("3:09:01");
     Time tB = new Time("3:09:02");
     Assert.assertEquals(tB.subtract(tA).intValue("second"),1);
    }
     /**Check that the intValue method works with a parameter of millisecond**/
     @Test public void test5(){
      Time tA = new Time("00:00:00:00");
      Time tB = new Time("00:00:01:00");
      Assert.assertEquals(tB.subtract(tA).intValue("millisecond"),1000);

     }
     /**Check that the intValue  method works with a parameter of munite**/
     @Test public void test6(){
      Time tA = new Time("3:10");
      Time tB = new Time("3:15");
      Assert.assertEquals(tB.subtract(tA).intValue("minute"),5);
    }
    
     /**Check that the intValue method works with a parameter of hour**/
     @Test public void test7(){
      Time tA = new Time("3:09");
      Time tB = new Time("4:09");
      Assert.assertEquals(tB.subtract(tA).intValue("hour"),1);

     }
     
       
}
