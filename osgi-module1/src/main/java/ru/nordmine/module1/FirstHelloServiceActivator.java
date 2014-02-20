package ru.nordmine.module1;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import ru.nordmine.api.HelloService;

public class FirstHelloServiceActivator implements BundleActivator {

    private ServiceRegistration helloServiceRegistration;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Module bundle started");
        HelloService helloService = new FirstHelloServiceImpl();
        helloServiceRegistration = bundleContext.registerService(HelloService.class.getName(), helloService, null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        helloServiceRegistration.unregister();
        System.out.println("Module bundle stopped");
    }
}
