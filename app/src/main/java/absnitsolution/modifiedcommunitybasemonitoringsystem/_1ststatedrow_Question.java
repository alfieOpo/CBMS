package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

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
    MaterialBetterSpinner cbo_1st_relasyon, cbo_1st_relihiyon, cbo_1st_wika, cbo_1st_nagaaralba,
            cbo_1st_kungnagaaral, cbo_1st_kunghindinagaaral, cbo_1st_natapos, cbo_1st_kasanayan, cbo_1st_samahan, cbo_1st_klasengsamahan,
            cbo_1st_botante, cbo_1st_saanrehistrado, cbo_1st_bumoto, cbo_1st_hanapbuhay,
            cbo_1st_uringhanapbuhay, cbo_1st_uringnegosyo, cbo_1st_katayuan_trabaho, cbo_1st_uringmanggagawa, cbo_1st_naghanap_trabaho, cbo_1st_hakbang,
             cbo_1st_hindinaghanap, cbo_1st_hulingnaghanap, cbo_1st_available, cbo_1st_willing, cbo_1st_saannagaral_kasanayan

              ;

    EditText txt_1st_miyembro, txt_1st_ibapa_miyembro, txt_1st_ibapa_relihiyon, txt_1st_ibapa_wika, txt_1st_specifycourse, txt_1st_specifynatapos, txt_1st_ibapa_kasanayan,
            txt_1st_pangalan_organisasyon, txt_1st_ibapa_klasengsamahan, txt_1st_ibapa_rehistrado, txt_1st_ibapa_hindinagaral,
            txt_1st_others_uringnegosyo, txt_1st_hanapbuhay, txt_1st_other_pangunahinghanapbuhay,
            txt_1st_saangnegosyo, txt_1st_ibapa_hakbang , txt_1st_ibapa_hindinaghanap;

    TextView text_24, text_28, text_29,  text_32, text_33;



    private int mYear, mMonth, mDay, mHour, mMinute;



    CheckBox chk_1st_puno;

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
        txt_1st_specifynatapos = (EditText) view.findViewById(R.id.txt_1st_specifynatapos);
        txt_1st_ibapa_kasanayan = (EditText) view.findViewById(R.id.txt_1st_ibapa_kasanayan);
        txt_1st_pangalan_organisasyon = (EditText) view.findViewById(R.id.txt_1st_pangalan_organisasyon);
        txt_1st_ibapa_klasengsamahan = (EditText) view.findViewById(R.id.txt_1st_ibapa_klasengsamahan);
        txt_1st_ibapa_rehistrado = (EditText) view.findViewById(R.id.txt_1st_ibapa_rehistrado);
        txt_1st_ibapa_hindinagaral = (EditText) view.findViewById(R.id.txt_1st_ibapa_hindinagaral);
        txt_1st_other_pangunahinghanapbuhay = (EditText) view.findViewById(R.id.txt_1st_other_pangunahinghanapbuhay);
        txt_1st_others_uringnegosyo = (EditText) view.findViewById(R.id.txt_1st_others_uringnegosyo);
        txt_1st_ibapa_hakbang = (EditText) view.findViewById(R.id.txt_1st_ibapa_hakbang);
        txt_1st_ibapa_hindinaghanap = (EditText) view.findViewById(R.id.txt_1st_ibapa_hindinaghanap);
        txt_1st_hanapbuhay = (EditText) view.findViewById(R.id.txt_1st_hanapbuhay);
        txt_1st_saangnegosyo = (EditText) view.findViewById(R.id.txt_1st_saangnegosyo);
        txt_1st_miyembro = (EditText) view.findViewById(R.id.txt_1st_miyembro);

        chk_1st_puno =(CheckBox)view.findViewById(R.id.chk_1st_puno);

        cbo_1st_relasyon = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_relasyon);
        cbo_1st_relihiyon = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_relihiyon);
        cbo_1st_wika = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_wika);
        cbo_1st_nagaaralba = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_nagaaralba);
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
        cbo_1st_uringnegosyo = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_uringnegosyo);
        cbo_1st_hakbang = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_hakbang);
        cbo_1st_uringhanapbuhay = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_uringhanapbuhay);
        cbo_1st_katayuan_trabaho = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_katayuan_trabaho);
        cbo_1st_uringmanggagawa = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_uringmanggagawa);
        cbo_1st_naghanap_trabaho = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_naghanap_trabaho);
        cbo_1st_hindinaghanap = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_hindinaghanap);
        cbo_1st_hulingnaghanap = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_hulingnaghanap);
        cbo_1st_available = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_available);
        cbo_1st_willing = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_willing);
        cbo_1st_saannagaral_kasanayan = (MaterialBetterSpinner) view.findViewById(R.id.cbo_1st_saannagaral_kasanayan);

        text_24 = (TextView) view.findViewById(R.id.text_24);
        text_28 = (TextView) view.findViewById(R.id.text_28);
        text_29 = (TextView) view.findViewById(R.id.text_29);
        text_32 = (TextView) view.findViewById(R.id.text_32);
        text_33 = (TextView) view.findViewById(R.id.text_33);

        txt_1st_miyembro.setSelectAllOnFocus(true);



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
        this.cpar.setDropdown(R.id.cbo_1st_nagaaralba, R.array.oo_hindi_nataposna, "Select One");
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
        this.cpar.setEditText(R.id.txt_1st_gaanokatagal);
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
                                                                    String NewDate = date;
                                                                    txt_kapanganakan.setText(NewDate);



                                                                    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                                                                    int current_year = calendar.get(Calendar.DATE);


                                                                    try {
                                                                        txt_1st_edad.setText(getAge(year, (monthOfYear + 1), dayOfMonth));
                                                                        int age = Integer.valueOf(getAge(year, (monthOfYear + 1), dayOfMonth));



                                                                        if (age < 3)
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.INVISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.INVISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.INVISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.INVISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.INVISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.INVISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.INVISIBLE); // 18

                                                                            cbo_1st_samahan.setVisibility(View.INVISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.INVISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.INVISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.INVISIBLE); // 20

                                                                            cbo_1st_botante.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.INVISIBLE); // 22
                                                                            cbo_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 23
                                                                            txt_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.INVISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.INVISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.INVISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.INVISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.INVISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.INVISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.INVISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.INVISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.INVISIBLE); // 33 

                                                                        }
                                                                         else //(age >= 3)
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.VISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.VISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.VISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.VISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.VISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.VISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.VISIBLE); // 18

                                                                            cbo_1st_samahan.setVisibility(View.VISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.VISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.VISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.VISIBLE); // 20

                                                                            cbo_1st_botante.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.VISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.VISIBLE); // 22
                                                                            cbo_1st_hanapbuhay.setVisibility(View.VISIBLE); // 23
                                                                            txt_1st_hanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.VISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.VISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.VISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.VISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.VISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.VISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.VISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.VISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.VISIBLE); // 33 
                                                                        }


                                                                         if (age < 10 && age >= 3 )
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.VISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.VISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.VISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.VISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.VISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.VISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.VISIBLE); // 18

                                                                            cbo_1st_samahan.setVisibility(View.INVISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.INVISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.INVISIBLE); // 20                                                            
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.INVISIBLE); // 20
                                                                            cbo_1st_botante.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.INVISIBLE); // 22
                                                                            cbo_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 23
                                                                            txt_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.INVISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.INVISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.INVISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.INVISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.INVISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.INVISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.INVISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.INVISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.INVISIBLE); // 33
                                                                        }
                                                                     /*   if (age >= 10 && age >= 3)
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.INVISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.INVISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.INVISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.INVISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.INVISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.INVISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.INVISIBLE); // 18

                                                                            cbo_1st_samahan.setVisibility(View.VISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.VISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.VISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.VISIBLE); // 20

                                                                            cbo_1st_botante.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.VISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.VISIBLE); // 22
                                                                            cbo_1st_hanapbuhay.setVisibility(View.VISIBLE); // 23
                                                                            txt_1st_hanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.VISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.VISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.VISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.VISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.VISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.VISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.VISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.VISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.VISIBLE); // 33
                                                                        }
                                                                        */

                                                                         if (age <  17 && age >= 15 )
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.VISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.VISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.VISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.VISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.VISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.VISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.VISIBLE); // 18
                                                                            cbo_1st_samahan.setVisibility(View.VISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.VISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.VISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.VISIBLE); // 20

                                                                            cbo_1st_botante.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.INVISIBLE); // 22

                                                                            cbo_1st_hanapbuhay.setVisibility(View.VISIBLE); // 23
                                                                            txt_1st_hanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.VISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.VISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.VISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.VISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.VISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.VISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.VISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.VISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.VISIBLE); // 33
                                                                        }

                                                                        /*
                                                                        else // if (age >= 17)
                                                                        {
                                                                            cbo_1st_botante.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.VISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.VISIBLE); // 22

                                                                            cbo_1st_nagaaralba.setVisibility(View.INVISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.INVISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.INVISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.INVISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.INVISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.INVISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.INVISIBLE); // 18
                                                                            cbo_1st_samahan.setVisibility(View.INVISIBLE); // 19                                                             
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.INVISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.INVISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.INVISIBLE); // 20
                                                                        }
                                                                        */

                                                                         if (age <  15 && age >= 10)
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.VISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.VISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.VISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.VISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.VISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.VISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.VISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.VISIBLE); // 18
                                                                            cbo_1st_samahan.setVisibility(View.VISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.VISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.VISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.VISIBLE); // 20

                                                                            cbo_1st_botante.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.INVISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.INVISIBLE); // 22
                                                                            cbo_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 23

                                                                            txt_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.INVISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.INVISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.INVISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.INVISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.INVISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.INVISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.INVISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.INVISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.INVISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.INVISIBLE); // 33

                                                                        }
                                                                        /*
                                                                         if (age >= 15)
                                                                        {
                                                                            cbo_1st_nagaaralba.setVisibility(View.INVISIBLE); // 13
                                                                            cbo_1st_kungnagaaral.setVisibility(View.INVISIBLE); // 14
                                                                            cbo_1st_kunghindinagaaral.setVisibility(View.INVISIBLE); // 15
                                                                            txt_1st_ibapa_hindinagaral.setVisibility(View.INVISIBLE); // 15
                                                                            cbo_1st_natapos.setVisibility(View.INVISIBLE); // 16
                                                                            txt_1st_specifynatapos.setVisibility(View.INVISIBLE); // 16
                                                                            cbo_1st_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            txt_1st_ibapa_kasanayan.setVisibility(View.INVISIBLE); // 17
                                                                            cbo_1st_saannagaral_kasanayan.setVisibility(View.INVISIBLE); // 18
                                                                            cbo_1st_samahan.setVisibility(View.INVISIBLE); // 19
                                                                            txt_1st_pangalan_organisasyon.setVisibility(View.INVISIBLE); // 20
                                                                            cbo_1st_klasengsamahan.setVisibility(View.INVISIBLE); // 20
                                                                            txt_1st_ibapa_klasengsamahan.setVisibility(View.INVISIBLE); // 20

                                                                            cbo_1st_botante.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_saanrehistrado.setVisibility(View.VISIBLE); // 21
                                                                            txt_1st_ibapa_rehistrado.setVisibility(View.VISIBLE); // 21
                                                                            cbo_1st_bumoto.setVisibility(View.VISIBLE); // 22
                                                                            cbo_1st_hanapbuhay.setVisibility(View.VISIBLE); // 23
                                                                            txt_1st_hanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            cbo_1st_uringhanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_other_pangunahinghanapbuhay.setVisibility(View.VISIBLE); // 24
                                                                            txt_1st_saangnegosyo.setVisibility(View.VISIBLE);  // 25
                                                                            cbo_1st_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            txt_1st_others_uringnegosyo.setVisibility(View.VISIBLE); // 25
                                                                            cbo_1st_katayuan_trabaho.setVisibility(View.VISIBLE);  // 26
                                                                            cbo_1st_uringmanggagawa .setVisibility(View.VISIBLE); // 27
                                                                            cbo_1st_naghanap_trabaho .setVisibility(View.VISIBLE);   // 28
                                                                            cbo_1st_hakbang.setVisibility(View.VISIBLE);   // 29
                                                                            txt_1st_ibapa_hakbang.setVisibility(View.VISIBLE); // 29
                                                                            cbo_1st_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            txt_1st_ibapa_hindinaghanap.setVisibility(View.VISIBLE); // 30
                                                                            cbo_1st_hulingnaghanap.setVisibility(View.VISIBLE);  // 31
                                                                            cbo_1st_available.setVisibility(View.VISIBLE); // 32
                                                                            cbo_1st_willing.setVisibility(View.VISIBLE); // 33
                                                                        }
                                                                        */






                                                                    } catch (Exception xx) {
                                                                    }
                                                                }
                                                            }, mYear, mMonth, mDay);
                                                    dpd.show();
                                                }
                                            }
        );

        chk_1st_puno.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_1st_puno.isChecked())
                {
                    cbo_1st_relasyon.setText("Puno");
                }
                else
                {
                    cpar.setDropdown(R.id.cbo_1st_relasyon, R.array._1st_relasyon, "Select One");
                }
            }
        });

        cbo_1st_relasyon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 10 || position == 8) {

                    txt_1st_ibapa_miyembro.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_ibapa_miyembro.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbo_1st_relihiyon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 5 || i == 6) {
                    txt_1st_ibapa_relihiyon.setVisibility(View.VISIBLE);
                } else {
                    txt_1st_ibapa_relihiyon.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbo_1st_wika.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 5) {
                    txt_1st_ibapa_wika.setVisibility(View.VISIBLE);
                } else {
                    txt_1st_ibapa_wika.setVisibility(View.INVISIBLE);
                }
            }
        });

        cbo_1st_nagaaralba.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // hindi
                 {
                    cbo_1st_kungnagaaral.setVisibility(View.INVISIBLE); // 14
                    cbo_1st_kunghindinagaaral.setVisibility(View.VISIBLE); // 15

                } else if (i == 2) // nakatapos na
                {
                    cbo_1st_kungnagaaral.setVisibility(View.INVISIBLE); // 14
                    cbo_1st_kunghindinagaaral.setVisibility(View.INVISIBLE); // 15
                }
                else // oo
                {                   
                    cbo_1st_kungnagaaral.setVisibility(View.VISIBLE); // 14
                    cbo_1st_kunghindinagaaral.setVisibility(View.INVISIBLE); // 15
                }
            }
        });


        cbo_1st_natapos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               
                if (i == 24 || i == 29 || i == 30 || i == 32){
                    txt_1st_specifynatapos.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_specifynatapos.setVisibility(View.INVISIBLE);

                }
            }
        });

        cbo_1st_kasanayan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 6) {
                    txt_1st_ibapa_kasanayan.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_ibapa_kasanayan.setVisibility(View.INVISIBLE);

                }
            }
        });

        cbo_1st_samahan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // wala
                {
                    txt_1st_pangalan_organisasyon.setVisibility(View.INVISIBLE);
                    cbo_1st_klasengsamahan.setVisibility(View.INVISIBLE);
                } else {
                    txt_1st_pangalan_organisasyon.setVisibility(View.VISIBLE);
                    cbo_1st_klasengsamahan.setVisibility(View.VISIBLE);
                }
            }
        });

        cbo_1st_klasengsamahan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 10) // ibapa
                {
                    txt_1st_ibapa_klasengsamahan.setVisibility(View.VISIBLE);
                } else {
                    txt_1st_ibapa_klasengsamahan.setVisibility(View.INVISIBLE);
                }
            }
        });


        cbo_1st_botante.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // hindi
                {
                    cbo_1st_saanrehistrado.setVisibility(View.INVISIBLE);
                    cbo_1st_bumoto.setVisibility(View.INVISIBLE);
                    txt_1st_ibapa_rehistrado.setVisibility(View.INVISIBLE);
                } else {
                    cbo_1st_saanrehistrado.setVisibility(View.VISIBLE);
                    cbo_1st_bumoto.setVisibility(View.VISIBLE);
                    txt_1st_ibapa_rehistrado.setVisibility(View.VISIBLE);
                }
            }
        });


        cbo_1st_saanrehistrado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1) // iba pa
                {
                    txt_1st_ibapa_rehistrado.setVisibility(View.VISIBLE);
                } else {
                    txt_1st_ibapa_rehistrado.setVisibility(View.INVISIBLE);
                }
            }
        });


        cbo_1st_kunghindinagaaral.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 3 ) {
                    txt_1st_ibapa_hindinagaral.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_ibapa_hindinagaral.setVisibility(View.INVISIBLE);

                }
            }
        });



        cbo_1st_uringhanapbuhay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 10 ) {
                    txt_1st_other_pangunahinghanapbuhay.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_other_pangunahinghanapbuhay.setVisibility(View.INVISIBLE);

                }
            }
        });



        cbo_1st_uringnegosyo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 18 ) {
                    txt_1st_others_uringnegosyo.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_others_uringnegosyo.setVisibility(View.INVISIBLE);

                }
            }
        });


        cbo_1st_hakbang.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 5 ) {
                    txt_1st_ibapa_hakbang.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_ibapa_hakbang.setVisibility(View.INVISIBLE);

                }
            }
        });



        cbo_1st_hindinaghanap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 11 ) {
                    txt_1st_ibapa_hindinaghanap.setVisibility(View.VISIBLE);

                } else {
                    txt_1st_ibapa_hindinaghanap.setVisibility(View.INVISIBLE);

                }
            }
        });



        cbo_1st_hanapbuhay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1 ) { // wala 

                    text_24.setVisibility(View.INVISIBLE); // 24
                    txt_1st_hanapbuhay.setVisibility(View.INVISIBLE); // 24
                    cbo_1st_uringhanapbuhay.setVisibility(View.INVISIBLE); // 24
                    txt_1st_other_pangunahinghanapbuhay.setVisibility(View.INVISIBLE); // 24
                    txt_1st_saangnegosyo.setVisibility(View.INVISIBLE);  // 25
                    cbo_1st_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                    txt_1st_others_uringnegosyo.setVisibility(View.INVISIBLE); // 25
                    cbo_1st_katayuan_trabaho.setVisibility(View.INVISIBLE); // 26
                    cbo_1st_uringmanggagawa.setVisibility(View.INVISIBLE); // 27

                    text_28.setVisibility(View.VISIBLE); //28
                    cbo_1st_naghanap_trabaho.setVisibility(View.VISIBLE); // 28
                    text_29.setVisibility(View.VISIBLE); // 29
                    cbo_1st_hakbang.setVisibility(View.VISIBLE); // 29
                    txt_1st_ibapa_hakbang.setVisibility(View.VISIBLE); // 29
                    cbo_1st_hindinaghanap.setVisibility(View.VISIBLE); // 30
                    txt_1st_ibapa_hindinaghanap.setVisibility(View.VISIBLE); // 30
                    cbo_1st_hulingnaghanap.setVisibility(View.VISIBLE); // 31
                    text_32.setVisibility(View.VISIBLE); //32
                    cbo_1st_available.setVisibility(View.VISIBLE); // 32
                    text_33.setVisibility(View.VISIBLE); //33
                    cbo_1st_willing.setVisibility(View.VISIBLE); // 33
                }
                else {
                    text_24.setVisibility(View.VISIBLE); // 24
                    txt_1st_hanapbuhay.setVisibility(View.VISIBLE); // 24
                    cbo_1st_uringhanapbuhay.setVisibility(View.VISIBLE); // 24
                    txt_1st_other_pangunahinghanapbuhay.setVisibility(View.VISIBLE); // 24
                    txt_1st_saangnegosyo.setVisibility(View.VISIBLE);  // 25
                    cbo_1st_uringnegosyo.setVisibility(View.VISIBLE); // 25
                    txt_1st_others_uringnegosyo.setVisibility(View.VISIBLE); // 25
                    cbo_1st_katayuan_trabaho.setVisibility(View.VISIBLE); // 26
                    cbo_1st_uringmanggagawa.setVisibility(View.VISIBLE); // 27
                    text_28.setVisibility(View.INVISIBLE); //28
                    cbo_1st_naghanap_trabaho.setVisibility(View.INVISIBLE); // 28
                    text_29.setVisibility(View.INVISIBLE); // 29
                    cbo_1st_hakbang.setVisibility(View.INVISIBLE); // 29
                    txt_1st_ibapa_hakbang.setVisibility(View.INVISIBLE); // 29
                    cbo_1st_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                    txt_1st_ibapa_hindinaghanap.setVisibility(View.INVISIBLE); // 30
                    cbo_1st_hulingnaghanap.setVisibility(View.INVISIBLE); // 31
                    text_32.setVisibility(View.INVISIBLE); //32
                    cbo_1st_available.setVisibility(View.INVISIBLE); // 32
                    text_33.setVisibility(View.INVISIBLE); //33
                    cbo_1st_willing.setVisibility(View.INVISIBLE); // 33

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
        this.cpar.putEditText(R.id.txt_1st_gaanokatagal);
        this.cpar.putDropdown(R.id.cbo_1st_nagaaralba);
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