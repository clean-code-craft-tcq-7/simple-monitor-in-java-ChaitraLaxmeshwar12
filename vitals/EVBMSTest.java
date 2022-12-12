package vitals;

public class EVBMSTest
{
   private static EVBMSImpl evBMSImpl;
   public static void EVBMStest()
   {
   assert(evBMSImpl.batteryIsOk(25, 70, 0.7f) == true);
 //  assert(evBMSImpl.batteryIsOk(50, 85, 0.0f) == false);
   } 
}
