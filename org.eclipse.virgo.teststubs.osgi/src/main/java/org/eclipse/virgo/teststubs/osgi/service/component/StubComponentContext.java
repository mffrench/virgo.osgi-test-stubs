
package org.eclipse.virgo.teststubs.osgi.service.component;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.ComponentInstance;

public class StubComponentContext implements ComponentContext {

    public final String DEFAULT_PROP_KEY = "key";

    public final String DEFAULT_PROP_VALUE = "value";

    private final Dictionary<String, String> props = new Hashtable<String, String>();

    private final BundleContext bundleContext;

    public StubComponentContext(BundleContext bundleContext) {
        this.bundleContext = bundleContext;
        populateDefaultProperties();
    }

    public Dictionary<String, String> getProperties() {
        return this.props;
    }

    private void populateDefaultProperties() {
        this.props.put(this.DEFAULT_PROP_KEY, this.DEFAULT_PROP_VALUE);
    }

    public Object locateService(String name) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    public Object locateService(String name, ServiceReference reference) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    public Object[] locateServices(String name) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    public BundleContext getBundleContext() {
        return this.bundleContext;
    }

    public Bundle getUsingBundle() {
        return null;
    }

    public ComponentInstance getComponentInstance() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    public void enableComponent(String name) {
    }

    public void disableComponent(String name) {
    }

    public ServiceReference getServiceReference() {
        return null;
    }

}
