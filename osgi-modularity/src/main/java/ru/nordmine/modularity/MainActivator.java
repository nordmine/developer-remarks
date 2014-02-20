package ru.nordmine.modularity;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import ru.nordmine.api.HelloService;

public class MainActivator implements BundleActivator {

    private ServiceReference[] allReferences;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Main bundle started");
        allReferences = bundleContext.getServiceReferences(HelloService.class.getName(), null);
        if (allReferences != null) {
            for (ServiceReference reference : allReferences) {
                HelloService helloService = (HelloService) bundleContext.getService(reference);
                System.out.println(helloService.processString("Hello"));
            }
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        if (allReferences != null) {
            for (ServiceReference reference : allReferences) {
                bundleContext.ungetService(reference);
            }
        }
        System.out.println("Main bundle stopped");
    }
}
