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
    <img src="img/percobaan1/perc1langkah5.png" width="600px"><br>
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