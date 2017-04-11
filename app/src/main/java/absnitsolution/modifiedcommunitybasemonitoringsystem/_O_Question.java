package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class _O_Question extends Fragment {

    c_params cpar;
    Button btn_o;
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_o_106;
    Button btn_compute, btn_compute2, btn_compute3;
    ImageButton btn_back, btn_next;
    EditText
            txt_o_95a,
            txt_o_96a,
            txt_o_97a,
            txt_o_98a,
            txt_o_99a,
            txt_o_100a,
            txt_o_101a,
            txt_o_102a,
            txt_o_103a,
            txt_o_104a,
            txt_o_105a,
            txt_o_107a,
            txt_o_108a,
            txt_o_109a,
            txt_o_110a,
            txt_o_111a,
            txt_o_112a,
            txt_o_113a,
            txt_o_114a,
            txt_o_115a,
            txt_o_95b,
            txt_o_96b,
            txt_o_97b,
            txt_o_98b,
            txt_o_99b,
            txt_o_100b,
            txt_o_101b,
            txt_o_102b,
            txt_o_103b,
            txt_o_104b,
            txt_o_116a,
            txt_o_116b,
            txt_o_117,
            txt_o_117b,
            txt_o_118a,
            txt_o_118b,
            txt_o_119,
            txt_o_105b,
            txt_o_107b,
            txt_o_108b,
            txt_o_109b,
            txt_o_110b,
            txt_o_111b,
            txt_o_112b,
            txt_o_113b,
            txt_o_114b,
            txt_o_115b, txt_o_105;

    View view;

    public _O_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment___o__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        cbo_o_106 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_o_106);
        btn_o = (Button) view.findViewById(R.id.btn_o);
        btn_compute = (Button) view.findViewById(R.id.btn_compute);
        btn_compute2 = (Button) view.findViewById(R.id.btn_compute2);
        btn_compute3 = (Button) view.findViewById(R.id.btn_compute3);
        txt_o_97b = (EditText) view.findViewById(R.id.txt_o_97b);
        txt_o_97b = (EditText) view.findViewById(R.id.txt_o_97b);
        txt_o_97b = (EditText) view.findViewById(R.id.txt_o_97b);
        txt_o_95a = (EditText) view.findViewById(R.id.txt_o_95a);
        txt_o_96a = (EditText) view.findViewById(R.id.txt_o_96a);
        txt_o_97a = (EditText) view.findViewById(R.id.txt_o_97a);
        txt_o_98a = (EditText) view.findViewById(R.id.txt_o_98a);
        txt_o_99a = (EditText) view.findViewById(R.id.txt_o_99a);
        txt_o_100a = (EditText) view.findViewById(R.id.txt_o_100a);
        txt_o_101a = (EditText) view.findViewById(R.id.txt_o_101a);
        txt_o_102a = (EditText) view.findViewById(R.id.txt_o_102a);
        txt_o_103a = (EditText) view.findViewById(R.id.txt_o_103a);
        txt_o_104a = (EditText) view.findViewById(R.id.txt_o_104a);
        txt_o_105a = (EditText) view.findViewById(R.id.txt_o_105a);
        txt_o_107a = (EditText) view.findViewById(R.id.txt_o_107a);
        txt_o_108a = (EditText) view.findViewById(R.id.txt_o_108a);
        txt_o_109a = (EditText) view.findViewById(R.id.txt_o_109a);
        txt_o_110a = (EditText) view.findViewById(R.id.txt_o_110a);
        txt_o_111a = (EditText) view.findViewById(R.id.txt_o_111a);
        txt_o_112a = (EditText) view.findViewById(R.id.txt_o_112a);
        txt_o_113a = (EditText) view.findViewById(R.id.txt_o_113a);
        txt_o_114a = (EditText) view.findViewById(R.id.txt_o_114a);
        txt_o_115a = (EditText) view.findViewById(R.id.txt_o_115a);
        txt_o_116a = (EditText) view.findViewById(R.id.txt_o_116a);
        txt_o_117 = (EditText) view.findViewById(R.id.txt_o_117);
        txt_o_118a = (EditText) view.findViewById(R.id.txt_o_118a);
        txt_o_119 = (EditText) view.findViewById(R.id.txt_o_119);

        txt_o_95b = (EditText) view.findViewById(R.id.txt_o_95b);
        txt_o_97a = (EditText) view.findViewById(R.id.txt_o_97a);

        txt_o_96b = (EditText) view.findViewById(R.id.txt_o_96b);
        txt_o_98b = (EditText) view.findViewById(R.id.txt_o_98b);
        txt_o_99b = (EditText) view.findViewById(R.id.txt_o_99b);
        txt_o_100b = (EditText) view.findViewById(R.id.txt_o_100b);
        txt_o_101b = (EditText) view.findViewById(R.id.txt_o_101b);
        txt_o_102b = (EditText) view.findViewById(R.id.txt_o_102b);
        txt_o_103b = (EditText) view.findViewById(R.id.txt_o_103b);
        txt_o_104b = (EditText) view.findViewById(R.id.txt_o_104b);
        txt_o_105b = (EditText) view.findViewById(R.id.txt_o_105b);

        txt_o_107b = (EditText) view.findViewById(R.id.txt_o_107b);
        txt_o_108b = (EditText) view.findViewById(R.id.txt_o_108b);
        txt_o_109b = (EditText) view.findViewById(R.id.txt_o_109b);
        txt_o_110b = (EditText) view.findViewById(R.id.txt_o_110b);
        txt_o_111b = (EditText) view.findViewById(R.id.txt_o_111b);
        txt_o_112b = (EditText) view.findViewById(R.id.txt_o_112b);
        txt_o_113b = (EditText) view.findViewById(R.id.txt_o_113b);
        txt_o_114b = (EditText) view.findViewById(R.id.txt_o_114b);
        txt_o_115b = (EditText) view.findViewById(R.id.txt_o_115b);
        txt_o_116b = (EditText) view.findViewById(R.id.txt_o_116b);

        txt_o_118b = (EditText) view.findViewById(R.id.txt_o_118b);
        txt_o_117 = (EditText) view.findViewById(R.id.txt_o_117);
        try {
            int sumof89 = da.getGA_1ST89(Config.ID);
            int total89 = sumof89 * 12;
            txt_o_117.setText(String.valueOf(total89));
        } catch (Exception xx) {
            txt_o_117.setText("0");
        }

        btn_compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sum sum = new Sum();
                sum.Add(txt_o_95a);
                sum.Add(txt_o_96a);
                sum.Add(txt_o_97a);
                sum.Add(txt_o_98a);
                sum.Add(txt_o_99a);
                sum.Add(txt_o_100a);
                sum.Add(txt_o_101a);
                sum.Add(txt_o_102a);
                sum.Add(txt_o_103a);
                sum.Add(txt_o_104a);
                double avalue = sum.getTotal();
                txt_o_105a.setText(String.valueOf(avalue));

                Sum sum2 = new Sum();
                sum2.Add(txt_o_95b);
                sum2.Add(txt_o_96b);
                sum2.Add(txt_o_97b);
                sum2.Add(txt_o_98b);
                sum2.Add(txt_o_99b);
                sum2.Add(txt_o_100b);
                sum2.Add(txt_o_101b);
                sum2.Add(txt_o_102b);
                sum2.Add(txt_o_103b);
                sum2.Add(txt_o_104b);
                double bvalue = sum2.getTotal();
                txt_o_105b.setText(String.valueOf(bvalue));

                txt_o_105 = (EditText) view.findViewById(R.id.txt_o_105);
                double _105b = Double.valueOf(txt_o_105b.getText().toString());
                double _105a = Double.valueOf(txt_o_105a.getText().toString());
                double total = _105a + _105b;
                try {
                    txt_o_105.setText(String.valueOf(total));
                } catch (Exception xx) {
                }


            }
        });

        btn_compute2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sum sum = new Sum();
                sum.Add(txt_o_107a);
                sum.Add(txt_o_108a);
                sum.Add(txt_o_109a);
                sum.Add(txt_o_110a);
                sum.Add(txt_o_111a);
                sum.Add(txt_o_112a);
                sum.Add(txt_o_113a);
                sum.Add(txt_o_114a);
                sum.Add(txt_o_115a);
                double avalue = sum.getTotal();
                txt_o_116a.setText(String.valueOf(avalue));

                Sum sum2 = new Sum();
                sum2.Add(txt_o_107b);
                sum2.Add(txt_o_108b);
                sum2.Add(txt_o_109b);
                sum2.Add(txt_o_110b);
                sum2.Add(txt_o_111b);
                sum2.Add(txt_o_112b);
                sum2.Add(txt_o_113b);
                sum2.Add(txt_o_114b);
                sum2.Add(txt_o_115b);

                double bvalue = sum2.getTotal();
                txt_o_116b.setText(String.valueOf(bvalue));
            }
        });
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.setCheckBox(R.id.chk_o_115);
        this.cpar.setCheckBox(R.id.chk_o_114);
        this.cpar.setCheckBox(R.id.chk_o_113);
        this.cpar.setCheckBox(R.id.chk_o_112);
        this.cpar.setCheckBox(R.id.chk_o_111);
        this.cpar.setCheckBox(R.id.chk_o_110);
        this.cpar.setCheckBox(R.id.chk_o_109);
        this.cpar.setCheckBox(R.id.chk_o_108);
        this.cpar.setCheckBox(R.id.chk_o_107);

        this.cpar.setDropdown(R.id.cbo_o_106, R.array.ilan_wala, "Select One");
        this.cpar.setCheckBox(R.id.chk_o_104);
        this.cpar.setCheckBox(R.id.chk_o_103);
        this.cpar.setCheckBox(R.id.chk_o_102);
        this.cpar.setCheckBox(R.id.chk_o_101);
        this.cpar.setCheckBox(R.id.chk_o_100);
        this.cpar.setCheckBox(R.id.chk_o_99);
        this.cpar.setCheckBox(R.id.chk_o_98);
        this.cpar.setCheckBox(R.id.chk_o_97);
        this.cpar.setCheckBox(R.id.chk_o_96);
        this.cpar.setCheckBox(R.id.chk_o_95);

        this.cpar.setEditText(R.id.txt_o_95a);
        this.cpar.setEditText(R.id.txt_o_95b);
        this.cpar.setEditText(R.id.txt_o_96a);
        this.cpar.setEditText(R.id.txt_o_96b);
        this.cpar.setEditText(R.id.txt_o_97a);
        this.cpar.setEditText(R.id.txt_o_96b);
        this.cpar.setEditText(R.id.txt_o_98a);
        this.cpar.setEditText(R.id.txt_o_98b);
        this.cpar.setEditText(R.id.txt_o_99a);
        this.cpar.setEditText(R.id.txt_o_99b);
        this.cpar.setEditText(R.id.txt_o_100a);
        this.cpar.setEditText(R.id.txt_o_100b);
        this.cpar.setEditText(R.id.txt_o_101a);
        this.cpar.setEditText(R.id.txt_o_101b);
        this.cpar.setEditText(R.id.txt_o_102a);
        this.cpar.setEditText(R.id.txt_o_102b);
        this.cpar.setEditText(R.id.txt_o_103a);
        this.cpar.setEditText(R.id.txt_o_104b);
        this.cpar.setEditText(R.id.txt_o_104a);
        this.cpar.setEditText(R.id.txt_o_104b);
        this.cpar.setEditText(R.id.txt_o_105);
        this.cpar.setEditText(R.id.txt_o_105a);
        this.cpar.setEditText(R.id.txt_o_105b);
        this.cpar.setEditText(R.id.txt_o_107a);
        this.cpar.setEditText(R.id.txt_o_107b);
        this.cpar.setEditText(R.id.txt_o_108a);
        this.cpar.setEditText(R.id.txt_o_108b);
        this.cpar.setEditText(R.id.txt_o_109a);
        this.cpar.setEditText(R.id.txt_o_109b);
        this.cpar.setEditText(R.id.txt_o_110a);
        this.cpar.setEditText(R.id.txt_o_110b);
        this.cpar.setEditText(R.id.txt_o_111a);
        this.cpar.setEditText(R.id.txt_o_111b);
        this.cpar.setEditText(R.id.txt_o_112a);
        this.cpar.setEditText(R.id.txt_o_112b);
        this.cpar.setEditText(R.id.txt_o_113a);
        this.cpar.setEditText(R.id.txt_o_113b);
        this.cpar.setEditText(R.id.txt_o_114a);
        this.cpar.setEditText(R.id.txt_o_114b);
        this.cpar.setEditText(R.id.txt_o_115a);
        this.cpar.setEditText(R.id.txt_o_115b);
        this.cpar.setEditText(R.id.txt_o_116a);
        this.cpar.setEditText(R.id.txt_o_116b);
        this.cpar.setEditText(R.id.txt_o_117);

        this.cpar.setEditText(R.id.txt_o_118a);
        this.cpar.setEditText(R.id.txt_o_118b);
        this.cpar.setEditText(R.id.txt_o_119);

        cbo_o_106.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (validTOview(cbo_o_106.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage("MAG DAG-DAG NG IBA PANG IMPORMASYON.?");
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            LoadIntent("11", cbo_o_106, "go_1st", "o_001");
                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getActivity(), "NO", Toast.LENGTH_SHORT).show();
                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                }


            }
        });
        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validTOview(cbo_o_106.getText().toString())) {
                    LoadIntent("11", cbo_o_106, "go_1st", "o_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_compute3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
                MainDataBaseHandler da = new MainDataBaseHandler(getActivity());
                Sum sum2 = new Sum();


                int _106a = 0;//-
                try {
                    _106a = da.getSUMGO_1ST(Config.ID, AndroidID, "o_002");
                } catch (Exception xx) {
                }
                sum2.Add(_106a);//-
                sum2.Add(txt_o_116a);//--
                sum2.Add(txt_o_105a);//--
                double bvalue = sum2.getTotal();
                txt_o_118a = (EditText) view.findViewById(R.id.txt_o_118a);
                txt_o_118a.setText(String.valueOf(bvalue));


                Sum sum3 = new Sum();

                int _106b = 0;
                try {
                    _106b = da.getSUMGO_1ST(Config.ID, AndroidID, "o_003");
                } catch (Exception xx) {
                }
                sum3.Add(_106b);//--
                sum3.Add(txt_o_116b);//--
                sum3.Add(txt_o_105b);//-
                double bvalue2 = sum3.getTotal();
                txt_o_118b = (EditText) view.findViewById(R.id.txt_o_118b);
                txt_o_118b.setText(String.valueOf(bvalue2));

                Sum sum4 = new Sum();
                sum4.Add(txt_o_118b);
                sum4.Add(txt_o_118a);
                sum4.Add(txt_o_117);

                double bvalue3 = sum4.getTotal();
                txt_o_119 = (EditText) view.findViewById(R.id.txt_o_119);
                txt_o_119.setText(String.valueOf(bvalue3));


                //   double a
                // txt_o_118a.setText();
            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _N_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "O. PINAGMUMULAN NG KITA NG PAMILYA").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _P_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "P. AGRIKULTURA").commit();
            }
        });


        this.checkBoxEnabled(R.id.chk_o_115, R.id.txt_o_115a, R.id.txt_o_115b);
        this.checkBoxEnabled(R.id.chk_o_114, R.id.txt_o_114a, R.id.txt_o_114b);
        this.checkBoxEnabled(R.id.chk_o_113, R.id.txt_o_113a, R.id.txt_o_113b);
        this.checkBoxEnabled(R.id.chk_o_112, R.id.txt_o_112a, R.id.txt_o_112b);
        this.checkBoxEnabled(R.id.chk_o_111, R.id.txt_o_111a, R.id.txt_o_111b);
        this.checkBoxEnabled(R.id.chk_o_110, R.id.txt_o_110a, R.id.txt_o_110b);
        this.checkBoxEnabled(R.id.chk_o_109, R.id.txt_o_109a, R.id.txt_o_109b);
        this.checkBoxEnabled(R.id.chk_o_108, R.id.txt_o_108a, R.id.txt_o_108b);
        this.checkBoxEnabled(R.id.chk_o_107, R.id.txt_o_107a, R.id.txt_o_107b);

        this.checkBoxEnabled(R.id.chk_o_104, R.id.txt_o_104a, R.id.txt_o_104b);
        this.checkBoxEnabled(R.id.chk_o_103, R.id.txt_o_103a, R.id.txt_o_103b);
        this.checkBoxEnabled(R.id.chk_o_102, R.id.txt_o_102a, R.id.txt_o_102b);
        this.checkBoxEnabled(R.id.chk_o_101, R.id.txt_o_101a, R.id.txt_o_101b);
        this.checkBoxEnabled(R.id.chk_o_100, R.id.txt_o_100a, R.id.txt_o_100b);
        this.checkBoxEnabled(R.id.chk_o_99, R.id.txt_o_99a, R.id.txt_o_99b);
        this.checkBoxEnabled(R.id.chk_o_98, R.id.txt_o_98a, R.id.txt_o_98b);
        this.checkBoxEnabled(R.id.chk_o_97, R.id.txt_o_97a, R.id.txt_o_97b);
        this.checkBoxEnabled(R.id.chk_o_96, R.id.txt_o_96a, R.id.txt_o_96b);
        this.checkBoxEnabled(R.id.chk_o_95, R.id.txt_o_95a, R.id.txt_o_95b);

        return view;
    }

    private void checkBoxEnabled(int _chk, int _txt1, int _txt2) {
        final CheckBox chk = (CheckBox) view.findViewById(_chk);
        final EditText txt1 = (EditText) view.findViewById(_txt1);
        final EditText txt2 = (EditText) view.findViewById(_txt2);
        Boolean bool = chk.isChecked();
        txt1.setEnabled(bool);
        txt2.setEnabled(bool);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                txt1.setEnabled(isChecked);
                txt2.setEnabled(isChecked);
            }
        });
    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putCheckBox(R.id.chk_o_95);
        this.cpar.putEditText(R.id.txt_o_95a);
        this.cpar.putEditText(R.id.txt_o_95b);
        this.cpar.putCheckBox(R.id.chk_o_96);
        this.cpar.putEditText(R.id.txt_o_96a);
        this.cpar.putEditText(R.id.txt_o_96b);
        this.cpar.putCheckBox(R.id.chk_o_97);
        this.cpar.putEditText(R.id.txt_o_97a);
        this.cpar.putEditText(R.id.txt_o_96b);
        this.cpar.putCheckBox(R.id.chk_o_98);
        this.cpar.putEditText(R.id.txt_o_98a);
        this.cpar.putEditText(R.id.txt_o_98b);
        this.cpar.putCheckBox(R.id.chk_o_99);
        this.cpar.putEditText(R.id.txt_o_99a);
        this.cpar.putEditText(R.id.txt_o_99b);
        this.cpar.putCheckBox(R.id.chk_o_100);
        this.cpar.putEditText(R.id.txt_o_100a);
        this.cpar.putEditText(R.id.txt_o_100b);
        this.cpar.putCheckBox(R.id.chk_o_101);
        this.cpar.putEditText(R.id.txt_o_101a);
        this.cpar.putEditText(R.id.txt_o_101b);
        this.cpar.putCheckBox(R.id.chk_o_102);
        this.cpar.putEditText(R.id.txt_o_102a);
        this.cpar.putEditText(R.id.txt_o_102b);
        this.cpar.putCheckBox(R.id.chk_o_103);
        this.cpar.putEditText(R.id.txt_o_103a);
        this.cpar.putEditText(R.id.txt_o_104b);
        this.cpar.putCheckBox(R.id.chk_o_104);
        this.cpar.putEditText(R.id.txt_o_104a);
        this.cpar.putEditText(R.id.txt_o_104b);
        this.cpar.putEditText(R.id.txt_o_105);
        this.cpar.putEditText(R.id.txt_o_105a);
        this.cpar.putEditText(R.id.txt_o_105b);
        this.cpar.putDropdown(R.id.cbo_o_106);

        this.cpar.putCheckBox(R.id.chk_o_107);
        this.cpar.putEditText(R.id.txt_o_107a);
        this.cpar.putEditText(R.id.txt_o_107b);
        this.cpar.putCheckBox(R.id.chk_o_108);
        this.cpar.putEditText(R.id.txt_o_108a);
        this.cpar.putEditText(R.id.txt_o_108b);
        this.cpar.putCheckBox(R.id.chk_o_109);
        this.cpar.putEditText(R.id.txt_o_109a);
        this.cpar.putEditText(R.id.txt_o_109b);
        this.cpar.putCheckBox(R.id.chk_o_110);
        this.cpar.putEditText(R.id.txt_o_110a);
        this.cpar.putEditText(R.id.txt_o_110b);
        this.cpar.putCheckBox(R.id.chk_o_111);
        this.cpar.putEditText(R.id.txt_o_111a);
        this.cpar.putEditText(R.id.txt_o_111b);
        this.cpar.putCheckBox(R.id.chk_o_112);
        this.cpar.putEditText(R.id.txt_o_112a);
        this.cpar.putEditText(R.id.txt_o_112b);
        this.cpar.putCheckBox(R.id.chk_o_113);
        this.cpar.putEditText(R.id.txt_o_113a);
        this.cpar.putEditText(R.id.txt_o_113b);
        this.cpar.putCheckBox(R.id.chk_o_114);
        this.cpar.putEditText(R.id.txt_o_114a);
        this.cpar.putEditText(R.id.txt_o_114b);
        this.cpar.putCheckBox(R.id.chk_o_115);
        this.cpar.putEditText(R.id.txt_o_115a);
        this.cpar.putEditText(R.id.txt_o_115b);
        this.cpar.putEditText(R.id.txt_o_116a);
        this.cpar.putEditText(R.id.txt_o_116b);
        this.cpar.putEditText(R.id.txt_o_117);

        this.cpar.putEditText(R.id.txt_o_118a);
        this.cpar.putEditText(R.id.txt_o_118b);
        this.cpar.putEditText(R.id.txt_o_119);

        da.c_Update(cpar);
        super.onDestroy();
    }

    private void LoadIntent(String FragmentSequence, MaterialBetterSpinner obj, String table, String f_field) {
        try {
            Config.Count = Integer.valueOf(obj.getText().toString());
        } catch (Exception xx) {
            Config.Count = 0;
        }
        Intent intent = new Intent(getActivity(), gridbody.class);
        Bundle bundle = new Bundle();
        bundle.putString("fragment", FragmentSequence);
        bundle.putString("title", "Sample Title");
        bundle.putString("table", table);
        bundle.putString("f_field", f_field);
        intent.putExtra("values", bundle);

        startActivity(intent);
    }

    private boolean validTOview(String value) {

        try {
            int i = Integer.valueOf(value);
            return true;
        } catch (Exception xx) {
            return false;
        }

    }

    public class Sum {
        List<String> list = new ArrayList<String>();
        double total = 0;

        public void Add(EditText txt) {
            list.add(txt.getText().toString());
        }

        public void Add(int txt) {
            list.add(String.valueOf(txt));
        }

        public double getTotal() {

            for (String val : list) {
                double value = 0;
                try {
                    value = Double.valueOf(val);
                    total += value;
                } catch (Exception xx) {
                    total += value;
                }
            }

            return total;
        }
    }
}

