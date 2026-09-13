|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheet4) |

# Relasi Kelas: Aggregation, Composition, dan Dependency

## - Percobaan 1: Aggregation Satu-ke-Satu (Laptop dan Processor)
Untuk hasil running program pada percobaan 1 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 8 :<br>
<img src="img/perc1langkah8.png" width="200px"><br>
- Langkah 9 :<br>
<img src="img/perc1langkah9.png" width="200px"><br>
- Langkah 10 :<br>
<img src="img/perc1langkah10.png" width="200px"><br>

**Jawaban Pertanyaan Percobaan 1** <br>
1. Gunanya method setter adalah untuk mengubah dan memberikan set nilai baru ke dalam atribut tersebut. Sedangkan method getter gunanya adalah untuk mengambil nilai dari suatu atribut private.<br>
2. Konstruktor default digunakan ketika kita ingin membuat objek terlebih dahulu dalam keadaan kosong dimana nilai atributnya baru akan diisi belakangan menggunakan method setter. Sedangkan konstruktor berparameter digunakan ketika kita ingin membuat objek sekaligus langsung memberikan nilai awal pada atribut atributnya dalam satu baris perintah secara instan.<br>
3. Atribut yang bertipe objek adalah proc. Baris kode yang menunjukkan relasi tersebut adalah baris deklarasi atribut (5) didalam Laptop.java --> private Processor proc;<br>
4. Sintaks proc.info() berfungsi untuk melakukan delegasi. Kelas Laptop tidak mencetak detail atau informasi tentang processor secara mandiri, tapi menyuruh objek proc dari kelas Processor untuk menjalankan method info() miliknya sendiri.<br>
5. Tidak, keduanya menghasilkan output yang sama persis. Hal ini karena penentuan jenis relasi tidak bergantung pada dimana objek dibuat. Yang menentukan adalah kelas mana yang memanggil instansiasi new Processor(..). Pada kedua langkah tersebut objek Processor dibuat didalam kelas MainPercobaan1 bukan dibuat didalam kode kelas Laptop itu sendiri.<br>
6. Secara kode, relasi tersebut termasuk Aggregation. Bukti baris kodenya dapat dilihat pada konstruktor berparameter dikelas Laptop yang menerima objek Processor di luar sebagai parameter serta pada method setternya. 
<img src="img/perc1bukti1.png" width="200px"><br>
serta pada method setter<br>
<img src="img/perc1bukti2.png" width="200px"><br>
Objek Processor diciptakan di luar kelas Laptop (oleh MainPercobaan1) lalu di-inject ke dalam Laptop.<br>
7. Tidak, relasi tersebut berubah menjadi Composition. Alasannya adalah karena objek Processor diciptakan secara mandiri didalam konstruktor kelas Laptop itu sendri menggunakan new Processor ("Generic", 1), bukan diterima sebagai parameter dari luar.Hal ini itu menunjukkan ikatan siklus hidup yang kuat, dimana kalau objek Laptop dihapus, maka objek Processor didalamnya juga akan ikut hilang.<br><br>


## - Percobaan 2: Aggregation dengan Relasi Ganda (Rental Mobil)
Untuk hasil running program pada percobaan 2 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 6 :<br>
<img src="img/perc2langkah6.png" width="200px"><br>
- Langkah 7 :<br>
<img src="img/perc2langkah7.png" width="200px"><br>

**Jawaban Pertanyaan Percobaan 2**
1. Baris kode yang menunjukkan relasi tersebut adalah bagian deklarasi atribut di dalam kelas Pelanggan.java <br>
<img src="img/perc2bukti1.png" width="200px"><br><br>
2. Karena kelas Mobil dan Sopir tidak memiliki atribut hari, sehingga mereka tidak mengetahui berapa lama durasi penyewaan tersebut. Nilai hari harus dikirimkan dari luar agar kelas Mobil dan Sopir dapat menghitung total biaya berdasarkan durasi harinya.<br>
3. Perintah tersebut digunakan untuk melakukan delegasi, di mana kelas Pelanggan tidak menghitung biayanya sendiri, melainkan "menyuruh" objek mobil dan objek sopir untuk menghitung biaya masing-masing berdasarkan jumlah hari sewa.<br>
4. Sintaks tersebut digunakan untuk melakukan setter injection, yaitu memasukkan atau menghubungkan objek m dan s yang sudah dibuat di luar ke dalam atribut relasi yang ada di dalam objek Pelanggan p<br>
5. Proses ini digunakan untuk menjumlahkan hasil perhitungan biaya sewa mobil dan biaya sopir selama jangka waktu tertentu, lalu mengembalikan nilai total biaya keseluruhan yang harus dibayar oleh pelanggan.<br>
6. Urutan eksekusinya adalah method p.getMobil() dieksekusi terlebih dahulu, yang mengembalikan sebuah objek Mobil yang sedang dipegang oleh pelanggan p, kemudian setelah objek Mobil tersebut didapatkan, method .getMerk() dipanggil langsung pada objek Mobil tersebut untuk mengambil dan mengembalikan nilai atribut merek mobil yaitu berupa Sting "Avanza"<br>
7. Error yang akan muncul adalah NullPointerException. Karena p.setMobil tidak pernah dipanggil, variabel atribut mobil di dalam objek Pelanggan belum pernah diisi dengan objek Mobil yang sah (nilainya masih default yaitu null). Ketika program mencoba menjalankan mobil.hitungBiayaMobil(hari), itu sama saja seperti mencoba mengakses method pada kekosongan alias null, sehingga Java menghentikan program dan memunculkan NullPointerException.<br><br>


## - Percobaan 3: Aggregation dengan Dua Role ke Kelas yang Sama (Kereta Api)
Untuk hasil running program pada percobaan 3 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 6 :<br>
<img src="img/perc3langkah6.png" width="200px"><br>