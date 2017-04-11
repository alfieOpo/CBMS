package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.ContentValues;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

/**
 * Created by Arlene on 13/03/2017.
 */

public class c_params {
    String _id = "";
    String _table = "";
    ContentValues _values = new ContentValues();
    View _v;
    ViewGroup _vg;
    MainDataBaseHandler da;
    String _key = Config.ID;

    public c_params(String id, ViewGroup cn, View v) {
        this._id = id;
        this._vg = cn;
        this._v = v;
        da = new MainDataBaseHandler(v.getContext());
    }

    //-------------PUT
    public void putEditText(int obj) {
        EditText txt = (EditText) this._v.findViewById(obj);
        this._values.put(txt.getTag().toString(), txt.getText().toString());
    }

    public void putTextView(int obj) {
        TextView txt = (TextView) this._v.findViewById(obj);
        this._values.put(txt.getTag().toString(), txt.getText().toString());
    }

    public void putCheckBox(int obj) {
        CheckBox box = (CheckBox) this._v.findViewById(obj);
        String value = box.isChecked() ? "1" : "0";
        this._values.put(box.getTag().toString(), value);
    }

    public void putDropdown(int obj) {
        MaterialBetterSpinner dropdown = (MaterialBetterSpinner) this._v.findViewById(obj);
        this._values.put(dropdown.getTag().toString(), dropdown.getText().toString());
    }
///-------------------SET

    public void setEditText(int obj) {
        try {
            EditText txt = (EditText) this._v.findViewById(obj);
            if (this._table.equals("")) {
                txt.setText(da.GetData(txt.getTag().toString()));
            } else {
                txt.setText(da.GetData(txt.getTag().toString(), this._table, this.get_key()));
            }
        } catch (Exception xx) {
        }
    }

    public void setTextView(int obj) {
        try {
            TextView txt = (TextView) this._v.findViewById(obj);
            if (this._table.equals("")) {
                txt.setText(da.GetData(txt.getTag().toString()));
            } else {
                txt.setText(da.GetData(txt.getTag().toString(), this._table, this.get_key()));
            }
        } catch (Exception xx) {
        }
    }

    public void setCheckBox(int obj) {
        CheckBox box = (CheckBox) this._v.findViewById(obj);
        box.setChecked(false);
        if (this._table.equals("")) {
            if (da.GetDataCheck(box.getTag().toString()).equals("1")) {
                box.setChecked(true);
            }
        } else {
            if (da.GetDataCheck(box.getTag().toString(), this._table, this.get_key()).equals("1")) {
                box.setChecked(true);
            }
        }
    }

    public void setDropdown(int obj, int arr, String text) {
        try {
            com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner ddl;
            ddl = (com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner) this._v.findViewById(obj);
            ddl.setAdapter(Adapter(arr));
            if (this._table.equals("")) {
                String data = da.GetData(ddl.getTag().toString());
                if (data.equals("")) {
                    ddl.setText(text);
                } else {
                    ddl.setText(data);
                }
            } else {
                String data = da.GetData(ddl.getTag().toString(), this._table, this.get_key());
                if (data.equals("")) {
                    ddl.setText(text);
                } else {
                    ddl.setText(data);
                }
            }
        } catch (Exception xx) {
        }
    }

    ///-----ADAPTER FOR DROPDOWN
    public ArrayAdapter<String> Adapter(int arr) {
        ArrayAdapter<String> lungsod_adapter = new ArrayAdapter<String>(this._v.getContext().getApplicationContext(), R.layout.dropdown_layout, this._v.getResources().getStringArray(arr));
        return lungsod_adapter;
    }

///---------------------

    public void add(EditText txt) {
        this._values.put(txt.getText().toString(), txt.getTag().toString());
    }

    public void add(int k, String v) {
        this._values.put(String.valueOf(k), v);
    }

    public void add(String k, String v) {
        this._values.put(String.valueOf(k), v);
    }

    public ContentValues get_values() {
        return this._values;
    }

    public void set_table(String __table) {
        this._table = __table;
    }

    public String get_key() {
        return " _id = " + this._key;
    }

    public void set_key(String __id) {
        this._key = __id;
    }

}
