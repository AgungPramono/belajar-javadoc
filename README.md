# Menulis Java Documentation

 ### Javadoc?
 
 javadoc itu merupakan dokumentasi dari class-class java, dokumentasi nya berisikan seluruh class, interface, dan metode-metode yang terdapat di dalamnya
 
 ### Mengapa membuat javadoc?
 
 Agar orang kita & orang lain tahu dengan maksud & tujuan kode yang ditulis & mempermudah penggunaan class bagi pihak lain yang mau menggunakan atau juga sebagai dokumentasi pribadi kalo-kalo kita lupa fungsi dari class-class yang telah kita buat
 
 ### Dimana menulis javadoc?
 
 biasanya javadoc itu berada sebelum deklarasi class, metode atau property, contoh :
 
 ```java
    /**
     *  BACA DENGAN TELITI !!!
     *
     *  Anda boleh menggunakan, mengubah, menghapus, menambah, dan
     *  melakukan hal yang anda inginkan ke dalam source code ini.
     *
     *  Dan saya tidak bertanggung jawab atas kesalahan,
     *  bug, atau keanehan yang ada dalam source code ini, dan
     *  saya juga TIDAK MENERIMA PERTANYAAN dari Anda
     *  mengenai isi source code ini.
     *
     *  Semoga source code ini bermanfaat bagi Anda, dan juga
     *  bermanfaat bagi project yang sedang Anda buat.
     *
     *  Salam saya, Agung Pramono
     *  
     *  Dibuat Tanggal : 2019 Sept 8
     */
    package echo.gokil.my.bean;
     
    import java.io.Serializable;
     
    /**
     * Alamat merupakan representasi dari Alamat orang class ini digunakan oleh
     * class Orang sebagai Alamat tempat tinggal orang yang bersangkutan
     * 
     * @author echo
     */
    public class Alamat implements Serializable {
     
        /**
         * jalan alamat
         */
        private String jalan;
        /**
         * kodepos alamat
         */
        private String kodePos;
        /**
         * kota alamat
         */
        private String kota;
        /**
         * negara alamat
         */
        private String negara;
     
        /**
         * membaut Alamat baru tanpa parameter
         */
        public Alamat() {
            // TODO Auto-generated constructor stub
        }
     
        /**
         * mendapatkan jalan alamat
         * @return jalan
         */
        public String getJalan() {
            return jalan;
        }
     
        /**
         * mengubah nilai jalan alamat
         * @param jalan
         *             jalan yang baru
         */
        public void setJalan(String jalan) {
            this.jalan = jalan;
        }
     
        /**
         * mendapatkan kodepos alamat
         * @return kodePos
         */
        public String getKodePos() {
            return kodePos;
        }
     
        /**
         * mengubah nilai kodepos alamat
         * @param kodePos
         *             kodepos yang baru
         */
        public void setKodePos(String kodePos) {
            this.kodePos = kodePos;
        }
     
        /**
         * mendapatkan kota alamat
         * @return the kota
         */
        public String getKota() {
            return kota;
        }
     
        /**
         * mengubah nilai kota alamat
         * @param kota
         *             kota yang baru
         */
        public void setKota(String kota) {
            this.kota = kota;
        }
     
        /**
         * mendapatkan negara alamat
         * @return the negara
         */
        public String getNegara() {
            return negara;
        }
     
        /**
         * mengubah nilai negara alamat
         * @param negara
         *             negara yang baru
         */
        public void setNegara(String negara) {
            this.negara = negara;
        }
     
    } 
```
 ## Tag-tag Javadoc
 
 |  Tag         |  Fungsi                                                                       |
 |--------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
 | @author      |  Untuk mencantumkan nama penulis kode biasanya ditulis di leve class          |
 | @parameter   |  Mendefinisikan parameter yg akan dilewatkan dalam sebuah method              |
 | @return      |  Mendefinisikan nilai kembalian dari sebuah method                            |
 | @see         |  Menampilkan "See Also" dan juga untuk merefer ke kelas yang bersangkutan      |
 | @version     |  Menampilkan versi dari kode yang ditulis                                                                                                                                                                                                                            |
 | @throws      |  Mendefinisikan exception yg akan ditimubulan oleh sebuah method. Perhatikan bahwa kode Anda harus menunjukkan exception yang dilemparkan agar tag ini dapat divalidasi. Kalau tidak, Javadoc akan menghasilkan kesalahan.  ```@exception``` adalah tag alternatif.  |                                                           |
 | @Override    |  Melakukan pemeriksaan untuk melihat apakah metode ini mengoverride. biasanya digunakan untuk kelas abstract dan interface.                                                                                                                                          |
 | @since       |  Versi sejak fitur ditambahkan.                                                                                                                                                                                                                                      |                                                                            
 | {@link}      |  Digunakan untuk membuat tautan ke kelas atau metode lain. Contoh: {@link Foo # bar} tautan ke bilah metode milik kelas Foo. Untuk menautkan ke metode di kelas yang sama, cukup sertakan #bar.                                                                      |
 | @deprecated  |  Memungkinkan pengguna tahu kelas atau metode tidak lagi digunakan. Tag ini akan diposisikan secara langsung di Javadoc. Biasanya digunakan secara bersamaan dengan tag ```@see``` atau ```{@link}```.                                                               |

## Comment vs Javadoc

Sebuah comment biasanya ditulis sbb:

```
    // sample comment...
    
    /*
    sample comment
    */
```

javadoc tidak akan memproses komen seperti diatas. Agar dapat diproses maka komen harus ditulis sbb:

```
    /**
    *
    * comment javadoc
    *
    *
    */
```

## 