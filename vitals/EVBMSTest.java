package vitals;

public class EVBMSTest
{
  
   public static void EVBMStest()
   {
   assert(EVBMSImpl.batteryIsOk(25, 70, 0.7f) == true);
   assert(EVBMSImpl.batteryIsOk(50, 85, 0.0f) == false);
   } 
}
