package app;

public final class getdata<T> {
    private T jenisAkun;
    private String username;
    private String password;

    public getdata(T jenisAkun, String username, String password) {
        this.jenisAkun = jenisAkun;
        this.username = username;
        this.password = password;
    }

    public T getJenisAkun() {
        return jenisAkun;
    }

    public void setJenisAkun(T jenisAkun) {
        this.jenisAkun = jenisAkun;
    }

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

    @Override   
    public String toString() {
        return "Jenis Akun: " + jenisAkun + ", Username: " + username + ", Password: " + password;
    }
}