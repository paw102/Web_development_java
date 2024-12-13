package ch17_bean;
/*
    정보를 담는 객체를 Entity Class 라고 함. -> 데이터베이스와 연결되는 클래스만 특히 Entity 클래스라고 함.
    필드 -> 명사
    메서드 -> 동사로 짓는 편
 */

public class UserEntity {
    private String username;
    private String password;
    private String email;
    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
