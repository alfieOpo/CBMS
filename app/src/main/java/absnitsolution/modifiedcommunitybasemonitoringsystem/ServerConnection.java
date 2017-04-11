package absnitsolution.modifiedcommunitybasemonitoringsystem;

public class ServerConnection {
    int _id;
    String _localaddress;
    String _internetaddress;

    public ServerConnection(int id, String LocalAddress, String InternetAddress) {
        this._id = id;
        this._localaddress = LocalAddress;
        this._internetaddress = InternetAddress;
    }

    public ServerConnection(String LocalAddress, String InternetAddress) {

        this._localaddress = LocalAddress;
        this._internetaddress = InternetAddress;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_internetaddress() {
        return _internetaddress;
    }

    public void set_internetaddress(String _internetaddress) {
        this._internetaddress = _internetaddress;
    }

    public String get_localaddress() {
        return _localaddress;
    }

    public void set_localaddress(String _localaddress) {
        this._localaddress = _localaddress;
    }

}
