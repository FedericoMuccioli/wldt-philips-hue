package it.unibo.iot.wldt.philips;

import it.unibo.iot.wldt.philips.digital.DemoConfDigitalAdapter;
import it.unibo.iot.wldt.philips.digital.DemoDigitalAdapter;
import it.unibo.iot.wldt.philips.digital.DemoDigitalAdapterConfiguration;
import it.unibo.iot.wldt.philips.physical.DemoConfPhysicalAdapter;
import it.unibo.iot.wldt.philips.physical.DemoPhysicalAdapter;
import it.unibo.iot.wldt.philips.physical.DemoPhysicalAdapterConfiguration;
import it.wldt.core.engine.WldtEngine;


public class DemoDigitalTwin {

    public static void main(String[] args)  {
    	
    	
    	System.out.println("Hello");
    	
//        try{
//
//            WldtEngine digitalTwinEngine = new WldtEngine(new DemoShadowingFunction("test-shadowing-function"), "test-digital-twin");
//
//            //Default Physical and Digital Adapter
//            //digitalTwinEngine.addPhysicalAdapter(new DemoPhysicalAdapter("test-physical-adapter"));
//            //digitalTwinEngine.addDigitalAdapter(new DemoDigitalAdapter("test-digital-adapter"));
//
//            //Physical and Digital Adapters with Configuration
//            digitalTwinEngine.addPhysicalAdapter(new DemoConfPhysicalAdapter("test-physical-adapter", new DemoPhysicalAdapterConfiguration()));
//            digitalTwinEngine.addDigitalAdapter(new DemoConfDigitalAdapter("test-digital-adapter", new DemoDigitalAdapterConfiguration()));
//
//            digitalTwinEngine.startLifeCycle();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
