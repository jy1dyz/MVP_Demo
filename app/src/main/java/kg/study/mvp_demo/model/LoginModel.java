package kg.study.mvp_demo.model;

import kg.study.mvp_demo.login.LoginActivityMVP;
import kg.study.mvp_demo.repo.LoginRepository;

public class LoginModel implements LoginActivityMVP.Model {
    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String lastName) {


        repository.saveUser(new User(name, lastName));


    }

    @Override
    public User getUser() {

        return repository.getUser();
    }
}
