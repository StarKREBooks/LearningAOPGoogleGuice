package interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LeshaZalataInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(final MethodInvocation invocation) throws Throwable {
        System.out.println("Hi! I'm Lesha Zalata!");
        System.out.println("I like to play in computer games!");
        final Object result = invocation.proceed();
        System.out.println("Bye!");
        System.out.println("Bye");
        return result;
    }
}