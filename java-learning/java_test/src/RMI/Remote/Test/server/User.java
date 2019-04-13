package RMI.Remote.Test.server;

import java.io.Serializable;

public class User implements Serializable {
    // 该字段必须存在
    private static final long serialVersionUID = 42L;
    // setter和getter可以没有
    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
