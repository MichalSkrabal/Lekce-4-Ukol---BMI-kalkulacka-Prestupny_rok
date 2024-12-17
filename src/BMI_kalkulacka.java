public class BMI_kalkulacka {
    public static void main(String[] args) {
        // Definování proměnných pro výšku (v metrech) a váhu (v kilogramech)
        double weight = 70.0; // Příklad: váha v kg
        double height = 1.75; // Příklad: výška v metrech

        // Kontrola, zda jsou vstupní hodnoty platné
        if (weight <= 0) {
            System.out.println("Chyba: Váha musí být větší než 0.");
            return; // Ukončení programu
        }
        if (height <= 0) {
            System.out.println("Chyba: Výška musí být větší než 0.");
            return; // Ukončení programu
        }

        // Výpočet BMI podle vzorce: BMI = váha / (výška * výška)
        double bmi = weight / (height * height);

        // Výpis hodnoty BMI
        System.out.printf("Vaše BMI je: %.2f\n", bmi);

        // Určení kategorie BMI
        if (bmi < 16.5) {
            System.out.println("Kategorie: Těžká podvýživa");
        } else if (bmi >= 16.5 && bmi < 18.5) {
            System.out.println("Kategorie: Podváha");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Kategorie: Ideální (zdravá) váha");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Kategorie: Nadváha");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Kategorie: Obezita prvního stupně");
        } else if (bmi >= 35 && bmi < 40) {
            System.out.println("Kategorie: Obezita druhého stupně");
        } else {
            System.out.println("Kategorie: Obezita třetího stupně (morbidní obezita)");
        }
    }
}
