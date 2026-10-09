|  | Pemrograman Berbasis Objek |
|--|--|
| NIM |  254107020062|
| Nama | Aura Bintang Aprilian |
| Kelas | TI - 2G |
| Repository | [link] (https://github.com/bebeaura1/PBO/tree/main/Jobsheet7) |

# Overloading dan Overriding

## - Percobaan 1:  Overloading Method (Perkalian)
Untuk hasil running program pada percobaan 1 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 3 :<br>
<img src="img/percobaan1/perc1langkah3.png" width="300px"><br>
- Langkah 5 :<br>
    - Eror 1<br>
    <img src="img/percobaan1/perc1eror1.png" width="400px"><br>
    - Eror 2<br>
    <img src="img/percobaan1/perc1eror2.png" width="600px"><br>
    - Hasil<br>
    <img src="img/percobaan1/perc1langkah5.png" width="600px"><br><br>
        ```
        +----------------------------------------------------------------+
        | Tambahan pada class Perkalian       | Hasil                    |
        |-------------------------------------|--------------------------|
        | public long kali(int a, int b){     | Pesan error : Duplicate  |
        |       return (long) a * b;          | method kali(int, int)    |
        | }                                   | in type Perkalian        |
        |-------------------------------------|--------------------------|
        | public int kali(int x, int y){      | Pesan error : Duplicate  |
        |       return x * y;                 | method kali(int, int)    |
        | }                                   | in type Perkalian        |
        |-------------------------------------|--------------------------|
        | Pada MainPercobaan1:                | Output : 12.5, 6, 6.0    |
        | p.kali(5, 2.5), p.kali(2, 3),       |                          |
        |  p.kali(2.0, 3)                     |                          |
        +----------------------------------------------------------------+
        ```

**Jawaban Pertanyaan Percobaan 1** <br>
1. - Method kali(...) di overload menjadi tiga versi dengan pembeda pada jumlah dan tipe parameter : kali(int, int), kali(int, int, int), dan kali(double, double).
    - Method tampilkan(...) di overload menjadi dua versi dengan pembeda pada urutan tipe parameter : tampilkan(int, String) dan tampilkan(String, int).
2. Versi yang dipanggil adalah kali(double, double). Alasannya karena argumen yang dikirimkan berupa angka desimal (double), sehingga compiler mencocokkan parameter yang tipe datanya sama persis<br>
3. Karena compiler membedakan method berdasarkan jumlah, tipe, dan urutan parameter. Nama variabel parameter dan tipe kembalian tidak ikut dicatat oleh compiler saat melakukan resolusi pemanggilan method.<br>
4. Karena terjadi proses pelebaran tipe data otomatis. Nilai 5 yang bertipe int diperlebar secara otomatis oleh compiler menjadi double agar cocok dengan method kali(double, double)<br>

## - Percobaan 2:  Overloading Method (Perkalian)
Untuk hasil running program pada percobaan 2 pada beberapa langkah yaitu seperti dibawah ini.<br>
- Langkah 2 :<br>
    - Perkiraan
        ```
        +----------------------------------------+
        | Pemanggilan                | Hasil     |
        |----------------------------|-----------|
        | tampil(5)                  | 5         |
        | tampil(5L)                 | 5         |
        | tampil(Integer.valueOf(7)) | 7         |
        | tampil(3.5)                | 3.5       |
        | tampil("Java")             | Java      |
        | tampil()                   | 0         |
        | tampil(1, 2, 3)            | 3         |
        +----------------------------------------+
        ```
    - Hasil<br>
    <img src="img/percobaan2/perc2langkah2.png" width="300px"><br>