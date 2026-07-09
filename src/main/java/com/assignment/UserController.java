package com.assignment;

/**
 * UserController - Presentation layer.
 * Depends on UserService (injected via constructor injection).
 */
public class UserController {

    // UserService dependency - injected through constructor
    private UserService service;

    /**
     * Constructor injection - Spring injects UserService here.
     * @param service the service to be used by the controller
     */
    public UserController(UserService service) {
        this.service = service;
    }

    /**
     * Executes the user operation by delegating to the service layer.
     */
    public void execute() {
        service.process();
    }
}
