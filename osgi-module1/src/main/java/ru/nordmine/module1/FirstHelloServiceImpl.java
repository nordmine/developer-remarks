package ru.nordmine.module1;

import ru.nordmine.api.HelloService;

public class FirstHelloServiceImpl implements HelloService {

    @Override
    public String processString(String source) {
        return source + " from module 1";
    }
}
