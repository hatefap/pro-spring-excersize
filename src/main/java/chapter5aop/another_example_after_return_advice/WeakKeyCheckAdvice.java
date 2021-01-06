package chapter5aop.another_example_after_return_advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

import static chapter5aop.another_example_after_return_advice.KeyGenerator.WEAK_KEY;

public class WeakKeyCheckAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        if((target instanceof KeyGenerator) && "getkey".equals(method.getName())){
            long key = ((Long) returnValue).longValue();
            if(key == WEAK_KEY){
                throw new SecurityException("Key Generator Generated a weak key!");
            }
        }
    }
}
