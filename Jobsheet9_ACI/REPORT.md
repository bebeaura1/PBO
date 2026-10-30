|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheet9_ACI) |

# Abstract Class dan Interface

## - Percobaan 1: Abstract Class
Untuk hasil running program pada percobaan 1 yaitu seperti dibawah ini.<br>
<img src="img/percobaan1/hasilP1.png" width="300px"><br>

**Jawaban Pertanyaan Percobaan 1** <br>
1. Program berjalan dengan membuat objek Kucing dan Ikan yang di masukkan ke dalam atribut hewanPeliharaan milik objek Orang melalui method peliharaHewan(). Ketika method ajakPeliharaanJalanJalan() dipanggil, Java menggunakan mekanisme polimorfisme dan Dynamic Method Dispatch. Pemanggilan this.hewanPeliharaan.bergerak() menghasilkan output yang berbeda karena variabel tersebut menunjuk pada tipe objek asli yang berbeda di memori saat runtime: Ani memelihara Kucing sehingga menjalankan versi bergerak() milik Kucing, sedangkan Budi memelihara Ikan sehingga menjalankan versi bergerak() milik Ikan.<br>
2. Hasil Error : Cannot instantiate the type Hewan<br>
<img src="img/percobaan1/soalno2.png" width="300px"><br>
Class Hewan dideklarasikan sebagai abstract class. Abstract class bersifat umum dan tidak dapat diinstansiasi secara langsung menggunakan kata kunci new. Ia hanya bisa diinisialisasi melalui objek dari subclass turunannya.<br>
3. Hasil Error :<br>
<img src="img/percobaan1/soalno3.png" width="300px"><br>
Setiap subclass biasa (konkret) yang menurunkan abstract class wajib meng-override dan mengisi semua abstract method yang ada di induknya. Jika tidak diisi, class tersebut harus ikut dicap sebagai class abstract.<br>
4. Hasil Error : Terjadi error kompilasi pada class Ikan karena gagal mengimplementasikan method abstract baru (bernapas()) yang diwariskan atau dideklarasikan.<br>
<img src="img/percobaan1/soalno4.png" width="300px"><br>
Aturan yang dilanggar adalah kewajiban subclass konkret untuk memenuhi semua kontrak abstract method dari induknya. Jika class Ikan ditambahkan method abstract baru di dalamnya atau di induknya tanpa di-override, maka Ikan melanggar aturan implementasi class non-abstract.<br><br>

## - Percobaan 2: Interface
Untuk hasil running program pada percobaan 2 yaitu seperti dibawah ini.<br>
- Sebelum diperbaiki :<br>
<img src="img/percobaan2/hasilP2_sebelum.png" width="400px"><br>
- Setelah diperbaiki :<br>
<img src="img/percobaan2/hasilP2_setelah.png" width="300px"><br>