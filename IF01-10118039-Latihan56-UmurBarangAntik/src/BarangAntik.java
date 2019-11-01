/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk menentukan umur suatu barang antik    
 */

/**
 *
 * @author Fatahillah Seno
 */
public class BarangAntik {

    protected int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }

    public void tampilUmur() {
        System.out.printf("Umur barang antik ini adalah\t: %d tahun%n", umur);
    }
}
