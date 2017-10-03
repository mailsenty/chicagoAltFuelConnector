
package org.mule.modules.chicagoaltfuel.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.chicagoaltfuel.ChicagoAltFuelConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>ChicagoAltFuelConnectorProcessAdapter</code> is a wrapper around {@link ChicagoAltFuelConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-02T10:28:00-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class ChicagoAltFuelConnectorProcessAdapter
    extends ChicagoAltFuelConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<ChicagoAltFuelConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, ChicagoAltFuelConnectorCapabilitiesAdapter> getProcessTemplate() {
        final ChicagoAltFuelConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,ChicagoAltFuelConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, ChicagoAltFuelConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, ChicagoAltFuelConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
