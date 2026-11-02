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

**Jawaban Pertanyaan Percobaan 2** <br>
1. Pesan error : The method beriSertifikatCumlaude(ICumlaude) in the type Rektor is not applicable for the arguments (Mahasiswa).<br>
Error terjadi karena objek mhsBiasa (bertipe Mahasiswa) dikirimkan ke parameter beriSertifikatCumlaude(ICumlaude mahasiswaCumlaude) dimana class Mahasiswa tidak meng-implements interface ICumlaude. Cara memperbaikinya adalah dengan menghapus atau memberi komentar pada baris pemanggilan pakRektor.beriSertifikatCumlaude(mhsBiasa); di class Program karena mahasiswa biasa tidak berhak mendapat sertifikat cumlaude.<br>
2. Bisa. Karena class Sarjana merupakan turunan dari class Mahasiswa, sehingga secara otomatis class Sarjana mewarisi seluruh atribut dan method publik/protected yang dimiliki oleh class Mahasiswa, termasuk method kuliahDiKampus().<br>
3. Tidak bisa secara langsung. Parameter mahasiswaCumlaude dideklarasikan bertipe interface ICumlaude. Di dalam interface ICumlaude, hanya terdapat kontrak method lulus() dan meraihIPKTinggi(). Compiler hanya mengenali anggota yang berasal dari tipe referensinya, dan interface ICumlaude tidak memiliki method kuliahDiKampus().<br>
4. Hasil error :<br>
<img src="img/percobaan2/hasilP2_setelah.png" width="300px"><br>
Semua method di dalam sebuah interface otomatis bersifat public. Ketika sebuah class mengimplementasikan interface tersebut, method hasil override pada class tidak boleh memperkecil hak aksesnya (harus tetap setara, yaitu public)<br><br>

## - Percobaan 3: Multiple Interface
Untuk hasil running program pada percobaan 3 yaitu seperti dibawah ini :<br>
- Sebelum diperbaiki :<br>
<img src="img/percobaan3/hasilP3_sebelum.png" width="400px"><br>
- Setelah diperbaiki :<br>
<img src="img/percobaan3/hasilP3_setelah.png" width="300px"><br>

**Jawaban Pertanyaan Percobaan 3** <br>
1. Hasil error : Cannot reduce the visibility of the inherited method from IBerprestasi<br>
<img src="img/percobaan3/soalno1.png" width="300px"><br>
Seluruh method didalam interface secara otomatis bersifat public. Interface dirancang sebagai kontrak terbuka untuk diakses dari luar, sehingga modifier akses selain public dilarang keras ditulis di dalam deklarasi method interface<br>
2. Baris tersebut error karena interface tidak memiliki constructor dan tidak dapat diinstansiasi secara langsung menggunakan kata kunci new. Objek hanya dapat dibuat melalui class yang mengimplementasikannya<br>
<img src="img/percobaan3/soalno2.png" width="300px"><br>
3. - Kode :<br>
    <img src="img/percobaan3/soalno3kode1.png" width="400px">
    <img src="img/percobaan3/soalno3kode2.png" width="400px"><br>
    - Hasil :<br>
    <img src="img/percobaan3/soalno3hasil.png" width="300px"><br><br>
    
## Tugas
1. 
    - Input :<br>
        - Class Binatang<br>
        <img src="img/tugas/binatang.png" width="500px"><br>
        - Class IHerbivora<br>
        <img src="img/tugas/iherbivora.png" width="500px"><br>
        - Class IKarnivora<br>
        <img src="img/tugas/ikarnivora.png" width="500px"><br>
        - Class Gorila<br>
        <img src="img/tugas/gorila.png" width="500px"><br>
        - Class Keledai<br>
        <img src="img/tugas/keledai.png" width="500px"><br>
        - Class Singa<br>
        <img src="img/tugas/singa.png" width="500px"><br>
        - Class MainTugas<br>
        <img src="img/tugas/main.png" width="500px"><br>
    - Output :<br>
    <img src="img/tugas/hasil.png" width="300px"><br><br>
    - UML :<br>
    <img src="img/tugas/uml.png" width="600px">