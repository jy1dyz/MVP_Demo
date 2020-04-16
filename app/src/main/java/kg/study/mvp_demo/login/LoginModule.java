package kg.study.mvp_demo.login;

import dagger.Module;
import dagger.Provides;
import kg.study.mvp_demo.repo.LoginRepository;
import kg.study.mvp_demo.model.LoginModel;
import kg.study.mvp_demo.repo.UserRepository;

@Module
public class LoginModule {
    @Provides
    public LoginActivityMVP.Presenter provideLoginActivityPresenter(LoginActivityMVP.Model model){
        return new LoginActivityPresenter(model);
    }
    @Provides
    public LoginActivityMVP.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }
    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }
}
