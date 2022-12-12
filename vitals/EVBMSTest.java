package vitals;

public class EVBMSTest
{
   public static void EVBMStest()
   {
    EVBMSImpl evBMSImpl = new EVBMSImpl();
     System.out.println("batt cond->"+evBMSImpl.batteryIsOk(25, 70, 0.7f));
    assert(evBMSImpl.batteryIsOk(25, 70, 0.7f) == false);
 //  assert(evBMSImpl.batteryIsOk(50, 85, 0.0f) == false);
   } 
}
