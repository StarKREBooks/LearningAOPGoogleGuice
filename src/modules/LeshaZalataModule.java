package modules;

import annotation.LeshaZalata;
import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import interceptor.LeshaZalataInterceptor;

public final class LeshaZalataModule extends AbstractModule {

    @Override
    protected final void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(LeshaZalata.class), new LeshaZalataInterceptor());
    }
}
