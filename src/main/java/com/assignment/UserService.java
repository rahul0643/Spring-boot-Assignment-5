package com.assignment;

/**
 * UserService - Business logic layer.
 * Depends on UserRepository (injected via setter injection).
 */
public class UserService {

    // UserRepository dependency - injected through setter method
    private UserRepository repo;

    /**
     * Setter injection - Spring injects UserRepository here.
     * @param repo the repository to be used by the service
     */
    public void setRepo(UserRepository repo) {
        this.repo = repo;
    }

    /**
     * Processes user data by first fetching it from the repository.
     */
    public void process() {
        repo.getData();
        System.out.println("Processing user data");
    }
}
