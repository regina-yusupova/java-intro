package com.yusupova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Doctor dentist = new Dentist("Зубнов Иннокентий Петрович", 30);
        Doctor therapist = new Therapist("Леонова Инна Иосифовна", 10);
        Doctor surgeon = new Surgeon("Иванова Иванна Ивановна", 15);

        System.out.println(surgeon.getName());
        surgeon.changeName("Петрова Иванна Ивановна");
        System.out.println(surgeon.getName());

        Doctor[] doctors = {dentist, therapist, surgeon};
        for (Doctor doctor : doctors) {
            doctor.introduce();
            doctor.getDailySalary(6);
        }

        List<Operate> operateArrayList = new ArrayList<>();
        operateArrayList.add(new Dentist("Миронова П.Р."));
        operateArrayList.add(new Surgeon("Журов Ю.З."));
        for (Operate operate : operateArrayList) {
            operate.doOperation();
        }

        System.out.println("Количество оперирующих врачей: " + operateArrayList.size());

        Map<Integer, Doctor> doctorsMap = new HashMap<>();
        doctorsMap.put(1, dentist);
        doctorsMap.put(2, therapist);
        doctorsMap.put(3, surgeon);
        for (Map.Entry<Integer, Doctor> item : doctorsMap.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
