package kg.study.mvp_demo.root;

import javax.inject.Singleton;

import dagger.Component;
import kg.study.mvp_demo.login.LoginActivity;
import kg.study.mvp_demo.login.LoginModule;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {
    void inject(LoginActivity target);
}
