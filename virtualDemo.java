public class virtualDemo {

    public static void main(String[] args) {

        Gaji s = new Gaji("wahyu", "KUBAR", 3, 5000.00);

        // upcasting
        Pegawai e = new Gaji("ini nama", "samarinda", 2, 2500.00);
        System.out.println("memanggil mailCheck berdasarkan referennsi gaji --> ");

        s.mailCheck();

        System.out.println("\nmemanggil mailCheck berdasarkan referensi pegawai -->");
        e.mailCheck();

        /*
         * hasil ouput "menyusun pegawai" 2x tampil, karena:
         * pertama kita membuat constructor objek dari class gaji, yang dimana
         * gaji merupakan turunan dari class pegawai, maka class gaji ini juga akan ikut
         * mengakses semua method yang ada di class pegawai, dan dikarenakan method
         * pegawai yang ada diclass pegawai tidak dirubah isinya pada class gaji, maka
         * dia akan tetap menampilkan menyusun pegawai.
         * 
         * lalu setelah membuat constructor objek dari class gaji, kita juga membuat
         * upcasting dari gaji dengan menggunakan tipe data pegawai, maka dia juga
         * mengakses method pegawai yang ada di class pegawai.
         * 
         * maka dari itu kalimat "menyusun pegawai" tampil 2x pada terminal.
         */
    }
}
