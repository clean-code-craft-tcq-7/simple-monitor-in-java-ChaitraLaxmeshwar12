package vitals;

public class EVBMSImpl
{
  
  public static boolean isBatteryParameterWithinLimits(float value,float lowerLimit, float upperLimit)
  {
    if(value >= lowerLimit && value <= upperLimit) {
            return false;
        }
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
      if(chargeRate >= EVBMSConstants.maxChargeRate)
        return false;
   }
            
   public static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
     return (isBattTemperatureinLimits(temperature) && isBattSOCinLimits(soc) && isChargeRateinLimit(chargeRate));
   }
            
}
