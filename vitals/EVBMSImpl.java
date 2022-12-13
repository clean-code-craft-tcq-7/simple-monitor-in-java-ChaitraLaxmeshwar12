package vitals;

public class EVBMSImpl
{
  
  public boolean isBatteryParameterWithinLimits(float value,float lowerLimit, float upperLimit)
  {
    boolean result = false;
    System.out.println("value->"+value);
    System.out.println("lowerLimit->"+lowerLimit);
    System.out.println("upperLimit->"+upperLimit);
    if(value >= lowerLimit && value <= upperLimit) {
            result=true;
        }
    System.out.println("result->"+result);
    return result;
  }
  
  public boolean isBattTemperatureinLimits(float temperature)
  {
    return (isBatteryParameterWithinLimits(temperature,EVBMSConstants.minTemperature,EVBMSConstants.maxTemperature));
  }
  
   public boolean isBattSOCinLimits(float soc)
  {
    return (isBatteryParameterWithinLimits(soc,EVBMSConstants.minSoc,EVBMSConstants.maxSoc));
  }
         
  public boolean isChargeRateinLimit(float chargeRate)
   {
       System.out.println("chargeRate->"+chargeRate);
       System.out.println(" max chargeRate->"+EVBMSConstants.maxChargeRate);
      return (chargeRate <= EVBMSConstants.maxChargeRate);
   }
            
   public boolean batteryIsOk(float temperature, float soc, float chargeRate) {
     System.out.println("temp->"+isBattTemperatureinLimits(temperature));
     System.out.println("soc->"+isBattSOCinLimits(soc));
     System.out.println("charge->"+isChargeRateinLimit(chargeRate));
     return (isBattTemperatureinLimits(temperature) && isBattSOCinLimits(soc) && isChargeRateinLimit(chargeRate));
   }
            
}
