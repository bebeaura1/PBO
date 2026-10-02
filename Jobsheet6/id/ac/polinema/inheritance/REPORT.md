|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheet6) |

# Inheritance (Pewarisan)

## - Percobaan 1: Single Inheritance dengan extends (ClassA dan ClassB)
Untuk hasil running program pada percobaan 1 pada langkah 7 yaitu seperti dibawah ini.<br>
<img src="img/perc1.png" width="200px"><br>

**Jawaban Pertanyaan Percobaan 1** <br>
1. Karena pada awalnya ClassB belum diturunkan dari ClassA (extends ClassA belum ditulis), sehingga atribut x dan y tidak dikenal di dalam ClassB<br>
2. Baris kode yg diubah adalah baris ke 3 diclass ClassB. Deklarasi class diubah menjadi public class ClassB extends ClassA. Artinya, ClassB bertindak sebagai subclass dan ClassA bertindak sebagai superclass, sehingga seluruh atribut/method non-private di ClassA diwarisi oleh ClassB.<br>
3. Atribut dan method yang dapat dipakai oleh objek hitung:<br>
    - Dideklarasikan di ClassA: Atribut x, y, dan method getNilai().
    - Dideklarasikan di ClassB: Atribut z, method getNilaiZ(), dan getJumlah().<br>
4. Karena ClassB mewarisi atribut x dari ClassA melalui mekanisme pewarisan<br>
5. Atribut dapat diakses dan diubah secara langsung dari luar class tanpa kontrol validasi<br>
6. Terjadi error kompilasi karena Java tidak mendukung multiple inheritance. Java hanya mengizinkan satu superclass langsung untuk setiap class<br>
<img src="img/perc1soalno6.png" width="500px"><br>

## - Percobaan 2: Single Inheritance dengan extends (ClassA dan ClassB)
Untuk hasil running program percobaan 2 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 6 :<br>
<img src="img/perc2langkah6.png" width="200px"><br>
- Langkah 7 :<br>
<img src="img/perc2langkah7.png" width="200px"><br>

**Jawaban Pertanyaan Percobaan 2** <br>
1. Error muncul di file ClassB.java pada baris method getJumlah() dengan pesan :<br>
<img src="img/perc2soalno1.png" width="500px"><br>
Error tidak muncul di MainPercobaan2 karena main memanggil method setX() dan setY() yang bersifat public.<br>

2. Penyebab error: Atribut berhak akses private tidak diwariskan ke subclass, sehingga tidak bisa diakses secara langsung di dalam ClassB<br>
3. Karena method setX() dideklarasikan sebagai public di dalam ClassA dan diwariskan ke ClassB. Nilai x tersebut disimpan di dalam memori objek ClassB bagian dari ClassA.<br>
4. Perbaikan B lebih disarankan untuk program nyata karena menerapkan prinsip encapsulation yaitu menyembunyikan data internal class dan mengontrol aksesnya lewat method getter/setter<br>
5. Atribut protected tetap bisa diakses oleh subclass di package berbeda. Namun, jika atribut berstatus default tanpa modifier, subclass di beda package tidak dapat mengaksesnya.<br>