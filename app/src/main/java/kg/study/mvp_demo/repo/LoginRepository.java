package kg.study.mvp_demo.repo;

import kg.study.mvp_demo.model.User;

public interface LoginRepository {
    User getUser();

    void saveUser(User user);
}
