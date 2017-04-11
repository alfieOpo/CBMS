package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class _V_Question extends Fragment {


    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    Button btn_philhealt_para_sa_mahirap,
            btn_heilt_assistance,
            btn_suplemental_feeding,
            btn_Education,
            btn_Skills,
            btn_Housing_program,
            btn_Credit_program,
            btn_4Ps,
            btn_ARCDP,
            btn_Individually_paying,
            btn_TWSP,
            btn_CBEP,
            btn_OFW,
            btn_Employed,
            btn_Sponsored,
            btn_Lifetime;

    public _V_Question() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___v__question, container, false);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);


        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setDropdown(R.id.cbo_v_147, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_148_month, R.array.month, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_148_day, R.array.day, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_148_year, R.array.year, "Select One");

        this.cpar.setDropdown(R.id.cbo_v_173_1_1, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_173_2_1, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_173_3_1, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_173_4_1, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_173_5_1, R.array.oo_hindi, "Select One");

        this.cpar.setDropdown(R.id.cbo_v_150_1, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_2, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_3, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_4, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_5, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_6, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_7, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_8, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_9, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_10, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_11, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_12, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_13, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_14, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_15, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_16, R.array.v_privateorg, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_150_17, R.array.v_privateorg, "Select One");

        this.cpar.setDropdown(R.id.cbo_v_152_1, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_2, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_3, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_4, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_5, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_6, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_7, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_8, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_9, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_10, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_11, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_12, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_13, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_14, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_15, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_16, R.array.v_epekto, "Select One");
        this.cpar.setDropdown(R.id.cbo_v_152_17, R.array.v_epekto, "Select One");
        //  this.cpar.setCheckBox(R.id.chk_v_149);
        this.cpar.setEditText(R.id.txt_v_149);
        this.cpar.setCheckBox(R.id.chk_v_149_1);

        this.cpar.setCheckBox(R.id.chk_v_149_2);

        this.cpar.setCheckBox(R.id.chk_v_149_3);

        this.cpar.setCheckBox(R.id.chk_v_149_4);

        this.cpar.setCheckBox(R.id.chk_v_149_5);

        this.cpar.setCheckBox(R.id.chk_v_149_6);
        this.cpar.setCheckBox(R.id.chk_v_149_7);
        this.cpar.setCheckBox(R.id.chk_v_149_8);
        this.cpar.setCheckBox(R.id.chk_v_149_9);
        this.cpar.setCheckBox(R.id.chk_v_149_10);
        this.cpar.setCheckBox(R.id.chk_v_149_11);
        this.cpar.setCheckBox(R.id.chk_v_149_12);
        this.cpar.setCheckBox(R.id.chk_v_149_13);
        this.cpar.setCheckBox(R.id.chk_v_149_14);
        this.cpar.setCheckBox(R.id.chk_v_149_15);
        this.cpar.setCheckBox(R.id.chk_v_149_16);
        this.cpar.setCheckBox(R.id.chk_v_149_17);
        this.cpar.setEditText(R.id.txt_v_149_17);

        this.cpar.setEditText(R.id.txt_v_150_17);

        this.cpar.setEditText(R.id.txt_v_151_1);
        this.cpar.setEditText(R.id.txt_v_151_2);
        this.cpar.setEditText(R.id.txt_v_151_3);
        this.cpar.setEditText(R.id.txt_v_151_4);
        this.cpar.setEditText(R.id.txt_v_151_5);
        this.cpar.setEditText(R.id.txt_v_151_6);
        this.cpar.setEditText(R.id.txt_v_151_7);
        this.cpar.setEditText(R.id.txt_v_151_8);
        this.cpar.setEditText(R.id.txt_v_151_9);
        this.cpar.setEditText(R.id.txt_v_151_10);
        this.cpar.setEditText(R.id.txt_v_151_11);
        this.cpar.setEditText(R.id.txt_v_151_12);
        this.cpar.setEditText(R.id.txt_v_151_13);
        this.cpar.setEditText(R.id.txt_v_151_14);
        this.cpar.setEditText(R.id.txt_v_151_15);
        this.cpar.setEditText(R.id.txt_v_151_16);
        this.cpar.setEditText(R.id.txt_v_151_17);


        this.cpar.setEditText(R.id.txt_v_152_17);

        this.cpar.setEditText(R.id.txt_v_153_1);
        this.cpar.setEditText(R.id.txt_v_153_2);
        this.cpar.setEditText(R.id.txt_v_153_3);
        this.cpar.setEditText(R.id.txt_v_153_4);
        this.cpar.setEditText(R.id.txt_v_153_5);
        this.cpar.setEditText(R.id.txt_v_153_6);
        this.cpar.setEditText(R.id.txt_v_153_7);
        this.cpar.setEditText(R.id.txt_v_153_8);
        this.cpar.setEditText(R.id.txt_v_153_9);
        this.cpar.setEditText(R.id.txt_v_153_10);
        this.cpar.setEditText(R.id.txt_v_153_11);
        this.cpar.setEditText(R.id.txt_v_153_12);
        this.cpar.setEditText(R.id.txt_v_153_13);
        this.cpar.setEditText(R.id.txt_v_153_14);
        this.cpar.setEditText(R.id.txt_v_153_15);
        this.cpar.setEditText(R.id.txt_v_153_16);
        this.cpar.setEditText(R.id.txt_v_153_17);
        this.cpar.setEditText(R.id.txt_v_154_1);
        this.cpar.setEditText(R.id.txt_v_154_2);
        this.cpar.setEditText(R.id.txt_v_154_3);
        this.cpar.setEditText(R.id.txt_v_154_4);
        this.cpar.setEditText(R.id.txt_v_154_5);
        this.cpar.setEditText(R.id.txt_v_154_6);
        this.cpar.setEditText(R.id.txt_v_154_7);
        this.cpar.setEditText(R.id.txt_v_154_8);
        this.cpar.setEditText(R.id.txt_v_154_9);
        this.cpar.setEditText(R.id.txt_v_154_10);
        this.cpar.setEditText(R.id.txt_v_154_11);
        this.cpar.setEditText(R.id.txt_v_154_12);
        this.cpar.setEditText(R.id.txt_v_154_13);
        this.cpar.setEditText(R.id.txt_v_154_14);
        this.cpar.setEditText(R.id.txt_v_154_15);
        this.cpar.setEditText(R.id.txt_v_154_16);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _T_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "U. MGA KALAMIDAD").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = PictureOfThePlace.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "Picture of The Place").commit();
            }
        });

        final EditText txt_v_154_1 = (EditText) view.findViewById(R.id.txt_v_154_1);
        btn_philhealt_para_sa_mahirap = (Button) view.findViewById(R.id.btn_philhealt_para_sa_mahirap);
        btn_philhealt_para_sa_mahirap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_philhealt_para_sa_mahirap.getTag().toString(), txt_v_154_1);
            }
        });

        final EditText txt_v_154_2 = (EditText) view.findViewById(R.id.txt_v_154_2);
        btn_heilt_assistance = (Button) view.findViewById(R.id.btn_heilt_assistance);
        btn_heilt_assistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_heilt_assistance.getTag().toString(), txt_v_154_2);
            }
        });

        final EditText txt_v_154_3 = (EditText) view.findViewById(R.id.txt_v_154_3);
        btn_suplemental_feeding = (Button) view.findViewById(R.id.btn_suplemental_feeding);
        btn_suplemental_feeding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_suplemental_feeding.getTag().toString(), txt_v_154_3);
            }
        });

        final EditText txt_v_154_4 = (EditText) view.findViewById(R.id.txt_v_154_4);
        btn_Education = (Button) view.findViewById(R.id.btn_Education);
        btn_Education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Education.getTag().toString(), txt_v_154_4);
            }
        });


        final EditText txt_v_154_5 = (EditText) view.findViewById(R.id.txt_v_154_5);
        btn_Skills = (Button) view.findViewById(R.id.btn_Skills);
        btn_Skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Skills.getTag().toString(), txt_v_154_5);
            }
        });


        final EditText txt_v_154_6 = (EditText) view.findViewById(R.id.txt_v_154_6);
        btn_Housing_program = (Button) view.findViewById(R.id.btn_Housing_program);
        btn_Housing_program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Housing_program.getTag().toString(), txt_v_154_6);
            }
        });


        final EditText txt_v_154_7 = (EditText) view.findViewById(R.id.txt_v_154_7);
        btn_Credit_program = (Button) view.findViewById(R.id.btn_Credit_program);
        btn_Credit_program.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Credit_program.getTag().toString(), txt_v_154_7);
            }
        });


        final EditText txt_v_154_8 = (EditText) view.findViewById(R.id.txt_v_154_8);
        btn_4Ps = (Button) view.findViewById(R.id.btn_4Ps);
        btn_4Ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_4Ps.getTag().toString(), txt_v_154_8);
            }
        });


        final EditText txt_v_154_9 = (EditText) view.findViewById(R.id.txt_v_154_9);
        btn_ARCDP = (Button) view.findViewById(R.id.btn_ARCDP);
        btn_ARCDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_ARCDP.getTag().toString(), txt_v_154_9);
            }
        });


        final EditText txt_v_154_14 = (EditText) view.findViewById(R.id.txt_v_154_14);
        btn_Individually_paying = (Button) view.findViewById(R.id.btn_Individually_paying);
        btn_Individually_paying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Individually_paying.getTag().toString(), txt_v_154_14);
            }
        });


        final EditText txt_v_154_10 = (EditText) view.findViewById(R.id.txt_v_154_10);
        btn_TWSP = (Button) view.findViewById(R.id.btn_TWSP);
        btn_TWSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_TWSP.getTag().toString(), txt_v_154_10);
            }
        });


        final EditText txt_v_154_11 = (EditText) view.findViewById(R.id.txt_v_154_11);
        btn_CBEP = (Button) view.findViewById(R.id.btn_CBEP);
        btn_CBEP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_CBEP.getTag().toString(), txt_v_154_11);
            }
        });


        final EditText txt_v_154_12 = (EditText) view.findViewById(R.id.txt_v_154_12);
        btn_OFW = (Button) view.findViewById(R.id.btn_OFW);
        btn_OFW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_OFW.getTag().toString(), txt_v_154_12);
            }
        });


        final EditText txt_v_154_13 = (EditText) view.findViewById(R.id.txt_v_154_13);
        btn_Employed = (Button) view.findViewById(R.id.btn_Employed);
        btn_Employed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Employed.getTag().toString(), txt_v_154_13);
            }
        });


        final EditText txt_v_154_15 = (EditText) view.findViewById(R.id.txt_v_154_15);
        btn_Sponsored = (Button) view.findViewById(R.id.btn_Sponsored);
        btn_Sponsored.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Sponsored.getTag().toString(), txt_v_154_15);
            }
        });


        final EditText txt_v_154_16 = (EditText) view.findViewById(R.id.txt_v_154_16);
        btn_Lifetime = (Button) view.findViewById(R.id.btn_Lifetime);
        btn_Lifetime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlert(btn_Lifetime.getTag().toString(), txt_v_154_16);
            }
        });

        return view;
    }

    private void showAlert(String MainField, EditText txt) {
        final String _MainField = MainField;
        final EditText _txt = txt;
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        LinearLayout layout = new LinearLayout(getActivity());
        LinearLayout chkboxholder = new LinearLayout(getActivity());
        alert.setTitle("PUMILI :");
        layout.setOrientation(LinearLayout.VERTICAL);
        chkboxholder.setOrientation(LinearLayout.VERTICAL);
        chkboxholder.setGravity(Gravity.LEFT);
        String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
        da = new MainDataBaseHandler(getActivity());
        Cursor cursor = da.getMyembroList(Config.ID, AndroidID, MainField);
        cursor.moveToFirst();
        for (int i = 0; i < cursor.getCount(); i++) {
            try {
                final CheckBox chk = new CheckBox(getActivity());
                chk.setTag(cursor.getString(0));
                chk.setText(cursor.getString(1));

                try {
                    if (cursor.getString(2).equals("1")) {
                        chk.setChecked(true);
                    }
                } catch (Exception xx) {
                }

                chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        String ischeck = "0";
                        if (isChecked) {
                            ischeck = "1";
                        }
                        da.UpdateGridData(_MainField, chk.getTag().toString(), Config.ID, ischeck);
                    }
                });


                chkboxholder.addView(chk);
                cursor.moveToNext();
            } catch (Exception xx) {
                String asd = xx.getMessage();
            }
        }
        final LinearLayout layout2 = chkboxholder;
        layout.addView(chkboxholder);
        alert.setView(layout);
        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
                _txt.setText(String.valueOf(da.getMyembrocount(Config.ID, AndroidID, _MainField)));
                dialog.cancel();
            }
        });

        alert.show();
    }


    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_v_147);
        this.cpar.putDropdown(R.id.cbo_v_148_month);
        this.cpar.putDropdown(R.id.cbo_v_148_day);
        this.cpar.putDropdown(R.id.cbo_v_148_year);
        // this.cpar.putCheckBox(R.id.chk_v_149);
        this.cpar.putEditText(R.id.txt_v_149);
        this.cpar.putCheckBox(R.id.chk_v_149_1);
        this.cpar.putDropdown(R.id.cbo_v_173_1_1);
        this.cpar.putCheckBox(R.id.chk_v_149_2);
        this.cpar.putDropdown(R.id.cbo_v_173_2_1);
        this.cpar.putCheckBox(R.id.chk_v_149_3);
        this.cpar.putDropdown(R.id.cbo_v_173_3_1);
        this.cpar.putCheckBox(R.id.chk_v_149_4);
        this.cpar.putDropdown(R.id.cbo_v_173_4_1);
        this.cpar.putCheckBox(R.id.chk_v_149_5);
        this.cpar.putDropdown(R.id.cbo_v_173_5_1);
        this.cpar.putCheckBox(R.id.chk_v_149_6);
        this.cpar.putCheckBox(R.id.chk_v_149_7);
        this.cpar.putCheckBox(R.id.chk_v_149_8);
        this.cpar.putCheckBox(R.id.chk_v_149_9);
        this.cpar.putCheckBox(R.id.chk_v_149_10);
        this.cpar.putCheckBox(R.id.chk_v_149_11);
        this.cpar.putCheckBox(R.id.chk_v_149_12);
        this.cpar.putCheckBox(R.id.chk_v_149_13);
        this.cpar.putCheckBox(R.id.chk_v_149_14);
        this.cpar.putCheckBox(R.id.chk_v_149_15);
        this.cpar.putCheckBox(R.id.chk_v_149_16);
        this.cpar.putCheckBox(R.id.chk_v_149_17);
        this.cpar.putEditText(R.id.txt_v_149_17);
        this.cpar.putDropdown(R.id.cbo_v_150_1);
        this.cpar.putDropdown(R.id.cbo_v_150_2);
        this.cpar.putDropdown(R.id.cbo_v_150_3);
        this.cpar.putDropdown(R.id.cbo_v_150_4);
        this.cpar.putDropdown(R.id.cbo_v_150_5);
        this.cpar.putDropdown(R.id.cbo_v_150_6);
        this.cpar.putDropdown(R.id.cbo_v_150_7);
        this.cpar.putDropdown(R.id.cbo_v_150_8);
        this.cpar.putDropdown(R.id.cbo_v_150_9);
        this.cpar.putDropdown(R.id.cbo_v_150_10);
        this.cpar.putDropdown(R.id.cbo_v_150_11);
        this.cpar.putDropdown(R.id.cbo_v_150_12);
        this.cpar.putDropdown(R.id.cbo_v_150_13);
        this.cpar.putDropdown(R.id.cbo_v_150_14);
        this.cpar.putDropdown(R.id.cbo_v_150_15);
        this.cpar.putDropdown(R.id.cbo_v_150_16);
        this.cpar.putEditText(R.id.txt_v_150_17);
        this.cpar.putDropdown(R.id.cbo_v_150_17);
        this.cpar.putEditText(R.id.txt_v_151_1);
        this.cpar.putEditText(R.id.txt_v_151_2);
        this.cpar.putEditText(R.id.txt_v_151_3);
        this.cpar.putEditText(R.id.txt_v_151_4);
        this.cpar.putEditText(R.id.txt_v_151_5);
        this.cpar.putEditText(R.id.txt_v_151_6);
        this.cpar.putEditText(R.id.txt_v_151_7);
        this.cpar.putEditText(R.id.txt_v_151_8);
        this.cpar.putEditText(R.id.txt_v_151_9);
        this.cpar.putEditText(R.id.txt_v_151_10);
        this.cpar.putEditText(R.id.txt_v_151_11);
        this.cpar.putEditText(R.id.txt_v_151_12);
        this.cpar.putEditText(R.id.txt_v_151_13);
        this.cpar.putEditText(R.id.txt_v_151_14);
        this.cpar.putEditText(R.id.txt_v_151_15);
        this.cpar.putEditText(R.id.txt_v_151_16);
        this.cpar.putEditText(R.id.txt_v_151_17);
        this.cpar.putDropdown(R.id.cbo_v_152_1);
        this.cpar.putDropdown(R.id.cbo_v_152_2);
        this.cpar.putDropdown(R.id.cbo_v_152_3);
        this.cpar.putDropdown(R.id.cbo_v_152_4);
        this.cpar.putDropdown(R.id.cbo_v_152_5);
        this.cpar.putDropdown(R.id.cbo_v_152_6);
        this.cpar.putDropdown(R.id.cbo_v_152_7);
        this.cpar.putDropdown(R.id.cbo_v_152_8);
        this.cpar.putDropdown(R.id.cbo_v_152_9);
        this.cpar.putDropdown(R.id.cbo_v_152_10);
        this.cpar.putDropdown(R.id.cbo_v_152_11);
        this.cpar.putDropdown(R.id.cbo_v_152_12);
        this.cpar.putDropdown(R.id.cbo_v_152_13);
        this.cpar.putDropdown(R.id.cbo_v_152_14);
        this.cpar.putDropdown(R.id.cbo_v_152_15);
        this.cpar.putDropdown(R.id.cbo_v_152_16);
        this.cpar.putEditText(R.id.txt_v_152_17);
        this.cpar.putDropdown(R.id.cbo_v_152_17);
        this.cpar.putEditText(R.id.txt_v_153_1);
        this.cpar.putEditText(R.id.txt_v_153_2);
        this.cpar.putEditText(R.id.txt_v_153_3);
        this.cpar.putEditText(R.id.txt_v_153_4);
        this.cpar.putEditText(R.id.txt_v_153_5);
        this.cpar.putEditText(R.id.txt_v_153_6);
        this.cpar.putEditText(R.id.txt_v_153_7);
        this.cpar.putEditText(R.id.txt_v_153_8);
        this.cpar.putEditText(R.id.txt_v_153_9);
        this.cpar.putEditText(R.id.txt_v_153_10);
        this.cpar.putEditText(R.id.txt_v_153_11);
        this.cpar.putEditText(R.id.txt_v_153_12);
        this.cpar.putEditText(R.id.txt_v_153_13);
        this.cpar.putEditText(R.id.txt_v_153_14);
        this.cpar.putEditText(R.id.txt_v_153_15);
        this.cpar.putEditText(R.id.txt_v_153_16);
        this.cpar.putEditText(R.id.txt_v_153_17);
        this.cpar.putEditText(R.id.txt_v_154_1);
        this.cpar.putEditText(R.id.txt_v_154_2);
        this.cpar.putEditText(R.id.txt_v_154_3);
        this.cpar.putEditText(R.id.txt_v_154_4);
        this.cpar.putEditText(R.id.txt_v_154_5);
        this.cpar.putEditText(R.id.txt_v_154_6);
        this.cpar.putEditText(R.id.txt_v_154_7);
        this.cpar.putEditText(R.id.txt_v_154_8);
        this.cpar.putEditText(R.id.txt_v_154_9);
        this.cpar.putEditText(R.id.txt_v_154_10);
        this.cpar.putEditText(R.id.txt_v_154_11);
        this.cpar.putEditText(R.id.txt_v_154_12);
        this.cpar.putEditText(R.id.txt_v_154_13);
        this.cpar.putEditText(R.id.txt_v_154_14);
        this.cpar.putEditText(R.id.txt_v_154_15);
        this.cpar.putEditText(R.id.txt_v_154_16);

        da.c_Update(cpar);
        super.onDestroy();
    }


}

