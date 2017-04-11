package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class _1ststatedrow_Question extends Fragment {

    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
    EditText txt_kapanganakan, txt_1st_edad;
    MaterialBetterSpinner cbo_1st_relasyon, cbo_1st_relihiyon, cbo_1st_wika, cbo_1st_nagaaralba, cbo_1st_baitang, cbo_1st_baaynagaaral,
            cbo_1st_kungnagaaral, cbo_1st_kunghindinagaaral, cbo_1st_natapos, cbo_1st_kasanayan, cbo_1st_samahan, cbo_1st_klasengsamahan,
            cbo_1st_botante, cbo_1st_saanrehistrado, cbo_1st_bumoto, cbo_1st_hanapbuhay;
    EditText txt_1st_ibapa_miyembro, txt_1st_ibapa_relihiyon, txt_1st_ibapa_wika, txt_1st_specifycourse, txt_1st_specifynatapos, txt_1st_ibapa_kasanayan,
            txt_1st_pangalan_organisasyon, txt_1st_ibapa_klasengsamahan, txt_1st_ibapa_rehistrado;
    private int mYear, mMonth, mDay, mHour, mMinute;


    public _1ststatedrow_Question() {
        // Required empty public constructor
        //Config.Grid_ID = "1";
    }

    public static String formateDateFromstring(String inputFormat, String outputFormat, String inputDate) {

        Date parsed = null;
        String outputDate = "";

        SimpleDateFormat df_input = new SimpleDateFormat(inputFormat, java.util.Locale.getDefault());
        SimpleDateFormat df_output = new SimpleDateFormat(outputFormat, java.util.Locale.getDefault());

        try {
            parsed = df_input.parse(inputDate);
            outputDate = df_output.format(parsed);

        } catch (ParseException e) {
        }
        return outputDate;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        this._key = getArguments().getString("_id");

        View view = inflater.inflate(R.layout.fragment___1ststatedrow__question, container, false);
        txt_kapanganakan = (EditText) view.findViewById(R.id.txt_kapanganakan);
        txt_1st_edad = (EditText) view.findViewById(R.id.txt_1st_edad);
        txt_1st_ibapa_miyembro = (EditText) view.findViewById(R.id.txt_1st_ibapa_miyembro);
        txt_1st_ibapa_relihiyon = (EditText) view.findViewById(R.id.txt_1st_ibapa_relihiyon);
        txt_1st_ibapa_wika = (EditText) view.findViewById(R.id.txt_1st_ibapa_wika);
        txt_1st_specifycourse = (EditText) view.findViewById(R.id.txt_1st_specifycourse);
        txt_1st_specifynatapos = (EditText) view.findViewById(R.id.txt_1st_specifynatapos);
        txt_1st_ibapa_kasanayan = (EditText) view.findViewById(R.id.txt_1st_ibapa_kasanayan);
        txt_1st_pangalan_organisasyon = (EditText) view.findViewById(R.id.txt_1st_pangalan_organisasyon);
        txt_1st_ibapa_klasengsamahan = (EditText) view.findViewById(R.id.txt_1st_ibapa_klasengsamahan);
        txt_1st_ibapa_rehistrado = (EditText) view.findViewById(R.id.txt_1st_ibapa_rehistrado);

        cbo_1st_relasyon = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_relasyon);
        cbo_1st_relihiyon = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_relihiyon);
        cbo_1st_wika = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_wika);
        cbo_1st_nagaaralba = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_nagaaralba);
        cbo_1st_baitang = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_baitang);
        cbo_1st_baaynagaaral = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_baaynagaaral);
        cbo_1st_kungnagaaral = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_kungnagaaral);
        cbo_1st_kunghindinagaaral = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_kunghindinagaaral);
        cbo_1st_natapos = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_natapos);
        cbo_1st_kasanayan = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_kasanayan);
        cbo_1st_samahan = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_samahan);
        cbo_1st_klasengsamahan = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_klasengsamahan);
        cbo_1st_botante = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_botante);
        cbo_1st_saanrehistrado = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_saanrehistrado);
        cbo_1st_bumoto = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_bumoto);
        cbo_1st_hanapbuhay = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_hanapbuhay);

        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_1st");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_kapanganakan);
        this.cpar.setDropdown(R.id.cbo_1st_relasyon, R.array._1st_relasyon, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_kasarian, R.array._1st_kasarian, "Select One");

        this.cpar.setDropdown(R.id.cbo_1st_nakarehistro, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_katayuangsibil, R.array._1st_katayuang_civil, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_relihiyon, R.array._1st_relihiyon, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_wika, R.array._1st_wika, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_gaanokatagal, R.array._1st_gaanokatagalnanirahan, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_nagaaralba, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_baitang, R.array._1st_baitang, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_baaynagaaral, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_kungnagaaral, R.array._1st_publiko_pribado, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_kunghindinagaaral, R.array._1st_kung_hindinagaral, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_natapos, R.array._1st_baitang, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_kasanayan, R.array._1st_kasanayan, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_saannagaral_kasanayan, R.array._1st_saannagsanay, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_samahan, R.array.meron_wala, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_klasengsamahan, R.array._1st_klasengsamahan, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_botante, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_saanrehistrado, R.array._1st_saanbotante, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_bumoto, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_hanapbuhay, R.array.meron_wala, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_uringhanapbuhay, R.array._1st_uringhanapbuhay, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_uringnegosyo, R.array._1st_uringnegosyo, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_katayuan_trabaho, R.array._1st_katayuansahanapbuhay, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_uringmanggagawa, R.array._1st_uringmanggagawa, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_naghanap_trabaho, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_hakbang, R.array._1st_hakbang, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_hindinaghanap, R.array._1st_bakithindinaghanap, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_hulingnaghanap, R.array._1st_kailan_hulingnaghanap, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_available, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_1st_willing, R.array.oo_hindi, "Select One");
        this.cpar.setEditText(R.id.txt_1st_miyembro);
        this.cpar.setCheckBox(R.id.chk_1st_nakakabasa);
        this.cpar.setCheckBox(R.id.chk_1st_nakakasulat);
        this.cpar.setCheckBox(R.id.chk_1st_nakakapagkwento);

        txt_kapanganakan.setOnClickListener(new View.OnClickListener() {
                                                @Override
                                                public void onClick(View v) {
                                                    final Calendar c = Calendar.getInstance();
                                                    mYear = c.get(Calendar.YEAR);
                                                    mMonth = c.get(Calendar.MONTH);
                                                    mDay = c.get(Calendar.DAY_OF_MONTH);
                                                    // Launch Date Picker Dialog
                                                    DatePickerDialog dpd = new DatePickerDialog(getActivity(),
                                                            new DatePickerDialog.OnDateSetListener() {
                                                                @Override
                                                                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                                                    // Display Selected date in textbox
                                                                    String date = dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;
                                                                    String NewDate = formateDateFromstring("dd-MM-yyyy", "EEE, MMM d, yyyy", date);
                                                                    txt_kapanganakan.setText(NewDate);


                                                                    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                                                                    int current_year = calendar.get(Calendar.DATE);


                                                                    try {
                                                                        txt_1st_edad.setText(getAge(year, (monthOfYear + 1), dayOfMonth));
                                                                    } catch (Exception xx) {
                                                                    }
                                                                }
                                                            }, mYear, mMonth, mDay);
                                                    dpd.show();
                                                }
                                            }
        );

        cbo_1st_relasyon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 8 || position == 6) {

                    txt_1st_ibapa_miyembro.setEnabled(true);

                } else {
                    txt_1st_ibapa_miyembro.setEnabled(false);
                }
            }
        });

        cbo_1st_relihiyon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 5) {
                    txt_1st_ibapa_relihiyon.setEnabled(true);
                } else {
                    txt_1st_ibapa_relihiyon.setEnabled(false);
                }
            }
        });

        cbo_1st_wika.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 5) {
                    txt_1st_ibapa_wika.setEnabled(true);
                } else {
                    txt_1st_ibapa_wika.setEnabled(false);
                }
            }
        });

        cbo_1st_nagaaralba.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) {
                    cbo_1st_baitang.setClickable(false);
                    cbo_1st_baitang.setEnabled(false);
                    txt_1st_specifycourse.setEnabled(false);
                } else {
                    cbo_1st_baitang.setClickable(true);
                    cbo_1st_baitang.setEnabled(true);
                    txt_1st_specifycourse.setEnabled(true);
                }
            }
        });


        cbo_1st_baitang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 24 || i == 29 || i == 31) {
                    txt_1st_specifycourse.setEnabled(true);
                } else {
                    txt_1st_specifycourse.setEnabled(false);
                }
            }
        });


        cbo_1st_baaynagaaral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // hindi
                {
                    cbo_1st_kungnagaaral.setEnabled(false);
                    cbo_1st_kungnagaaral.setClickable(false);
                    cbo_1st_kunghindinagaaral.setEnabled(true);
                    cbo_1st_kunghindinagaaral.setClickable(true);
                } else {
                    cbo_1st_kungnagaaral.setEnabled(true);
                    cbo_1st_kungnagaaral.setClickable(true);
                    cbo_1st_kunghindinagaaral.setEnabled(false);
                    cbo_1st_kunghindinagaaral.setClickable(false);
                }
            }
        });

        cbo_1st_natapos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 24 || i == 29 || i == 31) {
                    txt_1st_specifynatapos.setEnabled(true);

                } else {
                    txt_1st_specifynatapos.setEnabled(false);

                }
            }
        });

        cbo_1st_kasanayan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 6) {
                    txt_1st_ibapa_kasanayan.setEnabled(true);

                } else {
                    txt_1st_ibapa_kasanayan.setEnabled(false);

                }
            }
        });

        cbo_1st_samahan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // wala
                {
                    txt_1st_pangalan_organisasyon.setEnabled(false);
                    cbo_1st_klasengsamahan.setEnabled(false);
                } else {
                    txt_1st_pangalan_organisasyon.setEnabled(true);
                    cbo_1st_klasengsamahan.setEnabled(true);
                }
            }
        });

        cbo_1st_klasengsamahan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 10) // ibapa
                {
                    txt_1st_ibapa_klasengsamahan.setEnabled(true);
                } else {
                    txt_1st_ibapa_klasengsamahan.setEnabled(false);
                }
            }
        });


        cbo_1st_botante.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // hindi
                {
                    cbo_1st_saanrehistrado.setEnabled(false);
                    cbo_1st_bumoto.setEnabled(false);
                    txt_1st_ibapa_rehistrado.setEnabled(false);
                } else {
                    cbo_1st_saanrehistrado.setEnabled(true);
                    cbo_1st_bumoto.setEnabled(true);
                    txt_1st_ibapa_rehistrado.setEnabled(false);
                }
            }
        });


        cbo_1st_saanrehistrado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // iba pa
                {
                    txt_1st_ibapa_rehistrado.setEnabled(true);
                } else {
                    txt_1st_ibapa_rehistrado.setEnabled(false);
                }
            }
        });


        cbo_1st_hanapbuhay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // iba pa
                {
             /*       txt_1st_hanapbuhay.setEnabled(true);
                    cbo_1st_uringhanapbuhay .setEnabled(true);
                    txt_1st_saangnegosyo.setEnabled(true);
                    cbo_1st_uringnegosyo
                            cbo_1st_katayuan_trabaho
                    cbo_1st_uringmanggagawa
                            cbo_1st_naghanap_trabaho
                    cbo_1st_hakbang
                            txt_1st_ibapa_hakbang
                    cbo_1st_hindinaghanap   */

                } else {
                    txt_1st_ibapa_rehistrado.setEnabled(false);
                }
            }
        });


        return view;
    }

    @Override
    public void onDestroy() {

        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_kapanganakan);
        this.cpar.putEditText(R.id.txt_1st_miyembro);
        this.cpar.putDropdown(R.id.cbo_1st_relasyon);
        this.cpar.putEditText(R.id.txt_1st_ibapa_miyembro);
        this.cpar.putDropdown(R.id.cbo_1st_kasarian);

        this.cpar.putEditText(R.id.txt_1st_edad);
        this.cpar.putDropdown(R.id.cbo_1st_nakarehistro);
        this.cpar.putDropdown(R.id.cbo_1st_katayuangsibil);
        this.cpar.putDropdown(R.id.cbo_1st_relihiyon);
        this.cpar.putEditText(R.id.txt_1st_ibapa_relihiyon);
        this.cpar.putDropdown(R.id.cbo_1st_wika);
        this.cpar.putEditText(R.id.txt_1st_ibapa_wika);
        this.cpar.putCheckBox(R.id.chk_1st_nakakabasa);
        this.cpar.putCheckBox(R.id.chk_1st_nakakasulat);
        this.cpar.putCheckBox(R.id.chk_1st_nakakapagkwento);
        this.cpar.putDropdown(R.id.cbo_1st_gaanokatagal);
        this.cpar.putEditText(R.id.txt_1st_saannanirahan);
        this.cpar.putDropdown(R.id.cbo_1st_nagaaralba);
        this.cpar.putDropdown(R.id.cbo_1st_baitang);
        this.cpar.putEditText(R.id.txt_1st_specifycourse);
        this.cpar.putDropdown(R.id.cbo_1st_baaynagaaral);
        this.cpar.putDropdown(R.id.cbo_1st_kungnagaaral);
        this.cpar.putDropdown(R.id.cbo_1st_kunghindinagaaral);
        this.cpar.putDropdown(R.id.cbo_1st_natapos);
        this.cpar.putEditText(R.id.txt_1st_specifynatapos);
        this.cpar.putDropdown(R.id.cbo_1st_kasanayan);
        this.cpar.putEditText(R.id.txt_1st_ibapa_kasanayan);
        this.cpar.putDropdown(R.id.cbo_1st_saannagaral_kasanayan);
        this.cpar.putDropdown(R.id.cbo_1st_samahan);
        this.cpar.putEditText(R.id.txt_1st_pangalan_organisasyon);
        this.cpar.putDropdown(R.id.cbo_1st_klasengsamahan);
        this.cpar.putEditText(R.id.txt_1st_ibapa_klasengsamahan);
        this.cpar.putDropdown(R.id.cbo_1st_botante);
        this.cpar.putDropdown(R.id.cbo_1st_saanrehistrado);
        this.cpar.putEditText(R.id.txt_1st_ibapa_rehistrado);
        this.cpar.putDropdown(R.id.cbo_1st_bumoto);
        this.cpar.putDropdown(R.id.cbo_1st_hanapbuhay);
        this.cpar.putEditText(R.id.txt_1st_hanapbuhay);
        this.cpar.putDropdown(R.id.cbo_1st_uringhanapbuhay);
        this.cpar.putEditText(R.id.txt_1st_saangnegosyo);
        this.cpar.putDropdown(R.id.cbo_1st_uringnegosyo);
        this.cpar.putDropdown(R.id.cbo_1st_katayuan_trabaho);
        this.cpar.putDropdown(R.id.cbo_1st_uringmanggagawa);
        this.cpar.putDropdown(R.id.cbo_1st_naghanap_trabaho);
        this.cpar.putDropdown(R.id.cbo_1st_hakbang);
        this.cpar.putEditText(R.id.txt_1st_ibapa_hakbang);
        this.cpar.putDropdown(R.id.cbo_1st_hindinaghanap);
        this.cpar.putEditText(R.id.txt_1st_ibapa_hindinaghanap);
        this.cpar.putDropdown(R.id.cbo_1st_hulingnaghanap);
        this.cpar.putDropdown(R.id.cbo_1st_available);
        this.cpar.putDropdown(R.id.cbo_1st_willing);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_1st");
        super.onDestroy();
    }

    private String getAge(int year, int month, int day) {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();
        dob.set(year, month, day);
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if ((today.get(Calendar.MONTH) + 1) < (dob.get(Calendar.MONTH) + 1)) {
            if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
                age--;
            }
        }
        Integer ageInt = new Integer(age);
        String ageS = ageInt.toString();

        return ageS;
    }
}