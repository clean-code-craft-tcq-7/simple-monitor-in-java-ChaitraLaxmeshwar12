package vitals;

public class EVBMSImpl
{
  
  public static boolean isBatteryParameterWithinLimits(float value,float lowerLimit, float upperLimit)
  {
    boolean result = true;
    if(value >= lowerLimit && value <= upperLimit) {
            result=false;
        }
    return result;
  }
  
  public static boolean isBattTemperatureinLimits(float temperature)
  {
    return (isBatteryParameterWithinLimits(temperature,EVBMSConstants.minTemperature,EVBMSConstants.maxTemperature));
  }
  
   public static boolean isBattSOCinLimits(float soc)
  {
    return (isBatteryParameterWithinLimits(soc,EVBMSConstants.minSoc,EVBMSConstants.maxSoc));
  }
         
  public static boolean isChargeRateinLimit(float chargeRate)
   {
      return (chargeRate >= EVBMSConstants.maxChargeRate);
   }
            
   public static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
     return (isBattTemperatureinLimits(temperature) && isBattSOCinLimits(soc) && isChargeRateinLimit(chargeRate));
   }
            
}
