package com.example.pemrograman_bhs;

import java.util.ArrayList;

public class BahasaData {
    private static String [] bahasaName = {
            "C",
            "C++",
            "Java",
            "Phyton",
            "PHP",
            "Javascript",
            "HTML",
            "CSS",
            "SQL"
    };

    private static String [] bahasaDetail = {
            "Bahasa Pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories. Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi." ,
            "Bahasa Pemrograman C++ adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs. Pada awal tahun 1970-an, bahasa itu merupakan peningkatan dari bahasa sebelumnya, yaitu B.",
            "Bahasa Pemrograman Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995.",
            "Bahasa Pemrograman Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan.",
            "Bahasa Pemrograman PHP atau Hypertext Preprocessor adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.",
            "Bahasa Pemrograman JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer, Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT.",
            "Bahasa Pemrograman HTML atau HyperText Markup Language adalah sebuah bahasa markup yang digunakan untuk membuat sebuah halaman web dan menampilkan berbagai informasi di dalam sebuah browser Internet.",
            "Bahasa Pemrograman CSS atau Cascading Style Sheets adalah suatu bahasa stylesheet yang digunakan untuk mengatur tampilan suatu dokumen yang ditulis dalam bahasa markup. Penggunaan yang paling umum dari CSS adalah untuk memformat halaman web yang ditulis dengan HTML dan XHTML. Walaupun demikian, bahasanya sendiri dapat dipergunakan untuk semua jenis dokumen XML termasuk SVG dan XUL. Spesifikasi CSS diatur oleh World Wide Web Consortium (W3C).",
            "Bahasa Pemrograman SQL atau Structured Query Language adalah sebuah bahasa yang dipergunakan untuk mengakses data dalam basis data relasional. Bahasa ini secara de facto merupakan bahasa standar yang digunakan dalam manajemen basis data relasional. Saat ini hampir semua server basis data yang ada mendukung bahasa ini untuk melakukan manajemen datanya."
    };

    private static int[] bahasaImage = {
            R.drawable.bahasa_c,
            R.drawable.c_plus,
            R.drawable.java,
            R.drawable.phyton,
            R.drawable.php,
            R.drawable.javascript,
            R.drawable.html,
            R.drawable.css,
            R.drawable.sql
    };

    static ArrayList<Bahasa> getListData(){
        ArrayList<Bahasa> list = new ArrayList<>();
        for (int position = 0; position <bahasaName.length; position++){
            Bahasa bahasa = new Bahasa();
            bahasa.setName(bahasaName[position]);
            bahasa.setDetail(bahasaDetail[position]);
            bahasa.setPhoto(bahasaImage[position]);
            list.add(bahasa);
        }
        return list;
    }

}
