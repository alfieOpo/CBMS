package absnitsolution.modifiedcommunitybasemonitoringsystem;


public class UsersInfo {
    int _id;
    String _first_name, _middle_name, _last_name, _id_number, _barangay;

    public UsersInfo(int id, String first_name, String middle_name, String last_name, String id_number, String barangay) {
        this._id = id;
        this._first_name = first_name;
        this._middle_name = middle_name;
        this._last_name = last_name;
        this._id_number = id_number;
        this._barangay = barangay;

    }

    public UsersInfo(String first_name, String middle_name, String last_name, String id_number, String barangay) {
        this._first_name = first_name;
        this._middle_name = middle_name;
        this._last_name = last_name;
        this._id_number = id_number;
        this._barangay = barangay;
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

    public String get_barangay() {
        return _barangay;
    }

    public void set_barangay(String _barangay) {
        this._barangay = _barangay;
    }

    public String get_id_number() {
        return _id_number;
    }

    public void set_id_number(String _id_number) {
        this._id_number = _id_number;
    }
}
