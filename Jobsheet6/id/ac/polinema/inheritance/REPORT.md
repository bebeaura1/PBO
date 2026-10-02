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