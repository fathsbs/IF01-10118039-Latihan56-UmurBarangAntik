/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menentukan umur suatu barang antik  
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarangAntik rd;

        rd = new Radio(234);
        ((Radio) rd).setName("Radio AM");

        System.out.printf("Nama barang Antik\t\t: %s%n", ((Radio) rd).getName());
        ((Radio) rd).tampilUmur();
    }
}
