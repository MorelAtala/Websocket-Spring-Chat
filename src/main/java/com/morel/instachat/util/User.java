/**

 */
package com.morel.instachat.util;

import java.security.Principal;

public class User implements Principal {

    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
