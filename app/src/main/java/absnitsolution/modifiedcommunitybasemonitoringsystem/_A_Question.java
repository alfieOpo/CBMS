package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TimePicker;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class _A_Question extends Fragment implements View.OnClickListener {
    EditText txt_Oras_Nagsimula, txt_a_numero, txt_a_tirahan;
    String alex;
    c_params cpar;
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_a_miyembro_dikasama, cbo_a_miyembro_ofw, cbo_a_miyembro_solomagulang, cbo_a_miyembro_maykapansanan, cbo_a_miyembro_seniorcitizen, cbo_a_miyembro_nakapasa, cbo_a_ilan_miyembro, cbo_a_ilan_magasawa, cbo_a_miyembro_namatay;
    String DialogText = "MAGDAGDAG NG IBA PANG IMPORMASYON?";
    Button btn_myembro_ng_pamilya, btn_ofw, btn_kapamilya_na_solo_parent, btn_mga_kapamilya_na_may_kapansanan, btn_mga_kapamilya_na_senior_citizen, btn_mga_pamilya_na_nakapasa_sa_board_o_bar_exam, btn_mga_dating_kapamilya, btn_a_ilan_magasawa, btn_ibang_myembro;
    DateFormat formatDateTime = DateFormat.getDateTimeInstance();
    Calendar dateTime = Calendar.getInstance();
    CheckBox chk_a_callback;
    ImageButton btn_back, btn_next;
    List<String> list;
    EditText txt_a_pangalantagapanayam;
    TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            dateTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            dateTime.set(Calendar.MINUTE, minute);
            txt_Oras_Nagsimula.setText(formatDateTime.format(dateTime.getTime()));
        }
    };


    public _A_Question() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment___a__question, container, false);

        list = new ArrayList<>();

        this.cpar = new c_params(Config.ID, container, view);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        btn_myembro_ng_pamilya = (Button) view.findViewById(R.id.btn_myembro_ng_pamilya);
        btn_ofw = (Button) view.findViewById(R.id.btn_ofw);
        btn_ibang_myembro = (Button) view.findViewById(R.id.btn_ibang_myembro);
        btn_a_ilan_magasawa = (Button) view.findViewById(R.id.btn_a_ilan_magasawa);
        btn_kapamilya_na_solo_parent = (Button) view.findViewById(R.id.btn_kapamilya_na_solo_parent);
        btn_mga_kapamilya_na_may_kapansanan = (Button) view.findViewById(R.id.btn_mga_kapamilya_na_may_kapansanan);
        btn_mga_kapamilya_na_senior_citizen = (Button) view.findViewById(R.id.btn_mga_kapamilya_na_senior_citizen);
        btn_mga_pamilya_na_nakapasa_sa_board_o_bar_exam = (Button) view.findViewById(R.id.btn_mga_pamilya_na_nakapasa_sa_board_o_bar_exam);
        btn_mga_dating_kapamilya = (Button) view.findViewById(R.id.btn_mga_dating_kapamilya);
        txt_a_tirahan = (EditText) view.findViewById(R.id.txt_a_tirahan);
        txt_a_pangalantagapanayam = (EditText) view.findViewById(R.id.txt_a_pangalantagapanayam);
        chk_a_callback = (CheckBox) view.findViewById(R.id.chk_a_callback);

        btn_myembro_ng_pamilya.setOnClickListener(this);
        btn_ofw.setOnClickListener(this);
        btn_kapamilya_na_solo_parent.setOnClickListener(this);
        btn_mga_kapamilya_na_may_kapansanan.setOnClickListener(this);
        btn_mga_kapamilya_na_senior_citizen.setOnClickListener(this);
        btn_mga_pamilya_na_nakapasa_sa_board_o_bar_exam.setOnClickListener(this);
        btn_mga_dating_kapamilya.setOnClickListener(this);
        btn_ibang_myembro.setOnClickListener(this);
        btn_a_ilan_magasawa.setOnClickListener(this);




        cbo_a_miyembro_namatay = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_namatay);
        cbo_a_miyembro_dikasama = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_dikasama);
        cbo_a_miyembro_ofw = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_ofw);
        cbo_a_miyembro_solomagulang = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_solomagulang);
        cbo_a_miyembro_maykapansanan = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_maykapansanan);
        cbo_a_miyembro_seniorcitizen = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_seniorcitizen);
        cbo_a_miyembro_nakapasa = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_nakapasa);
        cbo_a_ilan_miyembro = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_ilan_miyembro);
        cbo_a_ilan_magasawa = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_ilan_magasawa);


        txt_a_numero = (EditText) view.findViewById(R.id.txt_a_numero);

        this.cpar.setDropdown(R.id.cbo_a_miyembro_namatay, R.array.ilan_wala, "Wala");

        this.cpar.setDropdown(R.id.cbo_a_miyembro_nakapasa, R.array.ilan_wala, "Wala");
        this.cpar.setDropdown(R.id.cbo_a_miyembro_seniorcitizen, R.array.ilan_wala, "Wala");
        this.cpar.setDropdown(R.id.cbo_a_miyembro_maykapansanan, R.array.ilan_wala, "Wala");
        this.cpar.setDropdown(R.id.cbo_a_miyembro_solomagulang, R.array.ilan_wala, "Wala");
        this.cpar.setDropdown(R.id.cbo_a_miyembro_ofw, R.array.ilan_wala,"Wala");
        this.cpar.setDropdown(R.id.cbo_a_miyembro_dikasama, R.array.ilan_wala, "Wala");
        this.cpar.setDropdown(R.id.cbo_a_ilan_magasawa, R.array.ilan_wala, "Wala");
        this.cpar.setDropdown(R.id.cbo_a_ilan_miyembro, R.array.ilan_wala, "Wala");
        this.cpar.setEditText(R.id.txt_a_orasnagsimula);
        this.cpar.setEditText(R.id.txt_a_numero);
        this.cpar.setCheckBox(R.id.chk_a_callback);
        Config.CallbackIsCheck = chk_a_callback.isChecked();
        this.cpar.setEditText(R.id.txt_a_nakapanayam);
        this.cpar.setEditText(R.id.txt_a_pangalantagapanayam);


        if(txt_a_pangalantagapanayam.getText().toString().equals("")){
            txt_a_pangalantagapanayam.setText(Config.Tagapanayam);
        }

        // this.cpar.setEditText(R.id.txt_a_puna);
        this.cpar.setEditText(R.id.txt_a_tirahan);
        this.cpar.setCheckBox(R.id.chk_a_hindinagpaunlak);
        if (txt_a_numero.getText().toString().equals("")) {
            txt_a_numero.setText(Config.PersonCode());
        }
        txt_Oras_Nagsimula = (EditText) view.findViewById(R.id.txt_a_orasnagsimula);

        cbo_a_ilan_miyembro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                       @Override
                                                       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                           if (validTOview(cbo_a_ilan_miyembro.getText().toString())) {

                                                               AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                                                               builder2.setIcon(R.drawable.edit_file);
                                                               builder2.setMessage(DialogText);
                                                               builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {

                                                                       LoadIntent("1", cbo_a_ilan_miyembro, "ga_1st", "_1st_001");


                                                                   }
                                                               });
                                                               builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                                                                   public void onClick(DialogInterface dialog, int id) {

                                                                   }
                                                               });
                                                               AlertDialog dialog2 = builder2.create();
                                                               dialog2.show();


                                                           } else {

                                                           }

                                  }
                                                   }
        );
        cbo_a_miyembro_dikasama.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_dikasama.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            LoadIntent("2", cbo_a_miyembro_dikasama, "ga_2nd", "_2nd_001");


                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();

                } else {

                }
            }
        });

        cbo_a_miyembro_ofw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_ofw.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            LoadIntent("3", cbo_a_miyembro_ofw, "ga_3rd", "_3rd_001");
                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                } else {

                }
            }
        });
        cbo_a_miyembro_solomagulang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_solomagulang.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            LoadIntent("4", cbo_a_miyembro_solomagulang, "ga_4th", "_4th_001");
                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                } else {

                }

            }
        });
        cbo_a_miyembro_maykapansanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_maykapansanan.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {


                            LoadIntent("5", cbo_a_miyembro_maykapansanan, "ga_5th", "_5th_001");


                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                } else {

                }

            }
        });
        cbo_a_miyembro_seniorcitizen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_seniorcitizen.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            LoadIntent("6", cbo_a_miyembro_seniorcitizen, "ga_6th", "_6th_001");


                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                } else {

                }

            }
        });
        cbo_a_miyembro_nakapasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_nakapasa.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {


                            LoadIntent("8", cbo_a_miyembro_nakapasa, "ga_8th", "_8th_001");


                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                } else {

                }

            }
        });

        cbo_a_ilan_magasawa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_ilan_magasawa.getText().toString())) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            LoadIntent("9", cbo_a_ilan_magasawa, "ga_9th", "_9th_001");

                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();
                } else {
                }

            }
        });
        cbo_a_miyembro_namatay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (validTOview(cbo_a_miyembro_namatay.getText().toString())) {

                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage(DialogText);
                    builder2.setPositiveButton("OO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            LoadIntent("10", cbo_a_miyembro_namatay, "ga_10th", "_10th_001");
                        }
                    });
                    builder2.setNegativeButton("HINDI", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();

                } else {

                }
            }
        });
        if (txt_Oras_Nagsimula.getText().toString().equals("")) {
            txt_Oras_Nagsimula.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    updateTime();
                    return false;
                }
            });
            updateTime();
        }
        chk_a_callback.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Config.CallbackIsCheck = isChecked;
            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = New.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "A. PAGKAKAKILANLAN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                list.clear();
                addField(txt_a_tirahan.getText().toString());
                addField(cbo_a_miyembro_namatay.getText().toString());
                addField(cbo_a_miyembro_nakapasa.getText().toString());
                addField(cbo_a_miyembro_seniorcitizen.getText().toString());
                addField(cbo_a_miyembro_maykapansanan.getText().toString());
                addField(cbo_a_miyembro_solomagulang.getText().toString());
                addField(cbo_a_miyembro_ofw.getText().toString());
                addField(cbo_a_ilan_magasawa.getText().toString());
                addField(cbo_a_ilan_miyembro.getText().toString());


                if (Valid()) {
                    Fragment fragment = null;
                    try {
                        fragment = _U_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "I-E. DALAS NG PAGKAIN").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important field.!", Toast.LENGTH_SHORT).show();
                }

                Config.ColorTheVIEW(txt_a_tirahan,"Tirahan ng Pamilya");
                Config.ColorTheVIEW(cbo_a_miyembro_namatay,"73. Mayroon ba kayong dating kapamilya na namatay noong nakaraang 12 buwan?");
                Config.ColorTheVIEW(cbo_a_miyembro_nakapasa,"62. Mayroon ba kayong kapamilya na nakapasa sa board o bar exam?");
                Config.ColorTheVIEW(cbo_a_miyembro_seniorcitizen,"54. May miyembro ba ang pamilya na may 60 taong gulang pataas?");
                Config.ColorTheVIEW(cbo_a_miyembro_maykapansanan,"48. May miyembro ba ng pamilya na may kapansanan?");
                Config.ColorTheVIEW(cbo_a_miyembro_solomagulang,"45. May miyembro ba ng pamilya na solong magulang na may kinakalingang anak");
                Config.ColorTheVIEW(cbo_a_miyembro_ofw,"40. Mayroon ba kayong dating kapamilya na OFW?");
                Config.ColorTheVIEW(cbo_a_ilan_miyembro,"Ilang Miyembro mayroon dito sa inyong pamilya?");

            }
        });

        return view;
    }

    private void updateTime() {
        TimePickerDialog time = new TimePickerDialog(getContext(), t, dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE), false);
        time.setTitle("Oras Nagsimula");
        time.show();
    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putEditText(R.id.txt_a_numero);
        this.cpar.putEditText(R.id.txt_a_orasnagsimula);
        this.cpar.putCheckBox(R.id.chk_a_callback);
        this.cpar.putEditText(R.id.txt_a_nakapanayam);
        this.cpar.putEditText(R.id.txt_a_pangalantagapanayam);
        // this.cpar.putEditText(R.id.txt_a_puna);
        this.cpar.putEditText(R.id.txt_a_tirahan);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_namatay);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_nakapasa);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_seniorcitizen);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_maykapansanan);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_solomagulang);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_ofw);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_dikasama);
        this.cpar.putDropdown(R.id.cbo_a_ilan_magasawa);
        this.cpar.putDropdown(R.id.cbo_a_ilan_miyembro);
        this.cpar.putCheckBox(R.id.chk_a_hindinagpaunlak);
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


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_myembro_ng_pamilya:
                if (validTOview(cbo_a_ilan_miyembro.getText().toString())) {
                    LoadIntent("1", cbo_a_ilan_miyembro, "ga_1st", "_1st_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_ibang_myembro:
                if (validTOview(cbo_a_miyembro_dikasama.getText().toString())) {
                    LoadIntent("2", cbo_a_miyembro_dikasama, "ga_2nd", "_2nd_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
            case R.id.btn_ofw:
                if (validTOview(cbo_a_miyembro_ofw.getText().toString())) {
                    LoadIntent("3", cbo_a_miyembro_ofw, "ga_3rd", "_3rd_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_kapamilya_na_solo_parent:
                if (validTOview(cbo_a_miyembro_solomagulang.getText().toString())) {
                    LoadIntent("4", cbo_a_miyembro_solomagulang, "ga_4th", "_4th_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_mga_kapamilya_na_may_kapansanan:
                if (validTOview(cbo_a_miyembro_maykapansanan.getText().toString())) {
                    LoadIntent("5", cbo_a_miyembro_maykapansanan, "ga_5th", "_5th_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_mga_kapamilya_na_senior_citizen:
                if (validTOview(cbo_a_miyembro_seniorcitizen.getText().toString())) {
                    LoadIntent("6", cbo_a_miyembro_seniorcitizen, "ga_6th", "_6th_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_mga_pamilya_na_nakapasa_sa_board_o_bar_exam:
                if (validTOview(cbo_a_miyembro_nakapasa.getText().toString())) {
                    LoadIntent("8", cbo_a_miyembro_nakapasa, "ga_8th", "_8th_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_a_ilan_magasawa:
                if (validTOview(cbo_a_ilan_magasawa.getText().toString())) {
                    LoadIntent("9", cbo_a_ilan_magasawa, "ga_9th", "_9th_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_mga_dating_kapamilya:
                if (validTOview(cbo_a_miyembro_namatay.getText().toString())) {
                    LoadIntent("10", cbo_a_miyembro_namatay, "ga_10th", "_10th_001");
                } else {
                    Toast.makeText(getActivity(), "No Data Found to View.", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }

    private boolean validTOview(String value) {

        try {
            int i = Integer.valueOf(value);
            return true;
        } catch (Exception xx) {
            return false;
        }

    }

    private void addField(String value) {
        list.add(value);
    }

    private boolean Valid() {

        for (String value : list) {
            if (value.equals("Select One") || value.equals("")) {
                return false;
            }
        }
        return true;
    }
}
