package kg.study.mvp_demo.root;

import android.app.Application;

import kg.study.mvp_demo.login.LoginModule;

public class App extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        //needs to run once to generate it
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .loginModule(new LoginModule())
                .build();

    }


    public AppComponent getComponent() {
        return component;
    }

}