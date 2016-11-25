package com.example.dinasaad.medication;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

/**
 * Created by Dina Saad on 03-Nov-16.
 */
public interface  MedicineHandler {
    public void addToMedicineList(Medicine m) throws Exception;
    public void deleteFromMedicineList(Medicine m) throws Exception;
    public ArrayList<Medicine> getChosenMedicine() throws JSONException;
    public int findIndex(JSONArray ar, Medicine m) throws JSONException;
    boolean foundInMedicineList(JSONArray ar, Medicine m) throws JSONException;
}
