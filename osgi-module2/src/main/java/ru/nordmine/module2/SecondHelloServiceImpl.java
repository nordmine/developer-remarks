package ru.nordmine.module2;

import ru.nordmine.api.HelloService;

public class SecondHelloServiceImpl implements HelloService {

    @Override
    public String processString(String source) {
        return source + " from second module";
    }
}
