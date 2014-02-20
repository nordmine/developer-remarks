package ru.nordmine.module2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import ru.nordmine.api.HelloService;

public class SecondModuleActivator implements BundleActivator {

    private ServiceRegistration helloServiceRegistration;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Second module started");
        HelloService helloService = new SecondHelloServiceImpl();
        helloServiceRegistration = bundleContext.registerService(HelloService.class.getName(), helloService, null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        helloServiceRegistration.unregister();
        System.out.println("Second module stopped");
    }
}
