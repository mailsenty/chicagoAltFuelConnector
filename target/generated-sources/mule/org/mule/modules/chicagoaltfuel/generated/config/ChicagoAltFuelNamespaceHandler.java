
package org.mule.modules.chicagoaltfuel.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/chicago-alt-fuel</code>.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.9.0", date = "2017-10-02T10:28:00-04:00", comments = "Build UNNAMED.2793.f49b6c7")
public class ChicagoAltFuelNamespaceHandler
    extends NamespaceHandlerSupport
{

    private static Logger logger = LoggerFactory.getLogger(ChicagoAltFuelNamespaceHandler.class);

    private void handleException(String beanName, String beanScope, NoClassDefFoundError noClassDefFoundError) {
        String muleVersion = "";
        try {
            muleVersion = MuleManifest.getProductVersion();
        } catch (Exception _x) {
            logger.error("Problem while reading mule version");
        }
        logger.error(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [chicago-alt-fuel] is not supported in mule ")+ muleVersion));
        throw new FatalBeanException(((((("Cannot launch the mule app, the  "+ beanScope)+" [")+ beanName)+"] within the connector [chicago-alt-fuel] is not supported in mule ")+ muleVersion), noClassDefFoundError);
    }

    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        try {
            this.registerBeanDefinitionParser("config", new ChicagoAltFuelConnectorConnectorConfigConfigDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("config", "@Config", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-on-long", new FindOnLongDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-on-long", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-on-lattitude", new FindOnLattitudeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-on-lattitude", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-on-zip", new FindOnZipDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-on-zip", "@Processor", ex);
        }
        try {
            this.registerBeanDefinitionParser("find-on-fuel-type", new FindOnFuelTypeDefinitionParser());
        } catch (NoClassDefFoundError ex) {
            handleException("find-on-fuel-type", "@Processor", ex);
        }
    }

}
