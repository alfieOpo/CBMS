package absnitsolution.modifiedcommunitybasemonitoringsystem;


public class UsersInfo {
    int _id;
    String _first_name, _middle_name, _last_name, _username, _password, _islogin;

    public UsersInfo(int id, String first_name, String middle_name, String last_name, String password, String username, String islogin) {
        this._id = id;
        this._first_name = first_name;
        this._middle_name = middle_name;
        this._last_name = last_name;
        this._username = username;
        this._password = password;
        this._islogin = islogin;
    }

    public UsersInfo(String first_name, String middle_name, String last_name, String password, String username, String islogin) {
        this._first_name = first_name;
        this._middle_name = middle_name;
        this._last_name = last_name;
        this._username = username;
        this._password = password;
        this._islogin = islogin;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_first_name() {
        return _first_name;
    }

    public void set_first_name(String _first_name) {
        this._first_name = _first_name;
    }

    public String get_middle_name() {
        return _middle_name;
    }

    public void set_middle_name(String _middle_name) {
        this._middle_name = _middle_name;
    }

    public String get_last_name() {
        return _last_name;
    }

    public void set_last_name(String _last_name) {
        this._last_name = _last_name;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public String get_islogin() {
        return _islogin;
    }

    public void set_islogin(String _islogin) {
        this._islogin = _islogin;
    }
}
