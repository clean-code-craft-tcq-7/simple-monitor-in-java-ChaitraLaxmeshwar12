package vitals;

public class EVBMSTest
{
   public static void EVBMStest()
   {
    EVBMSImpl evBMSImpl = new EVBMSImpl();
    assert(evBMSImpl.batteryIsOk(25, 70, 0.7f) == true);
    assert(evBMSImpl.batteryIsOk(50, 85, 0.0f) == false);
      
    assert(evBMSImpl.batteryIsOk(45, 85, 0.8f) == true);
    assert(evBMSImpl.batteryIsOk(0, 20, 0.8f) == true);
      
    assert(evBMSImpl.batteryIsOk(25, 60, 0.6f) == true);
    assert(evBMSImpl.batteryIsOk(25, 80, 0.9f) == false);
   } 
}
